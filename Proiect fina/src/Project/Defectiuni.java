package Project;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//am realizat clasa Defectiuni

public class Defectiuni extends JFrame {
    private JPanel PanelSus;
    private JPanel PanelDreapta;
    private JLabel Nume;
    private JLabel Varsta;
    private JLabel Greutate;
    private JLabel Inaltime;
    private JLabel Cancere;
    private JTextField textNume;
    private JTextField textVarsta;
    private JTextField textMarca;
    private JTextField textSectia;
    private JButton CONECTAREButton;
    private JPanel PanelPrincipal;
    private JList list1;
    private JPanel PanelStanga;
    private JButton PacientNouButon;
    private JTextField textDefectiune;
    private JPanel compPanel;
    private JButton ButonSugestii;
    private ArrayList <Project> utilizator;
    private DefaultListModel listaUtilizatoriModel;

    Defectiuni(){

        super("Defectiuni");
        this.setContentPane(this.PanelPrincipal );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
//am utilizat un arraylist in care am pastrat toate defectiunile
        utilizator =new ArrayList<Project>();
        listaUtilizatoriModel=new DefaultListModel();
        list1.setModel(listaUtilizatoriModel);

// butonul de conectare are drept rol instantierea listei cu elemente scrise in campurile libere
        CONECTAREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Project p=new Project(
                        textNume.getText(),
                        textVarsta.getText(),
                        textMarca.getText(),
                        textSectia.getText(),
                        textDefectiune.getText()
                );
                utilizator.add(p);
                AcutualizareLista();
            }
        });


//acest buton are rolul de a  actualiza informatiile cu privire la reclamatiile deja existente in platforma
        PacientNouButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numardepacienti= list1.getSelectedIndex();
                if(numardepacienti>=0) {
                    Project p=utilizator.get(numardepacienti);
                    p.setNume(textNume.getText());
                    p.setVarsta(textVarsta.getText());
                    p.setMarca(textMarca.getText());
                    p.setSectia(textSectia.getText());
                    p.setDefectiune(textDefectiune.getText());
                    AcutualizareLista();

                }
            }
        });

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int numardepacienti= list1.getSelectedIndex();
                if (numardepacienti>=0){
                    Project p=utilizator.get(numardepacienti);
                    textNume.setText(p.getNume());
                    textVarsta.setText(p.getVarsta());
                    textMarca.setText(p.getMarca());
                    textSectia.setText(p.getSectia());
                    textDefectiune.setText(p.getDefectiune());
                    PacientNouButon.setEnabled(true);


                }
                else  PacientNouButon.setEnabled(false);

            }
        });
    }
    //funtia dedicata actualizarii listei
    public void AcutualizareLista(){
        listaUtilizatoriModel.removeAllElements();
        System.out.println("Sterge toti utilizatorii");
        for (Project p:utilizator) {
            System.out.println("Adauga persoana  la lista");
            listaUtilizatoriModel.addElement("Nume: "+p.getNume()+"; "+"Marca: "+p.getMarca()+"; "+"Defectiune: "+p.getDefectiune());


        }
    }
    //functia dedicata adaugarii unei noi defectiuni
    public  void addProject (Project u){
        utilizator.add(u);
        AcutualizareLista();

    }

    public static void main(String[] args) {
        Defectiuni d=new Defectiuni();
        d.setVisible(true);
        Project u1= new Project("Ana Popa", "20", "70B23", "TM1", "Inserare gresita in pin");
        Project u2= new Project("Maria Popa", "23", "74C34", "TM2", "Capat terminal defect");
        Project u3= new Project("Mariana Vasile", "53", "84A23", "Magazie", "Lipsa cutie 234C");
        Project u4= new Project("Flavia Andron", "45", "89F35", "Foaming", "Gromete defect");
        Project u5= new Project("Carmen Moldovan", "23", "66D#4", "TM2", "Inserare incompleta terminal");
        Project u6= new Project("Vasilica Mihaila", "53", "84F33", "Foaming", "Gromete lipsa");
        d.addProject(u1);
        d.addProject(u2);
        d.addProject(u3);
        d.addProject(u4);
        d.addProject(u5);
        d.addProject(u6);
// Utizare de ToString si StringBuffer
        String u=u1.toString();
        StringBuffer s = new StringBuffer(u);
        int l = s.length();
        System.out.println("Lungimea Numelui primului utilizator =" + l);

    }

}


