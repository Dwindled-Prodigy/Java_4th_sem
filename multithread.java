import java.util.*;

class square extends Thread{
	int x;
	square(int n){
		x=n;
	}
	
	public void run() {
		System.out.println("Square of "+x+" is "+x*x);
	}
}

class cube extends Thread{
	int x;
	cube(int n){
		x=n;
	}
	
	public void run() {
		System.out.println("Cube of "+x+" is "+x*x*x);
	}
}

class number extends Thread{
	public void run() {
		Random random=new Random();
		
		for(int i=0;i<10;i++) {
			int randint=random.nextInt(100);//generates random number from 0-100
			System.out.println("Random number generated is "+randint);
			
			square s=new square(randint);
			s.start();
			
			cube c=new cube(randint);
			c.start();
			
			try {
				Thread.sleep(1000);
				System.out.println(); //just to go to next line
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}		
	}
}

public class multithread {

	public static void main(String args[]) {
		System.out.println("Darshan Kumar T \r\n"
				+ "CSE A section\r\n"
				+ "4th Sem");
		number n=new number();
		n.start();
	}
}
