class Var_args{
	void array(int...x){
		for(int i=0; i<x.length;i++){
			System.out.print(x[i] +",");
			}
			System.out.println();
			}
			public static void main(String args[]){
				 Var_args T = new  Var_args();
				 T.array(2,4);
				 T.array(2,11,33);
				 T.array();
				 T.array(5,6,5,8,6,31);
				 }}