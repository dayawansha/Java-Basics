class Var_args2{
	void add(int...x){

		int total = 0;  // mehidi total wa for loop aken pitatha define kala uthuya,nathahoth wada nokaray....

		for(int i=0; i<x.length;i++){
			System.out.print( x[i] +" , ");
			total = x[i] + total;
			System.out.println("total =" +total );
			}
			System.out.println();
			}
			public static void main(String args[]){
				 Var_args2 T = new  Var_args2();
				 T.add(2,4);
				 T.add(2,6,1);
				 }}