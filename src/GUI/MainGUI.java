package GUI;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import worldlessVirologist.Game;
import worldlessVirologist.Map;

public class MainGUI extends JFrame {
	private Display dis = new Display(1380, 690);
    
    private GameGUI gameGui;
   JPMapState map;
   JPLabState lab;
    static JPanel pmenu = new JPanel(); 

   /* public void paint(Graphics g) {
    	g.drawImage(Assets.mapImage, 0, 0, 1380, 690, null);
    }*/
    
    static JPanel panelCont = new JPanel();
    static CardLayout cl = new CardLayout();
		
    public MainGUI(Map wvmap, Game g){
    	
    	super("Worldless virologist");
    	this.setSize(new Dimension(1380, 720));
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	 map = new JPMapState(wvmap);
    	 lab = new JPLabState();
    	panelCont.setLayout(cl);
    	gameGui = new GameGUI(g);
    	panelCont.add(map,"2");
    	panelCont.add(lab, "3");
    	this.add(panelCont);
    	
    	//cl.show(panelCont, "2");
    	
    	cl.show(panelCont, "3");
    	//this.add(dis.getCanvas());
    	
    	
    	this.setVisible(true);
    	
    	
    	

    	
    	
    }

    public void ChangePanel(){

    }
    public void Run(){

    }

}
