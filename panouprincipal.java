package Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panouprincipal extends JFrame {
    private JButton sesizareDefectiuniButton;
    private JButton achizitiiButton;
    private JButton dateEconomiceButton;
    private JButton vanzariButton;
    private JPanel rootPanel;

    panouprincipal() {
        super("Meniu principal");
        this.setContentPane(this.rootPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        sesizareDefectiuniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3= new JFrame("Meniu Principal");
                frame3.setContentPane(new iScreen().getRootPane());
                frame3.pack();
                frame3.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {

        JFrame frame2 = new JFrame("App");
        frame2.setContentPane(new panouprincipal().rootPanel);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setVisible(true);
    }
}
