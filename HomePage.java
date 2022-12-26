package Textures.Example1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.*;

public class HomePage extends JFrame  {
  
 public HomePage(){
  
 this.setTitle("HomePage");
        this.setVisible(true);
        this.setSize(1100, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(550, 550, 150));  
        
        B1=new JButton("    Start   ");
        B1.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
         new BouncedBall();
     }
 });
        add(B1); 
   B2=new JButton("How To Play");
    
   add(B2);
   
 } 
  
  
 public static void main(String[] args) {
        HomePage HP = new HomePage();
    } 
  
}
