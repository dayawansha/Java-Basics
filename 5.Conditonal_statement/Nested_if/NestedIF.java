import java.util.Scanner;
class NestedIF{

	public static void main(String args[]){
		Scanner H = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = H.nextInt();

		if (marks >= 50)
			if (marks >= 75)
				System.out.println("A pass");

			else
				System.out.println("Try to A");
		else
			System.out.println("Try");
				}
	}