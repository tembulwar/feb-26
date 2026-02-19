class NestedDemo{

	public static void main(String args[]){
		
		
		/*for(int i = 0; i<5 ; i++){
			for(int j = 0; j<5; j++){
				System.out.println("for loop "+ i+ " "+j);
			}
		}*/

		/*for(;;){
			for(;;){
			
			}
		}*/
		
		/*
		int i;
		for( i = 0; i<7 ; i++){
			for( i = 0; i<5; i++){
				System.out.println("for loop "+ i);
			}
		}
		System.out.println("for loop outside "+ i);

		
		/*
		i 0	      6	            6             6
		  0 1 2 3 4 5	0 1 2 3 4 5   0 1 2 3 4 5	
		*/


		/*int count=1;
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<5; j++){
				//System.out.println(count++);
				System.out.print("*");
			}
		System.out.println();
		}*/

		/*
		for(int i = 0; i<5 ; i++){
			for(int j = i; j<5; j++){
				System.out.print("*");
			}
		System.out.println();
		}*/


		/*for(int i = 0; i<5 ; i++){
			for(int j = 0; j<=i; j++){
				System.out.print("*");
			}
		System.out.println();
		}*/

		//char c = 'A';
		//int a = 66;
		//for(int i = 0; i<5 ; i++){
		//	for(int j = 0; j<=i; j++){
		//		System.out.print((char)a++);
		//	}
		//System.out.println();
		//}



		int count=65;
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<5; j++){
				System.out.print((char)count++);
			}
		System.out.println();
		}
		System.out.println((char)count++);
		System.out.println((char)count);
		System.out.println("in main()");

	}

}







/*
i      j
0	0		sop()
	1		sop()
	2		sop()
	3		sop()
	4		sop()
	5		-----	
1	0		sop()
	1		sop()

*/

