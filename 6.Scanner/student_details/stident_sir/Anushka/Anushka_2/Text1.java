import java.util.Scanner;

class Text1{
	String name;
		int age;
	String nic;

	void printStudentInformation(Text1 a){
		System.out.println("\nName : "+a.name);
		System.out.println("age : "+a.age);
		System.out.println("NIC : "+a.nic);
		}
	Text1 changeName(Text1 a){
		a.name = "kamal";
		return a;
		}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Text1 st=new Text1();

		System.out.println("Enter student information");
		System.out.print("Name : ");
		st.name =s.next();
		System.out.print("age : ");
		st.age =s.nextInt();
		System.out.print("NIC : ");
		st.nic =s.next();

		Text1 t =new Text1();
			t.printStudentInformation(st);
			st = t.changeName(st);
			t.printStudentInformation(st);

		}
	}