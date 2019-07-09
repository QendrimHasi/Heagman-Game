package hangman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JRootPane;

public class Test {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	    frame.setSize(500,600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    StickPerson fig1=new StickPerson();
	    Container c = frame.getContentPane();
	    c.add(fig1, BorderLayout.CENTER);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	    new runStickPerson(frame).run();
	}

}
class runStickPerson{
	private Frame f;
	public runStickPerson(Frame f){
		this.f=f;
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(100);
			
			}catch(Exception e){}
			f.repaint();
			
		}
	}
}
