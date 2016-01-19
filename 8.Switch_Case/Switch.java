import java.util.Scanner;

class Switch{
	public static void main(String args[]){
		System.out.println("Enter number 1/2/3/4/5:");
		while (true){
                    
		Scanner T = new Scanner(System.in);
		int x = T.nextInt();               
		final int y =  5;
                
		switch(x){
			case 1:System.out.println("X = 1");break;
			case 2:System.out.println("X = 2"); break;
			case 3:System.out.println("X = 3"); break;
			default:System.out.println("none"); break;
			case y:System.out.println("????"); break;
			 }
		}}}