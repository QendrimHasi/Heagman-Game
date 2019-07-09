package hangman;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;

public class Buton  extends JButton {
	private static Game game;
	private  boolean clicket;
	private static final Font font = new Font(Font.DIALOG, Font.ITALIC, 22);
	private boolean restart = false;




	public Buton(int x, int y,char t,Game game){
		clicket= false;
		this.game=game;
		this.setText(""+t);
		Font f = new Font("Arial", Font.PLAIN, 25);
		this.setFont(f);
		this.setBounds(x,y, 50, 50);
		this.setFont(font);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setVisible(true);
		this.addActionListener(new Action());
		
		
		
	}
	
	public Buton(int x, int y,String t,Game g){
		this.game=g;
		this.setText(t);
		Font f = new Font("Arial", Font.PLAIN, 25);
		this.setFont(f);
		this.setBounds(x,y, 150, 40);
		this.setFont(font);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		this.setVisible(true);
		this.addActionListener(new Action());
		
		
	}
	public void disable(Buton b){
		if(b.getClicket()){
			b.setEnabled(false);
		}
		
		
		

	}
	
	public boolean isRestart() {
		return restart;
	}
	public void setrestart() {
		this.restart = false;
	}

public  boolean getClicket() {
		return clicket;
	}
public void setClicket() {
	this.clicket = true;
}

public void restart() {
	this.clicket = false;
	this.setEnabled(true);
}

	 class Action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="Restart"){
			game.restartGame();
			restart=true;
		}else{
			
			char c=e.getActionCommand().charAt(0);
			game.check(c);
			clicket=true;
			
		}

		
	}
		
	}
	 
	 

	 
}

	

