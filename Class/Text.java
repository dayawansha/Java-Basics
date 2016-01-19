class A{
 	int x = 10;
	void m(){
		System.out.println("m methode");
	}
	void d(){
		System.out.println("d methode");
	}
}
class B{
	int y = -10 ;
	String s = "ABC" ;
	void e(){
		int f = 5;
		System.out.println("e methode");
	}
}
class Text{
	public static void main(String args[]){

		A a = new  A();
		a.d();                          //  d methode //
		System.out.println(a.x);			// 10 //
		a.m();							// m methode //

		B b = new B();
		b.e();							// e methode //
		System.out.println(b.y);			// -10 //
		System.out.println(b.s);			// ABC //
	}
}




