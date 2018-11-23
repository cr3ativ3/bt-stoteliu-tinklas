package code;

import javax.swing.*;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

import java.awt.*;
import java.awt.event.*;

public class gui {
 public static void main(String [] args)
 {

	  JFrame frame=new JFrame("Stoteles");
	  frame.setVisible(true);
	  frame.setSize(1000,300);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JLabel label=new JLabel("Pasirinkit operacija:");
	  JPanel panel=new JPanel();
	  frame.add(panel);
	  panel.add(label);
	  
	  JButton button1=new JButton("Stoteles Kvadrate");
	  JButton button2=new JButton("Stoteles Kvadrate su max Marsrutu");
	  JButton button3=new JButton("Stoteles Rutuly");
	  JButton button4=new JButton("Artimiausia Stotele");
	  JButton button5=new JButton("Stoteles Marsrutai");
	  JButton button6=new JButton("Marsrutu Paeiska");
	  JButton button7=new JButton("Marsrutu Stoteles");
	
	  panel.add(button1);
	  panel.add(button2);
	  panel.add(button3);
	  panel.add(button4);
	  panel.add(button5);
	  panel.add(button6);
	  panel.add(button7);
	
	  button1.addActionListener(new Action1());
	  button2.addActionListener(new Action2());
	  button3.addActionListener(new Action3());
	  button4.addActionListener(new Action4());
	  button5.addActionListener(new Action5());
	  button6.addActionListener(new Action6());
	  button7.addActionListener(new Action7());

	  
 }
 	static class Action1 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x1 = JOptionPane.showInputDialog("x1");
			String x2 = JOptionPane.showInputDialog("x2");
			String y1 = JOptionPane.showInputDialog("y1");
			String y2 = JOptionPane.showInputDialog("y2");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StotelesKvadrate(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action2 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x1 = JOptionPane.showInputDialog("x1");
			String x2 = JOptionPane.showInputDialog("x2");
			String y1 = JOptionPane.showInputDialog("y1");
			String y2 = JOptionPane.showInputDialog("y2");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StoteleKvadrateSuMax(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action3 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x");
			String y = JOptionPane.showInputDialog("y");
			String r = JOptionPane.showInputDialog("r");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StotelesRutuly(x, y,Integer.parseInt(r))));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action4 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x");
			String y = JOptionPane.showInputDialog("y");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(main.ArtimiausiaStotele(x, y));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action5 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("pavadinimas:");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
	    	System.out.println(main.StotelesMarsrutai(pav));
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(main.StotelesMarsrutai(pav)); /// jeigu ivedu ranka tada veikia, jeigu per pav tada neveikia
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action6 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x");
			String y = JOptionPane.showInputDialog("y");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.MarsrutuPaeiska(x, y)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action7 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("numeris:");
	   	    HardCodedDb b = new HardCodedDb();
	 	    control main = new control(b.getStoteles());
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StotelesMarsrutai(pav)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 
}