import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class HW2 extends JApplet{
	public void init() {
	}
	public void paint(Graphics g){
      String name;
      g.setColor(Color.white); 
		g.fillRect(0,0,400,400); //background
      
      Color myRed = new Color(200,0,0);
      g.setColor(myRed);
      g.fillRect(15,50,175,200); //red rectangle

      Color myBlue = new Color(0,0,150);
      g.setColor(myBlue);
      g.fillRect(200,50,175,200); //blue rectangle
      
      g.setColor(Color.black);
      g.drawRect(190,50,10,200); //unfilled black rectangle - middle stripe
      
      g.drawOval(180,200,30,30); //nose ring
      
      g.setColor(Color.white);
      g.fillRect(175,190,40,30); //nose
      
      g.setColor(Color.black);
      g.fillOval(60,80,60,20); //left eye
      
      g.setColor(Color.white); //right eye
      g.fillOval(255,80,60,20);
      
      g.setColor(Color.black);
      g.drawLine(15,50,0,30);
      g.drawLine(0,20,25,5);
      g.drawLine(375,50,390,30);
      g.drawLine(390,20,365,5); //horns
      
      name = "Houston Texans";
      g.drawString(name,100,300);
		}
}
	