
public class BouncedBall2 extends AnimListener implements GLEventListener, KeyListener {
  
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
       gl.glEnd();
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
