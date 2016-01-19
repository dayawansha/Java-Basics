import java.util.Scanner;

class Cal{
	void m(){
	System.out.print("cal class");
}
	}
class  Student{

	public static void main(String args[]){

		Student[] A = new Student[4];
		Student x = new Student();
		A[0] = new Student();
		A[1] = x;

		//  int[] T = new int[5];
		//  A[2] = T;   comple error-- found int[], required student

		// Student[] B = new Student[4];
		// A[2] = B;		// comple error-- found Student[], required Student

		//Cal Y = new Cal();
		// A[3] = Y;

		System.out.println(A[0]);
		System.out.println(A[1]);
}}

