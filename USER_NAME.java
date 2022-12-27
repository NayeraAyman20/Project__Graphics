package Textures.Example1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class USER_NAME extends JFrame implements ActionListener {

    JTextField input;
    JButton ok;
    JLabel text;

    public USER_NAME() {
        this.setTitle("USER_NAME");
        this.setSize(350, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        input = new JTextField("", 20);
        ok = new JButton("OK");
        text = new JLabel("Enter Your Name");
        this.add(text);
        this.add(input);

        ok.setBackground(Color.yellow);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                new BouncedBall();
            }
        });
        this.add(ok);
    }

    public static void main(String[] args) {
        USER_NAME un = new USER_NAME();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
