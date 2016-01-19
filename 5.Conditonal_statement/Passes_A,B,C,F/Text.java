import java.util.Scanner;

class Text{

	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		System.out.print(" Enter marks : ");
		int marks = s.nextInt();

		if (marks >= 75){
			System.out.println(" A pass ");

		}else if (marks >= 65){
			System.out.println(" B pass ");

		}else if (marks >= 55){
			System.out.println(" C pass ");

		}
	}
}