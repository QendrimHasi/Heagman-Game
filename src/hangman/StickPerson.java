package hangman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StickPerson extends JPanel {
	private Game game= new Game();
	private int c;
	private String e=game.getEkuation();
	private int countcheck;
	private boolean win;

	private Buton b0=new Buton(10,370,'0',game);
	private  Buton b1=new Buton(70,370,'1',game);
	private  Buton b2 = new Buton(130,370,'2',game);
	private  Buton b3 = new Buton(190,370,'3',game);
	private  Buton b4 = new Buton(250,370,'4',game);
	private  Buton b5 = new Buton(310,370,'5',game);
	private  Buton b6 = new Buton(370,370,'6',game);
	private   Buton b7 = new Buton(430,370,'7',game);
	private  Buton b8 = new Buton(10,430,'8',game);
	private  Buton b9 = new Buton(70,430,'9',game);
	private Buton k1 = new Buton(130,430,'(',game);
	private  Buton k2= new Buton(190,430,')',game);
	private  Buton sh1 = new Buton(250,430,'+',game);
	private  Buton sh2= new Buton(310,430,'-',game);
	private  Buton sh3= new Buton(370,430,'*',game);
	private Buton sh4= new Buton(430,430,'/',game);
	private Buton restart= new Buton(250, 320,"Restart",game);
	
	
	
	public void paintComponent(Graphics g){
		countcheck=game.getCountCheck();
		win=game.win(countcheck);
		c=game.getCountl();
		e=game.getEkuation();
		
		if(c<8){
			this.remove(restart);
		}
		if(restart.isRestart()){
			afterRestart();
			restart.setrestart();
		}
		
	     this.add(b0);
	     b0.disable(b0);
		 this.add(b1);
	     b1.disable(b1);
		 this.add(b2);
	     b2.disable(b2);
		 this.add(b3);
	     b3.disable(b3);
		 this.add(b4);
	     b4.disable(b4);
		 this.add(b5);
	     b5.disable(b5);
		 this.add(b6);
	     b6.disable(b6);
		 this.add(b7);
	     b7.disable(b7);
		 this.add(b8);
	     b8.disable(b8);
		 this.add(b9);
	     b9.disable(b9);
		 this.add(k1);
	     k1.disable(k1);
		 this.add(k2);
	     k2.disable(k2);
		 this.add(sh1);
	     sh1.disable(sh1);
		 this.add(sh2);
	     sh2.disable(sh2);
		 this.add(sh3);
	     sh3.disable(sh3);
		 this.add(sh4);
	     sh4.disable(sh4);
	    
		Graphics2D gr = (Graphics2D) g;
		gr.setColor(Color.BLACK);
		gr.rotate(Math.toRadians(90));
		Rectangle floor = new Rectangle(270,-440, 5, 440);
		gr.fill(floor);
		gr.rotate(Math.toRadians(270));
		Rectangle base = new Rectangle(10, 20,5, 250);
		gr.fill(base);
		
		if(c>=1){
			gr.rotate(Math.toRadians(90));
			Rectangle point1 = new Rectangle(20,-260, 5, 250);
			gr.fill(point1);
			gr.rotate(Math.toRadians(270));
			
		}
		if(c>=2){
			Rectangle point2 = new Rectangle(222, 20,5, 52);
			gr.fill(point2);
		}
		if(c>=3){
			//point3
			gr.fillOval(200, 70, 50, 50);
		}
		if(c>=4){
			//point4
			gr.fillRect(222, 120,5, 80);
		}
		if(c>=5){
			gr.rotate(Math.toRadians(45));
			Rectangle point5 = new Rectangle(240, -80, 5, 40);
			gr.fill(point5);
			gr.rotate(Math.toRadians(315));
		}
		if(c>=6){
			gr.rotate(Math.toRadians(135));
			Rectangle point6 = new Rectangle(-75,-275, 5, 30);
			gr.fill(point6);
			gr.rotate(Math.toRadians(225));
		}
		if(c>=7){
			gr.rotate(Math.toRadians(45));
			Rectangle point7 = new Rectangle(295,-22, 5, 30);
			gr.fill(point7);
			gr.rotate(Math.toRadians(-45));
		}
		if(c>=8){
			gr.rotate(Math.toRadians(135));
			Rectangle point8 = new Rectangle(-21,-325, 5, 30);
			gr.fill(point8);
			gr.rotate(Math.toRadians(-135));
			
			Font myFont2 = new Font ("Courier New", 1, 30);
			gr.setFont(myFont2);
			gr.setColor(Color.RED);
			gr.drawString("You Lost", 65, 347);
			this.add(restart);
			afterLost();
		}
		if(win){
			Font myFont2 = new Font ("Courier New", 1, 30);
			gr.setFont(myFont2);
			gr.setColor(Color.green);
			gr.drawString("You Won", 65, 347);
			this.add(restart);
			afterLost();
			
		}
		
		
		
		
		Font myFont = new Font ("Courier New", 1, 17);
		gr.setFont(myFont);
		gr.drawString(e, 130, 300);
		}
	
	public void afterLost(){
		b0.setClicket();
		b1.setClicket();
		b2.setClicket();
		b3.setClicket();
		b4.setClicket();
		b5.setClicket();
		b6.setClicket();
		b7.setClicket();
		b8.setClicket();
		b9.setClicket();
		sh1.setClicket();
		sh2.setClicket();
		k1.setClicket();
		k2.setClicket();
		sh4.setClicket();
		sh3.setClicket();
		
	}
	public void afterRestart(){
		b0.restart();
		b1.restart();
		b2.restart();
		b3.restart();
		b4.restart();
		b5.restart();
		b6.restart();
		b7.restart();
		b8.restart();
		b9.restart();
		sh1.restart();
		sh2.restart();
		k1.restart();
		k2.restart();
		sh4.restart();
		sh3.restart();
		
	}


}


