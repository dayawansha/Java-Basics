class Avg{
	double add(double x ,double y,double z){
		return x+y+z ;
	}

	void sub(double d){

		System.out.println(d/3);
	}

	public static void main(String args[]){
		Avg c = new Avg();
		double a = c.add(5,6,4);
		c.sub(a);

	}
}

