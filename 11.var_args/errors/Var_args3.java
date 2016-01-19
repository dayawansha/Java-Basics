class Var_args3{
	void add(int y,int...x){

		for(int i=0; i<x.length;i++){
			System.out.print( x[i] +",");
			}
			System.out.println();
			}
			public static void main(String args[]){
				 Var_args3 T = new  Var_args3();
				 T.add(2,4);
				 T.add(2,6,1);
				 }}