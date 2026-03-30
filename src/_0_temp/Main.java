package _0_temp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel JLHeader;
    private JTextField textField1;
    private JButton clickMeButton;

    public Main(){
        setContentPane(JLHeader);

        //
        setTitle("Simple GUI ts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        //

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(Main.this, "Welcome " + firstName);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

    /* LINKS
    https://youtu.be/whF_Qm1epQ8?si=VGc8AeDsOqfxojsw


     */
}

