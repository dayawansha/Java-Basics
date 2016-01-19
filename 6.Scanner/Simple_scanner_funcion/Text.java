import java.util.Scanner;
class Text{
	public static void main(String args[]){

	Scanner s = new Scanner(System.in);
	System.out.print("Enter an int number:");
	int x = s.nextInt();
	System.out.println("x = " + x);


	System.out.print("Enter an int number :");
	double y = s.nextDouble();
	System.out.println("y = " + y);

	System.out.print("Enter an int number :");
	String t = s.next();
	System.out.println("t = " + t);

	}
}