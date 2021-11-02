package Project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.StringConcatException;
interface E{
    public int getPretVanzare();
    public int getCapacitatedePrductie();
    public int getCostuldeProductie();
}

public class Economic extends JFrame {
    private JTextField Pretunitate;
    private JTextField Cprod;
    private JTextField Costprod;
    private JButton button1;
    private JPanel Panel;
    private JTextField Cf;
    private JTextField Cv;
    private JTextField Ct;
    private JLabel Prentab;

    Economic(){

        Calcul d= new Calcul() {
            @Override
            public int getCapacitatedePrductie() {
                return 0;
            }
        };
        this.setContentPane(this.Panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cheltuieli_fixe = Integer.parseInt(Cf.getText());
                double cheltuieli_variabile = Integer.parseInt(Cv.getText());
                double cheltuieli_totale= cheltuieli_fixe+cheltuieli_variabile;
                Ct.setText(String.valueOf(cheltuieli_totale)+" lei");
                Pretunitate.setText(String.valueOf(d.getPretVanzare())+" lei");
                Cprod.setText(String.valueOf(d.getCapacitatedeProductie())+" lei");
                Costprod.setText(String.valueOf(d.getCostuldeProductie())+" lei");
                double punct_rentabilitate=cheltuieli_fixe/(d.getPretVanzare()-d.getCostuldeProductie());
                Prentab.setText(String.valueOf(punct_rentabilitate) +" produse vandute");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Hirschmann Automotive");
        frame.setContentPane(new Economic().rootPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1000,2000);
        frame.setResizable(false);
        frame.setVisible(true);
        ImageIcon imagine=new ImageIcon("logo.png");
        frame.setIconImage(imagine.getImage());
    }
}
