class Text{
	void m (){
		int x = 10;
		int y = 20;
		System.out.println(x+y);
	}

	int d(){
		int x = 10;
		int y = 20;
		int total = x+y;
		return total;
	}

	public static void main(String args[]){
		Text t = new Text();
		t.m();
		int x = t.d();
		System.out.println("cccccc"+ (x));
	}
}
