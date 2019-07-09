package hangman;

import java.util.Random;

public class Game {
	
	private String [] ekuations={"1+2+3+4=10","(1+5)*8=48","(1*10)/2=5","2*(9+1)=20",
			"1-8+9*1=2","6/2-8+9+1=5","7+5+9/3+1=16","1*8+7=15","2*4+7=15","1*9-5=4"
			,"2*3+7-5=8","(81/9)-(2-7)=14","64*((5+7)+(9-6))=90","(6*5)-(4*3)=12","7*9-5*12=3","72/3-2*5=6"
			,"1*9-5+6/2=7","2*7+4+9*4=54","3+4/2-7*2=-9","5+4+8*3-14=19"};
	
	private String ekuation="";
	private char[] ek;
	private int countl=1;
	private String e;
	private int countWin = 0;
	private int countCheck= 0;
	
	
	public Game() {
		//int rand =(int)( Math.random()*10);
		int rand = new Random().nextInt(ekuations.length);
		e = ekuations[rand];
		ek = new char[e.length()];
		for(int i = 0;i<ek.length;i++){
			if(e.charAt(i)=='='){
				for(int j =i;j<ek.length;j++){
					ek[j]=e.charAt(j);
				}
				break;
			}else{
				ek[i]='_';
				countWin++;
				
			}
			
		}
	}
	
	public void restartGame(){
		countWin=0;
		countCheck=0;
		countl=1;
		int rand = new Random().nextInt(ekuations.length);
		e = ekuations[rand];
		ek = new char[e.length()];
		for(int i = 0;i<ek.length;i++){
			if(e.charAt(i)=='='){
				for(int j =i;j<ek.length;j++){
					ek[j]=e.charAt(j);
				}
				break;
			}else{
				ek[i]='_';
				countWin++;
				
			}
			
		}
	}
	
	public String getEkuation(){
		ekuation="";
		for(int i=0; i<ek.length;i++){
			ekuation=ekuation+""+ek[i]+" ";
			
		}
		return ekuation;
	}
	public void check(char c){
		boolean b = false;
		
		for(int i=0;i<countWin;i++){
			
			
			if(e.charAt(i)==c){
				ek[i]=c;
				b=true;
				countCheck++;
			}
			
		}
		if(b==false){
			countl++;	
		}	
	}
	
	public boolean win(int countCheck){
		return (countWin==countCheck);
	}
	public int getCountCheck() {
		return countCheck;
	}

	public int getCountl() {
		return countl;
	}
}