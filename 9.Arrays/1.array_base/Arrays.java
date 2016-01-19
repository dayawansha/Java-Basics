class Arrays{
	public static void main(String args[]){

		double[] x = new double[4];
		x[0]=11;
		x[1]=13;
		x[2]=32;
		x[3]=76;

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]+"\n");

		System.out.println(x.length);
		System.out.println(x + "\n");

		for(int i=0; i<4;i++){
			System.out.println(x[i]);
			}
}}