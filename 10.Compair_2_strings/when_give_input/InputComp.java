import java.util.Scanner;
class InputComp{

	public static void main(String args[]){
		String A = "aaa";
		String B = "BBB";
		String C = "AAA";
		String D = "BBB";

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String input = s.next();

		if ("AAA".equalsIgnoreCase(input))
			System.out.println("INPUT equal to AAA");
		else
			System.out.println("INPUT not equal to AAA");

		}}