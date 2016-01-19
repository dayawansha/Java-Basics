import java.util.Scanner;
class Student{


	public static void main(String asgs[]){

		Scanner s = new Scanner(System.in);

		System.out.print("Name: ");
		String A = s.next();

		System.out.print("age: ");
		int B = s.nextInt();

		System.out.print("nic: ");
		int C = s.nextInt();

		System.out.print("contactNo: ");
		int D = s.nextInt();

		System.out.println("Name :" + A);
		System.out.println("age: " + B);
		System.out.println("nic: " + C);
		System.out.println("contactNo: " + D);
		}
}