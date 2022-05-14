package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import worldlessVirologist.Map;

public class JPMapState extends JPanel implements MouseListener{
	
	int coord[][] = {{356, 12},{356, 126},{356 ,243},{356 ,358},{356 ,473},{356 ,588},
			{473, 12},{473, 126},{473, 243},{473, 358},{473 ,473},{473 ,588},
			{588 ,12},{588 ,126},{588 ,243},{588 ,358},{588 ,473},{588 ,588},
			{704, 12},{704, 126},{704 ,243},{704 ,358},{704, 473},{704 ,588},
			{818 ,12},{818 ,126},{818, 243},{818 ,358},{818, 473},{818 ,588},
			{933, 12},{933 ,126},{933, 243},{933 ,358},{933 ,473},{933, 588}};
			
	Map map = new Map();
	JButton bexit;
	int mouseX, mouseY;
	
	
	public JPMapState(Map m) {
		super();
		map = m;
		this.setLayout(null);
		this.setSize(getPreferredSize());
		
		bexit = new JButton("Exit");
		this.add(bexit);

		bexit.setBounds( 50,590,220,80);
		bexit.setOpaque(false);
		this.setVisible(true);
		addMouseListener(this);
		
		
	}
	
	 @Override
	public void paint(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(Assets.mapImage,0, 0, 1380, 690, this);
	        g.drawImage(Assets.laboratoryImage, 358+(map.viro.get(0).getField().index%6)*115, 15+(map.viro.get(0).getField().index/6)*100, 90, 90, null);
			g.drawImage(Assets.shelterImage, 358+(map.viro.get(1).getField().index%6)*115, (map.viro.get(1).getField().index/6)*115, 90, 90, null);
			//System.out.println((mouseX-358)%6+" ,"+mouseY/6);
			//g.drawImage(Assets.shelterImage, 473, 130, 90, 90, null);
			
			g.drawImage(Assets.virologist1, 0, 0, 250,300, null);
			g.drawImage(Assets.virologist2, 1130, 0, 250,300, null);
			if (map.getNumPlayer() == 3) {
			g.drawImage(Assets.virologist3, 0, 300,250,300, null);
			}
			if (map.getNumPlayer() == 4) {
				g.drawImage(Assets.virologist3, 0, 300,250,300, null);			
			g.drawImage(Assets.virologist4, 1130, 300, 250,300, null);
			
			}
			
	 }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		System.out.println(mouseX+" ,"+mouseY);
		for(int i = 0; i<36; i++)
	    {
	      if(coord[i][0] <= mouseX && coord[i][0]+90 >= mouseX && coord[i][1] <= mouseY && coord[i][1]+90 >= mouseY)
	        for(int j = 0; j<36; j++)
	          if(map.fields.get(j).index == i) {
	            if(map.viro.get(0).getField().IsNeighbour(map.fields.get(j)))
	              map.viro.get(0).Move(map.fields.get(i));
	          }
	    }
		repaint();
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
