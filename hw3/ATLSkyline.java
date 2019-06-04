import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class ATLSkyline extends JApplet {
 public void init() {
  }
 public void paint(Graphics g) {
  int col1, col2, col3, sr, sx, sy;
  Random r = new Random();
  g.setColor(Color.black); //background
  g.fillRect(0, 0, 1000, 800);
  for (int i = 0; i <= 9; i++) { //randomly generates 10 buildings
   int height = (r.nextInt(501)) + 100;
   col1 = r.nextInt(256);
   col2 = r.nextInt(256);
   col3 = r.nextInt(256);
   Color randCol = new Color(col1, col2, col3);
   g.setColor(randCol);
   g.fillRect(i * 100, 800 - height, 100, height);
  }
  for (int i = 0; i <= 15; i++) { //randomly generates 10 snowflakes
   g.setColor(Color.white);
   sr = (r.nextInt(11)) + 10;
   sx = r.nextInt(1001);
   sy = r.nextInt(801);
   g.fillOval(sx, sy, sr, sr);
  }
 }
}