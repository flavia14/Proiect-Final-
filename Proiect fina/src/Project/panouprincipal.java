package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
                JFrame frame=new JFrame("Meniu principal defectiuni");
                frame.setContentPane(new Defectiuni().getRootPane());
                frame.pack();
                frame.setSize(800,600);
                frame.setLocationRelativeTo(null);
                frame.setResizable(true);
                frame.setVisible(true);
                ImageIcon imagine=new ImageIcon("logo.png");
                frame.setIconImage(imagine.getImage());
            }
        });
        dateEconomiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame("Calcul economic");
                frame.setContentPane(new Economic().getRootPane());
                frame.pack();
                frame.setSize(680,500);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                ImageIcon imagine=new ImageIcon("logo.png");
                frame.setIconImage(imagine.getImage());
            }

        });
        achizitiiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2=new JFrame("Achizitii");
                frame2.setContentPane(new Achizitii().getRootPane());
                frame2.pack();
                frame2.setSize(680,500);
                frame2.setLocationRelativeTo(null);
                frame2.setResizable(false);
                frame2.setVisible(true);
                ImageIcon imagine=new ImageIcon("logo.png");
                frame2.setIconImage(imagine.getImage());
            }
        });
        vanzariButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2=new JFrame("Vanzari");
                frame2.setContentPane(new Vanzari_Form().getRootPane());
                frame2.pack();
                frame2.setResizable(false);
                frame2.setVisible(true);
                frame2.setSize(600, 500);
                frame2.setLocationRelativeTo(null);
                ImageIcon imagine=new ImageIcon("logo.png");
                frame2.setIconImage(imagine.getImage());
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame("Hirschmann Automotive");
        frame.setContentPane(new panouprincipal().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(450,300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        ImageIcon imagine=new ImageIcon("logo.png");
        frame.setIconImage(imagine.getImage());

    }
}
