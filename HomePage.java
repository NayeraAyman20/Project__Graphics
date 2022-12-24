package Textures.Example1;

import Textures.TextureReader;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.glu.GLU;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


import Textures.AnimListener;
import Textures.TextureReader;
import java.awt.event.*;
import java.io.IOException;
import javax.media.opengl.*;

import java.util.BitSet;
import javax.media.opengl.glu.GLU;

public class HomePage extends JFrame  {
  JButton B1,B2;
  
  
  
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
  
  
}
