import java.util.Scanner;
class  Cal{

	void add(int x , int y){
	System.out.println("addition = " +(x+y));
	}

	void mul(int x , int y){
	System.out.println("Multification = " +(x*y));
	}



	public static void main(String args[]){

	Scanner s = new Scanner(System.in);

	System.out.print("Enter numer =");
	int p = s.nextInt();
	System.out.print("Enter numer =");
	int q = s.nextInt();

	Cal c = new Cal();
	new Cal().add(p,q);
	c.mul(p,q);
	}
}

