import java.util.Scanner;
class  Avg_Arry{

	int[] add(){
		int[] T = new int[3];
		Scanner s = new Scanner(System.in);

		for(int i=0 ; i< T.length; i++){
			System.out.println("Subject " +(i+1) + ":"  );
			T[i] = s.nextInt();
			}
			return T;  // for loop aken pitathata pamina return diya uthuya.
		}
	void GetAvg(int[] a){
		System.out.println("The result are :\n");

		//Avg_Arry L = new Avg_Arry();
		//int[] G = L.add(); 			  /*  return wanne reference data type akaki,
							     //aya alla ganimata reference data type akama thibiya uthuya
		int total = 0;
		for(int j=0; j< a.length ; j++){
			System.out.println("Subject " +(j+1) + ":"+a[j]);
			total = total + a[j] ;

		}System.out.println("Avg : " + total/3);
		}

	public static void main(String args[]){

		Avg_Arry A = new Avg_Arry();
		A.GetAvg( A.add() );
		}
	}


