package Project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logare extends JFrame {
    private JPanel rootPanel;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JPanel panouprincipal;

    Logare() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null,"Esti sigur ca vrei sa te conectezi?", "Acord",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION) {
                    JOptionPane.showConfirmDialog(null,"Ai ales sa te conectezi", "Informatie",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                    JFrame frame2= new JFrame("Meniu Principal");
                    frame2.setContentPane(new panouprincipal().getRootPane());
                    frame2.pack();
                    frame2.setVisible(true);
                }
                else {
                    System.out.println("nu");
                }
                //System.out.println(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panou conectare" );
        frame.setContentPane(new Logare().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}

