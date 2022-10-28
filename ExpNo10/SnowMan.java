package expno10;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnowMan extends JPanel {
    int midX = 400;
    int midY = 300;
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       setBackground(new Color(224,208,182));
       g.setColor (Color.white);
       g.fillOval (midX-20, midY-60, 40, 40); 
       g.fillOval (midX-35, midY-25, 70, 60);
       g.fillOval (midX-50, midY+20, 100, 80); 
       g.setColor (Color.black);
       g.fillOval (midX-10, midY-50, 5, 5); 
       g.fillOval (midX+5, midY-50, 5, 5); 
       g.drawArc (midX-10, midY-40, 20, 10, 190, 160); 
       g.drawLine (midX-25, midY, midX-55, midY+40); 
       g.drawLine (midX+25, midY, midX+55, midY+40); 
}
public static void main(String args[]) {
JFrame frame = new JFrame("Snowman");
frame.add(new SnowMan());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,500);
frame.setVisible(true);
}
}