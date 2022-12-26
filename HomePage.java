package Textures.Example1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.*;

public class HomePage extends JFrame  {
  
 public HomePage(){
   JFrame f = new JFrame();
   f.setSize(1100, 700);
   f.setDefaultCloseOperation(EXIT_ON_CLOSE);
   f.setLocationRelativeTo(null);
   
   ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\Desktop\\BackGround2.png");
   JLabel label = new JLabel(icon);
   label.setLayout(new FlowLayout(-300, 500, 0));
   JScrollPane scrollpane = new JScrollPane(label);
   scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
   f.add(scrollpane);
   f.setVisible(true);
   JViewport viewport = scrollpane.getViewport();
  
   JButton B1 = new JButton("                       start               ");
   JButton B2 = new JButton("                     How to Play ?         ");
   JButton B3 = new JButton("                      Level Up             ");
   JButton B4 = new JButton("                         Sound             ");
   
   JPanel panel = new JPanel();
   panel.add(B1);
   panel.add(B2);
   panel.add(B3);
   panel.add(B4);
   f.add(panel, BorderLayout.NORTH);
   
   B1.setBackground(java.awt.Color.GRAY);
   B1.setForeground(java.awt.Color.WHITE);
   B2.setBackground(java.awt.Color.GRAY);
   B2.setForeground(java.awt.Color.WHITE);
   B3.setBackground(java.awt.Color.GRAY);
   B3.setForeground(java.awt.Color.WHITE);
   B4.setBackground(java.awt.Color.GRAY);
   B4.setForeground(java.awt.Color.WHITE);
 }
 public static void main(String[] args) {
        HomePage HP = new HomePage();
    } 
  
}
