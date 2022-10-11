package myPackage;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphic extends JPanel {
	static List<String> l = new ArrayList<String>();
  public Graphic() {
    this.setPreferredSize(new Dimension(500, 510));
  }/*from   w  ww  . java2s  .  c o m*/

  @Override
  public void paintComponent(Graphics g) {
    // Paint its background
    super.paintComponent(g);
    int conta = 0;
    
	int xorigin = 500, yorigin = 500;
	int firstx = 0, firsty = 0;
    for(String com:l){

		String[] prop = com.split(";");
		
		for(int i = 1; i < prop.length; i++) {
			prop[i] = prop[i].substring(1);
			//System.out.println(prop[i]);
		}
		
		if(prop[0].equals("G00")) {
			firstx = Integer.parseInt(prop[1]);
			firsty = yorigin - Integer.parseInt(prop[2]);
		}
		
		if(prop[0].equals("G01")) {
			g.drawLine(firstx, firsty, Integer.parseInt(prop[1]), yorigin - Integer.parseInt(prop[2]));
			firstx = Integer.parseInt(prop[1]);
			firsty = yorigin - Integer.parseInt(prop[2]);
		}else if(prop[0].equals("G02")) {
			//System.out.println("conta:" + conta++);
			float x0 = Integer.parseInt(prop[3]);
			float y0 = 500 - Integer.parseInt(prop[4]);
			float x1 = firstx;
			float y1 = firsty;
			float x2 = Integer.parseInt(prop[1]);
			float y2 = 500 - Integer.parseInt(prop[2]);
			float r = (float)Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
			float x = x0-r;
			float y = y0-r;
			float width = 2*r;
			float height = 2*r;
			float startAngle = (float) (180/Math.PI*Math.atan2(y1-y0, x1-x0));
			float endAngle = (float) (180/Math.PI*Math.atan2(y2-y0, x2-x0));
			
			//System.out.println(x0 + " " + y0 + " " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + r + " " + x + " " + y + " " + width + " " + height + " " + startAngle + " " + endAngle);
			if(startAngle - endAngle < 0)
				g.drawArc((int)x, (int)y, (int)width, (int)height, (int)(360.0 - startAngle), (int)(startAngle - endAngle));
			else
				g.drawArc((int)x, (int)y, (int)width, (int)height, (int)(360.0 - startAngle), (int)-(360 - (startAngle - endAngle)));
			
			
			//g.drawArc(Integer.parseInt(prop[1]), Integer.parseInt(prop[2]),Integer.parseInt(prop[1]) - firstx ,Integer.parseInt(prop[2]) - firsty, 270, 90);
			firstx = Integer.parseInt(prop[1]);
			firsty = yorigin - Integer.parseInt(prop[2]);
		} else if(prop[0].equals("G03")) {
			//System.out.println("ciao");
			float x0 = Integer.parseInt(prop[3]);
			float y0 = 500 - Integer.parseInt(prop[4]);
			float x1 = firstx;
			float y1 = firsty;
			float x2 = Integer.parseInt(prop[1]);
			float y2 = 500 - Integer.parseInt(prop[2]);
			float r = (float)Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
			float x = x0-r;
			float y = y0-r;
			float width = 2*r;
			float height = 2*r;
			float startAngle = (float) (180/Math.PI*Math.atan2(y1-y0, x1-x0));
			float endAngle = (float) (180/Math.PI*Math.atan2(y2-y0, x2-x0));
			
			//System.out.println(x0 + " " + y0 + " " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + r + " " + x + " " + y + " " + width + " " + height + " " + startAngle + " " + endAngle);
			if(startAngle - endAngle > 0)
				g.drawArc((int)x, (int)y, (int)width, (int)height, (int)(360.0 - startAngle), (int)(startAngle - endAngle));
			else
				g.drawArc((int)x, (int)y, (int)width, (int)height, (int)(360.0 - startAngle), (int)-(Math.abs(startAngle) - endAngle));
			
			
			//g.drawArc(Integer.parseInt(prop[1]), Integer.parseInt(prop[2]),Integer.parseInt(prop[1]) - firstx ,Integer.parseInt(prop[2]) - firsty, 270, 90);
			firstx = Integer.parseInt(prop[1]);
			firsty = yorigin - Integer.parseInt(prop[2]);
		}
    }
    // Draw a line
    //g.drawLine(10, 10, 50, 50);
    // Draw a rectangle
    //g.drawRect(80, 10, 40, 20);

    // Draw an oval
    //g.drawOval(140, 10, 410, 20);

    // Fill an oval
    //g.fillOval(200, 101, 40, 20);

    // Draw a circle
    //g.drawOval(250, 10, 40, 40);

    // Draw an arc
    //g.drawArc(10, 10, 50, 100, 270, 90);

    // Draw a string
    //g.drawString("Hello Swing!", 350, 30);

    // Draw a thicker rectangle using Graphics2D
    //Graphics2D g2d = (Graphics2D) g;
    //g2d.setStroke(new BasicStroke(4));
    //g2d.drawRect(450, 10, 50, 50);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Sample Drawings Using a Graphics Object");
    //frame.getContentPane().add(new Graphic());
    frame.pack();
    frame.setVisible(true);
  }

public static void Graphic(List<String> listcom) {
	l = listcom;
	
}


}