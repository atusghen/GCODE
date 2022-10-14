package myPackage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphic extends JPanel {
	
	static List<String> l = new ArrayList<String>();
	public Graphic() {
		this.setPreferredSize(new Dimension(500, 501));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// Paint its background
		//super.paintComponent(g);
		
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
				
				float endDist = (float)Math.sqrt((x2-x0)*(x2-x0) + (y2-y0)*(y2-y0));
				float startDist = (float)Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
				
				if(endDist != startDist) {
					System.out.println("Il comando -> " + com + " non può collegare il punto: " + x1 + ";" + (500 - y1) + " con il punto " + x2 + ";" + (500 - y2) +".");
				}
				
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
  }

public static void setArray(List<String> listcom) {
	l = listcom;
	
}


}