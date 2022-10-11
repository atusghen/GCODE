package myPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import org.antlr.runtime.RecognitionException;

import myPackage.Interfaccia;

@SuppressWarnings("serial")
public class Interfaccia extends JPanel {
	
	static JLabel back;
    
    static BufferedImage backBtn;
	
    static JButton button = new JButton("Sfoglia");
    static ButtonGroup topGroup = new ButtonGroup();
    static JLabel winTitle = new JLabel("GCODE Parser");
    static JLabel spazio = new JLabel(" ");
    static JLabel spazio1 = new JLabel(" ");
    
    static JScrollPane scroll;
    static JTextArea dataarea = new JTextArea();

    static JPanel searchpanel = new JPanel();
    static JPanel datapanel = new JPanel();
    static JPanel mainpanel = new JPanel();
    static JPanel windowpanel = new JPanel();
    
    static Graphic graphic;
    
    static JFrame jF = new JFrame("GCODE");
    
    
    public Interfaccia() throws IOException{
    	//BoxLayout bl = new BoxLayout(infopanel, BoxLayout.Y_AXIS);
    	winTitle.setHorizontalAlignment(JLabel.CENTER);
    	winTitle.setVerticalAlignment(JLabel.CENTER);
    	winTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
    	
    	try {
    		backBtn = ImageIO.read(getClass().getResourceAsStream("img/back-button.png"));
    	}catch(Exception e) {
    		
    	}
    	
    	back = new JLabel(new ImageIcon(backBtn));
    	
    	back.setVisible(false);
    	back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	back.setHorizontalAlignment(JLabel.LEFT);
    	back.setVerticalAlignment(JLabel.CENTER);
    	
    	windowpanel.setLayout(new BorderLayout());
    	windowpanel.add(back, BorderLayout.NORTH);
    	windowpanel.setBackground(Color.WHITE);
    	windowpanel.setBorder(new EmptyBorder(10, 10, 10, 10));
    	
    	//infopanel1.setLayout(new BorderLayout());
    	//infopanel1.add(winTitle, BorderLayout.NORTH);
    	//infopanel1.setBackground(Color.WHITE);
    	//infopanel1.setOpaque(false);
    	
    	searchpanel.setLayout(new GridBagLayout());
    	GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        
        searchpanel.add(winTitle, gbc);
        searchpanel.add(spazio1, gbc);
        searchpanel.add(button, gbc);
        searchpanel.add(spazio, gbc);
    	
    	/*infopanel.setLayout(new BorderLayout());
    	infopanel.add(winTitle, BorderLayout.NORTH);
    	infopanel.add(button, BorderLayout.CENTER);
    	infopanel.setBackground(Color.WHITE);
    	infopanel.setOpaque(false);*/
    	
    	
        //infopanel.add(new JLabel("3+5="), gbc);
    	//GridLayout gridLayout  = new GridLayout(1, 2);
    	//gridLayout.setHgap(20);
    	//infopanel.getLayout().setVgap(25);

        searchpanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        searchpanel.setPreferredSize(new Dimension(500, 200));
        searchpanel.setOpaque(false);
        //infopanel.setSize(new Dimension(350, 400));        
        
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBackground(new Color(33, 150, 243));
        button.setBorderPainted(false);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        button.setFont(new Font("SansSerif", Font.PLAIN, 20));
        
        dataarea.setEditable(false);
        dataarea.setFont(new Font("SansSerif", Font.PLAIN, 13));
        
        //datapanel.setBorder(new EmptyBorder(10, 10, 10, 10));
    	datapanel.setBackground(Color.WHITE);
    	//datapanel.setPreferredSize(new Dimension(800, 500));
    	
    	//datapanel.setOpaque(false);
        
        scroll = new JScrollPane(datapanel);
        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
        scroll.setPreferredSize(new Dimension(800, 500));
        scroll.setBackground(Color.WHITE);
        //scroll.setOpaque(false);
        
        datapanel.add(dataarea);
        
        
        
        InputStream stream;
        ImageIcon icon;
        
        
        //infopanel.add(sp1);
        //infopanel.add(sp2);
        //infopanel.add(button);
        
        mainpanel.setLayout(new GridBagLayout());
        /*GridBagConstraints*/ gbc = new GridBagConstraints();

     	// Row 0 - Filename
     		// Col 0
     	gbc.gridx = 0;
     	gbc.gridy = 0;
     	//gbc.insets = new Insets(5, 0, 0, 10);
     	gbc.anchor = GridBagConstraints.LINE_START;
     	mainpanel.add(searchpanel, gbc);
     	
     	gbc.gridx = 1;
     	gbc.gridy = 0;
     	gbc.anchor = GridBagConstraints.LINE_START;
     	mainpanel.add(scroll, gbc);
     	scroll.setVisible(false);

     	graphic = new Graphic();
     	//graphic.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(-10, -10, -10, -10),  new EtchedBorder()));
     		// Col 1
     	gbc.gridx = 2;
     	gbc.gridy = 0;
     	gbc.anchor = GridBagConstraints.LINE_START;
     	mainpanel.add(graphic, gbc);
     	graphic.setVisible(false);
     	
     	
     	mainpanel.setBackground(Color.WHITE);
     	
     	windowpanel.add(mainpanel);

     	jF.pack();
         
         //infopanel1.add(infopanel);
         
         
         jF.getContentPane().add(windowpanel);
         
         //jF.getContentPane().add(infopanel);
         //jF.setBackground(Color.WHITE);
         //ImageIcon ii = new ImageIcon(getClass().getResource("check.png"));
         stream = getClass().getResourceAsStream("img/icon.png");
         icon= new ImageIcon(ImageIO.read(stream));
         jF.setIconImage(icon.getImage());
         //jF.setIconImage(new ImageIcon(getClass().getResource("img/music.png")).getImage());
         jF.pack();
         jF.setLocationRelativeTo(null);
         jF.setResizable(false);
         //jF.setSize(500, 150);
         jF.setVisible(true);
         
         button.addActionListener(new ActionListener() { 
     	    public void actionPerformed(ActionEvent e) { 
     	       startParsing(e);
     	       back.setVisible(true);
     	       searchpanel.setVisible(false);
     	       scroll.setVisible(true);
     	       graphic.setVisible(true);
     	       graphic.repaint();
     	       //infopanel.remove(spazio);
     	       //jF.getContentPane().add(graphic);
     	       searchpanel.setPreferredSize(new Dimension(1000, 1000));
     	       jF.pack();
     	       jF.setLocationRelativeTo(null);
         }
        });
         
        
        back.addMouseListener(new MouseAdapter()  
    	{  
		    public void mouseClicked(MouseEvent e)  
		    {	
		    	back.setVisible(false);
		    	searchpanel.setVisible(true);
		    	scroll.setVisible(false);
		    	graphic.setVisible(false);
		    	graphic.repaint();
		    	searchpanel.setPreferredSize(new Dimension(500, 200));
		    	jF.setTitle("GCODE");
		    	dataarea.setText("");
		    	jF.repaint();
		        
		    	
		       //infopanel.remove(infopanel2);
		       //infopanel.remove(infopanel3);
		    	
		    	jF.pack();
		    	jF.setLocationRelativeTo(null);
		    }  
    	});
  
      
        
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
    }
    
    public static void setData(String data) {
    	//infopanel.setPreferredSize(new Dimension(400, 200));
    	jF.pack();
    	
    	Component[] components = scroll.getComponents();

    	for (Component singleComponent : components) {
    	   if (singleComponent instanceof JTextArea) {
    	       JTextArea label = (JTextArea) singleComponent;
    	       label.setFont(new Font("SansSerif", Font.PLAIN, 20));
    	   }
    	}
    	
    	dataarea.append(data);
    	
    	
    }
    
    public String fileChooser() throws NullPointerException
    {
    	  JFileChooser fileChooser = new JFileChooser();
    	  fileChooser.setCurrentDirectory(new File("resources"));
    	  fileChooser.showOpenDialog(Interfaccia.this);
    	  jF.setTitle("GCODE - " + fileChooser.getSelectedFile().getName());
    	  return fileChooser.getSelectedFile().getPath();
    }
    
    private void startParsing(ActionEvent e) { 
        try {
        	ParserLauncher.avvio(this);
		} catch (IOException | RecognitionException e1) {
			e1.printStackTrace();
		}
    }
}

