import java.util.Scanner;

class Text1_1{
	String name;
		int age;
	String nic;

	void printStudentInformation(Text1_1 a){
		System.out.println("\nName : "+a.name);  			/* when you run a = st, then st.name = s.next()____*/
		System.out.println("age : "+a.age);					/*___"The input is linked to print statement/anam input aka link wee atha print ststement akata " */
		System.out.println("NIC : "+a.nic);
		}


	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Text1_1 st = new Text1_1();
/************************/

		System.out.print("Name : ");
		st.name =s.next();
		System.out.print("age : ");
		st.age =s.nextInt();
		System.out.print("NIC : ");
		st.nic =s.next();


		Text1_1 t =new Text1_1();
			t.printStudentInformation(st);
		}}