package Classes;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame(){
		Panel panel=new Panel();
		this.add(panel);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
		
	}

}
