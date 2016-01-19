class Returns{
	int p,q,r,s;
	int add (int p,int q){
		int total = p+q ;
		return total;
	}

	int mul(int x){
		int a;
		int b;
		int mult = a*b ;
		return mult ;
	}

	int devi(int y){
		int c,d;
		return c/d;
		}

	public static void main(String args[]){
		Returns r = new Returns();
		int A = r.add(5,7);
		int B = r.mul(2);
		int C = r.devi(4);
		System.out.print(C);
		}
	}

