class Avg2{
	 int mul(int x,int y ,int z){   //   {10*(x*y*z)/5} +1
		int multe = x*y*z;
		return multe;
		}
	int mul_10(int t){
		return 10*t;
		}
	int devi_5(int n){
		return n/5;
		}
	int plus_1(int p){
		return p+1;
		}

	public static void main(String args[]){
		Avg2 c = new Avg2();
		int A = c.mul(5,5,5);
		int B = c.mul_10(A);
		int C = c.devi_5(B);
		int D = c.plus_1(C);
		System.out.println(D);
		}
	}
