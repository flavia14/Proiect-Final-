import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Achizitii {
    private JPanel rootPanel;
    private JRadioButton btn1;
    private JRadioButton btn2;
    private JRadioButton btn3;
    private JRadioButton btn4;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JTextField txtSubT;
    private JTextField txtTotal;
    private JButton btnCalcul;
    private JButton btnAnulare;
    private JButton btnAdaugare;

    public Achizitii() {

        btnCalcul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total;
                double subtotal=0;

                if (btn1.isSelected()) {
                    subtotal =subtotal + 15;
                }if (btn2.isSelected()){
                    subtotal=subtotal + 125;
                }if(btn3.isSelected()){
                    subtotal=subtotal + 50;
                }if (btn4.isSelected()) {
                    subtotal = subtotal + 100;
                }

                txtSubT.setText(Double.toString (subtotal));
                subtotal = Double.parseDouble(txtSubT.getText());
                total=subtotal+.19*subtotal;
                txtTotal.setText(Double.toString(total));
            }
        });
        btnAnulare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnAnulare);
                txtSubT.setText("");
                txtTotal.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hirschmann Automotive");
        frame.setContentPane(new Achizitii().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700, 500);
        frame.setResizable(true);
        frame.setVisible(true);
        Color culoare =new Color(15,77,196);
        frame.getContentPane().setBackground(culoare);
        ImageIcon imagine = new ImageIcon("logo.png");
        frame.setIconImage(imagine.getImage());

    }
}

