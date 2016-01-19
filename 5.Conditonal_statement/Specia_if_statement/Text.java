class Text{
	boolean m(){
		System.out.println("m methode");
		return false;}

	public static void main(String args[]){
		Text H = new Text();
		if (!H.m())
			System.out.println("line A");
		else
			System.out.println("line B");
		}}