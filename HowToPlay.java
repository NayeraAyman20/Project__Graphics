/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textures.Example1;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Merna
 */
public class HowToPlay extends JFrame{
    public HowToPlay(){
         JFrame f = new JFrame();
        f.setSize(1100, 700);

        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\Merna\\Downloads\\Project-main\\Project-main//Introudction.png");
        JLabel label = new JLabel(icon);
        label.setLayout(new FlowLayout(-300, 500, 0));
        JScrollPane scrollpane = new JScrollPane(label);

//        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        f.add(scrollpane);
        f.setVisible(true);

        JViewport viewport = scrollpane.getViewport();

    }
    
}
