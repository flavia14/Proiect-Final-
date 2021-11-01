import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;


public class Vanzari_Form {
    private JPanel Main;
    private JButton cautabtn;
    private JButton ratebtn;
    private JButton stergebtn;
    private JButton cumparabtn;
    private JTextField marcatxt;
    private JTextField modeltxt;
    private JTextField versiunetxt;
    private JTextField prettxt;
    private JComboBox produslst;
    private JTextField garantietxt;
    private ArrayList<Produs> produse;


    public Vanzari_Form() {
        produse = new ArrayList<Produs>();
        produse.add(0, new Produs("Senzori sitem frânare", "DELPHI", "Senzor ABS", "SS20005", "4",66));
        produse.add(1, new Produs("Senzori parcare", "VALEO", "Senzori FAȚA-SPATE cu avertizare sonoră", "SQ632200", "3",327));
        produse.add(2, new Produs("Cablaje pentru oglinzi", "CNH", "Cablaj conectare oglindă", "RG2997387", "1",152));
        produse.add(3, new Produs("Cutii de viteze automate", "VW PASSAT", "DSG", "3C2 220864", "2",4500));
        produse.add(4, new Produs("Cutii de viteze manuale", "Audi A4 B8", "OGS", "0b1301103", "5",1500));

        produslst.setSelectedItem(null);

        stergebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null,"Ești sigur că vrei să ștergi toate datele introduse?" , "Question",
                        JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION){
                    marcatxt.setText("");
                    modeltxt.setText("");
                    versiunetxt.setText("");
                    garantietxt.setText("");
                    prettxt.setText("");

                    JLabel label = new JLabel("Datele au fost șterse!");
                    JOptionPane.showMessageDialog(null, label, "Atenție", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JLabel label = new JLabel("Datele NU au fost șterse!");
                    JOptionPane.showMessageDialog(null, label, "Atenție", JOptionPane.INFORMATION_MESSAGE);
                }

                System.out.println(result);
            }
        });

        ratebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pret = produse.get(produslst.getSelectedIndex()).getPret();
                int dobanda = 18;
                int nr_rate = 24;

                JLabel label = new JLabel("<html>Rată lunară (24 rate): " + String.format("%.2f", (1 + (double)dobanda / 100) * pret / nr_rate) + " lei <br> Preț total: " + String.format("%.2f", (1 + (double)dobanda / 100) * pret) + " lei <br> Dobânda: " + dobanda + "%");
                JOptionPane.showMessageDialog(null, label, "Rată lunară", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        cumparabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel("<html>Felicitări ! <br> Ai achiziționat "
                        + produse.get(produslst.getSelectedIndex()).getMarca() + " "
                        + produse.get(produslst.getSelectedIndex()).getModel() + " "+"!");
                JOptionPane.showMessageDialog(null, label, "Achiziționat", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        produslst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                marcatxt.setText(produse.get(produslst.getSelectedIndex()).getMarca());
                modeltxt.setText(produse.get(produslst.getSelectedIndex()).getModel());
                versiunetxt.setText(produse.get(produslst.getSelectedIndex()).getVersiune());
                garantietxt.setText(produse.get(produslst.getSelectedIndex()).getGarantie()+" ani");
                prettxt.setText(Integer.toString(produse.get(produslst.getSelectedIndex()).getPret())+" LEI");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Secțiunea Vânzări");
        frame.setContentPane(new Vanzari_Form().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(650, 500);
        frame.getContentPane().setBackground(new Color(224, 255, 255));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

    }
}
//224 255 255