package Textures.Example1;

import java.io.File;
import javax.sound.sampled.*;
import Textures.AnimListener;
import Textures.TextureReader;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.BitSet;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;


public class BouncedBall2 extends AnimListener implements GLEventListener, KeyListener {
  
    int r = 100;
    int angle;
    int posy;
    double rotateAngle;
    int direction = 0;
    int animationIndex = 0;
    int maxWidth = 100;
    int maxHeight = 100;
    int x = maxWidth / 2, y = maxHeight / 2;
  
   String textureNames[] = {"jkjk1.png", "jkjk2.png", "jkjk3.png", "jkjk4.png",
        "jkjk5.png", "jkjk6.png", "jkjk7.png", "jkjk8.png",
        "jkjk9.png", "jkjk10.png", "jkjk11.png", "jkjk12.png",
        "jkjk13.png", "jkjk14.png", "jkjk15.png", "jkjk16.png",
        "jkjk17.png", "jkjk18.png", "jkjk19.png", "jkjk20.png",
        "jkjk21.png", "jkjk22.png", "jkjk23.png", "jkjk24.png",
        "jkjk25.png", "jkjk26.png", "jkjk27.png", "jkjk28.png",
        "jkjk29.png", "jkjk30.png", "jkjk31.png", "jkjk32.png",
        "flcustom.png", "images (95).png"};

    TextureReader.Texture texture[] = new TextureReader.Texture[textureNames.length];
    int textures[] = new int[textureNames.length];
    Object event;

  
  
  public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glEnable(GL.GL_TEXTURE_2D);  // Enable Texture Mapping
        gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
        gl.glGenTextures(textureNames.length, textures, 0);

        for (int i = 0; i < textureNames.length; i++) {
            try {
                texture[i] = TextureReader.readTexture(assetsFolderName + "//" + textureNames[i], true);

                gl.glBindTexture(GL.GL_TEXTURE_2D, textures[i]);

//                mipmapsFromPNG(gl, new GLU(), texture[i]);
                new GLU().gluBuild2DMipmaps(
                        GL.GL_TEXTURE_2D,
                        GL.GL_RGBA, // Internal Texel Format,
                        texture[i].getWidth(), texture[i].getHeight(),
                        GL.GL_RGBA, // External format from image,
                        GL.GL_UNSIGNED_BYTE,
                        texture[i].getPixels() // Imagedata
                );

            } catch (IOException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

        gl.glViewport(0, 0, 600, 300);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(0.0, 1000.0, 0.0, 1000.0, -1.0, 1.0);

    }
  
  
   public void display(GLAutoDrawable drawable) {

        GL gl = drawable.getGL();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glLoadIdentity();
        DrawBackground(gl);
        handleKeyPress();
        animationIndex = animationIndex % 32;
     
        DrawSprite(gl, x - 40, y + 30, animationIndex, 1, direction);
        DrawSprite(gl, x - 30, y + 30, animationIndex, 1, direction);
        DrawSprite(gl, x - 20, y + 30, animationIndex, 1, direction);
        DrawSprite(gl, x - 10, y + 30, animationIndex, 1, direction);

        DrawSprite(gl, x, y + 30, animationIndex, 1, direction);
        DrawSprite(gl, x + 10, y + 30, animationIndex, 1, direction);
        DrawSprite(gl, x + 20, y + 30, animationIndex, 1, direction);
        DrawSprite(gl, x + 30, y + 30, animationIndex, 1, direction);

        DrawSprite(gl, x - 40, y + 20, animationIndex, 1, direction);
        DrawSprite(gl, x - 30, y + 20, animationIndex, 1, direction);
        DrawSprite(gl, x - 20, y + 20, animationIndex, 1, direction);
        DrawSprite(gl, x - 10, y + 20, animationIndex, 1, direction);

        DrawSprite(gl, x, y + 20, animationIndex, 1, direction);
        DrawSprite(gl, x + 10, y + 20, animationIndex, 1, direction);
        DrawSprite(gl, x + 20, y + 20, animationIndex, 1, direction);
        DrawSprite(gl, x + 30, y + 20, animationIndex, 1, direction);

        DrawSprite(gl, x - 40, y + 10, animationIndex, 1, direction);
        DrawSprite(gl, x - 30, y + 10, animationIndex, 1, direction);
        DrawSprite(gl, x - 20, y + 10, animationIndex, 1, direction);
        DrawSprite(gl, x - 10, y + 10, animationIndex, 1, direction);

        DrawSprite(gl, x, y + 10, animationIndex, 1, direction);
        DrawSprite(gl, x + 10, y + 10, animationIndex, 1, direction);
        DrawSprite(gl, x + 20, y + 10, animationIndex, 1, direction);
        DrawSprite(gl, x + 30, y + 10, animationIndex, 1, direction);

        DrawSprite(gl, x - 40, y, animationIndex, 1, direction);
        DrawSprite(gl, x - 30, y, animationIndex, 1, direction);
        DrawSprite(gl, x - 20, y, animationIndex, 1, direction);
        DrawSprite(gl, x - 10, y, animationIndex, 1, direction);

        DrawSprite(gl, x, y, animationIndex, 1, direction);
        DrawSprite(gl, x + 10, y, animationIndex, 1, direction);
        DrawSprite(gl, x + 20, y, animationIndex, 1, direction);
        DrawSprite(gl, x + 30, y, animationIndex, 1, direction);

        DrawRoller(gl, x, y - 50, animationIndex, 1, direction);
     
       gl.glEnd();
   }
  
  public void DrawSprite(GL gl, int x, int y, int index, float scale, int dir) {
        gl.glEnable(GL.GL_BLEND);
        gl.glBindTexture(GL.GL_TEXTURE_2D, textures[index]);	// Turn Blending On
        int angle = 0;

        gl.glPushMatrix();
        // gl.glTranslated(x , y , 0);
        gl.glTranslated(x / (maxWidth / 2.0) - 0.9, y / (maxHeight / 2.0) - 0.9, 0);
        gl.glScaled(0.099 * scale, 0.099 * scale, 1);
        gl.glRotated(angle, 0, 0, 1);
        //System.out.println(x +" " + y);
        gl.glBegin(GL.GL_QUADS);
        // Front Face
        gl.glTexCoord2f(0.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, -1.0f);
        gl.glTexCoord2f(1.0f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, -1.0f);
        gl.glTexCoord2f(1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, -1.0f);
        gl.glTexCoord2f(0.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, -1.0f);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glDisable(GL.GL_BLEND);
    }
  public void DrawRoller(GL gl, int x, int y, int index, float scale, int dir) {
        gl.glEnable(GL.GL_BLEND);
        gl.glBindTexture(GL.GL_TEXTURE_2D, textures[32]);	// Turn Blending On
        int angle = 0;

        gl.glPushMatrix();
        // gl.glTranslated(x , y , 0);
        gl.glTranslated(x / (maxWidth / 2.0) - 0.9, y / (maxHeight / 2.0) - 0.9, 0);
        gl.glScaled(0.25 * scale, 0.25 * scale, 1);
        gl.glRotated(angle, 0, 0, 1);
        //System.out.println(x +" " + y);
        gl.glBegin(GL.GL_QUADS);
        // Front Face
        gl.glTexCoord2f(0.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, -1.0f);
        gl.glTexCoord2f(1.0f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, -1.0f);
        gl.glTexCoord2f(1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, -1.0f);
        gl.glTexCoord2f(0.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, -1.0f);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glDisable(GL.GL_BLEND);
    }
  
  public void DrawBackground(GL gl) {

        gl.glEnable(GL.GL_BLEND);
        gl.glBindTexture(GL.GL_TEXTURE_2D, textures[33]);	// Turn Blending On
        // int angle = 0;
        gl.glPushMatrix();
        gl.glBegin(GL.GL_QUADS);
//         Front Face
        gl.glTexCoord2f(0.0f, 0.0f);
        gl.glVertex3f(-1.0f, -1.0f, -1.0f);
        gl.glTexCoord2f(1.0f, 0.0f);
        gl.glVertex3f(1.0f, -1.0f, -1.0f);
        gl.glTexCoord2f(1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, -1.0f);
        gl.glTexCoord2f(0.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, -1.0f);
        gl.glEnd();
        gl.glPopMatrix();

        gl.glDisable(GL.GL_BLEND);
    }
  
  
   public void handleKeyPress() {
   
   
   }

   @Override
    public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayChanged(GLAutoDrawable glad, boolean bln, boolean bln1) {
        //To change body of generated methods, choose Tools | Templates.
    }
    public BitSet keyBits = new BitSet(256);

    @Override
    public void keyTyped(final KeyEvent event) {

    }

    @Override
    public void keyPressed(final KeyEvent event) {
        int keyCode = event.getKeyCode();
        keyBits.set(keyCode);
    }

    @Override
    public void keyReleased(final KeyEvent event) {
        int keyCode = event.getKeyCode();
        keyBits.clear(keyCode);
    }

    private boolean isKeyPressed(final int keyCode) {
        return keyBits.get(keyCode);
    }



}
