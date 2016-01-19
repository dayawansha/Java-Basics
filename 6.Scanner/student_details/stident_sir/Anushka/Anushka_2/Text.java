import java.util.Scanner;

class Student{
	String name;
	int age;
	String nic;
	}

class Text{
	void printStudentInformation(Student a){
		System.out.println("\nName : "+a.name);
		System.out.println("age : "+a.age);
		System.out.println("NIC : "+a.nic);
		}
	Student changeName(Student a){
		a.name = "kamal";
		return a;
		}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Student st=new Student();

		System.out.println("Enter student information");
		System.out.print("Name : ");
		st.name =s.next();
		System.out.print("age : ");
		st.age =s.nextInt();
		System.out.print("NIC : ");
		st.nic =s.next();

		Text t =new Text();
			t.printStudentInformation(st);
			st = t.changeName(st);
			t.printStudentInformation(st);
	}
		}