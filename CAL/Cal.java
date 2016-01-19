class Cal{
int x =30;
int y =20;

void add(){
	System.out.println("sum = " + (x + y));
}

void sub(){
	System.out.println("sub = " + (x - y));
}

void mul(){
	System.out.println("mul = " + (x * y));
}

void devi(){
	System.out.println("devi= " + (x / y));
}

void mod(){
	System.out.println("mod = " + (x % y));
}

public static void main(){
	Cal c1 = new Cal();
	c1.add();
	c1.sub();
	c1.mul();
	c1.devi();
	c1.mod();
	System.out.print(c1.x);
	}
}



