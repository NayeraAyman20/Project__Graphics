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
