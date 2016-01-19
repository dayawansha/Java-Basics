import java.util.Scanner;

class Student{
	String name;
	int age;
	String nic;

	}

class Text1{
	void printStudentInformation(Student a){
		System.out.println("\nName : "+a.name);  			/* when you run a = st, then st.name = s.next()____               */
		System.out.println("age : "+a.age);			/*         ___"The input is linked to print statement/anam input aka link wee atha print ststement akata " */
		System.out.println("NIC : "+a.nic);
		}

	void Changename(Student b){
		b.name = "Nimal";
		}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Student st=new Student();
/************************/

		System.out.print("Name : ");
		st.name =s.next();
		System.out.print("age : ");
		st.age =s.nextInt();
		System.out.print("NIC : ");
		st.nic =s.next();


		Text1 t =new Text1();
			t.printStudentInformation(st);
		}}