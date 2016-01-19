import java.util.Scanner;

class Student{
	String name;
	int age;
	String nic;
	int contactNo;
	}

class Text{
	Void printStudentDetails(Student a){
		System.out.println("Name :"+a.name);
		System.out.println("age :"+a.age);
		System.out.println("nic :"+a.nic);
		System.out.println("ContactNo :"+a.contactNo);
		}

	public static void main(String args[]){
		Scanner H = new Scanner(System.in);
		Student st = new Student();

		System.out.println("Name :");
		st.name = H.next();
		System.out.println("age :");
		st.age = H.nextInt();
		System.out.println("nic :");
		st.nic = H.next();
		System.out.println("ContactNo :");
		st.contactNo = H.nextInt();

		Text C = new Text();
			C.printStudentDetails(st);
	}}
