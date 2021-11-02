package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login  extends JFrame{
    private JPanel rootPanel;
    private JButton btnConectare;
    private JTextField txtNume;
    private JButton btnReset;
    private JPasswordField txtParola;
    private JCheckBox btnVizualizare;

    login() {
        btnVizualizare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnVizualizare.isSelected()){
                    txtParola.setEchoChar((char)0);
                }
                else{
                    txtParola.setEchoChar('*');
                }
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnReset);
                    txtNume.setText("");
                    txtParola.setText("");
            }
        });
        btnConectare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame=new JFrame("Meniu principal");
                frame.setContentPane(new panouprincipal().getRootPane());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(550,450);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                ImageIcon imagine=new ImageIcon("logo.png");
                frame.setIconImage(imagine.getImage());
            }
        });
    }

    public static void main(String[] args){
        JFrame frame=new JFrame("Hirschmann Automotive");
        frame.setContentPane(new login().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(550,450);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        Color culoare =new Color(15,77,196);
        frame.getContentPane().setBackground(culoare);
        ImageIcon imagine=new ImageIcon("logo.png");
        frame.setIconImage(imagine.getImage());

    }
}

