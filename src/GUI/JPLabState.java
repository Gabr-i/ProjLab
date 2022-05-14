package GUI;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPLabState extends JPanel {
	JButton b = new JButton();
	JLabel jl;
	
	public JPLabState() {
		super();
		this.setSize(getPreferredSize());
		//jl.setLayout(new FlowLayout());
		b.setSize(200, 100);
	 
	 
	 jl = new JLabel(new ImageIcon(Assets.laboratoryImage));
	 jl.setLayout(null);
	 jl.add(b);
	 this.add(jl);
	 
	}
	/*
	 @Override
		public void paint(Graphics g) {
		        super.paintComponent(g);
		        g.drawImage(Assets.laboratoryImage,0, 0, 1380, 690, this);

		        
				
				}
				*/
		 

}
