/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textures.Example1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.FileInputStream;
//import sun.audio.*;
//import javax.swing.*;
//import java.io.IOException;
//import java.awt.event.*;
///**
// *
// * @author Merna
// */
public class sound {
//    
// 
  public static void playMusic(String location) {

        try {
            File musicPath = new File(location);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("Cant find file");
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}