class ArrayDemo{

	public static void main(String args[]){
	
	//int arr[] = {1,2,3,4,5};
	//int arr[] = new int[10];	
	//float floatArr[] = new float[10];

	/*System.out.println(arr[0]);
	System.out.println(arr[0]);
	System.out.println(arr[0]);
	System.out.println(arr[0]);
	System.out.println(arr[0]);
	*/
	
	//System.out.println("Length :"+arr.length);
	/*for(int i=0; i<=5; i++){
		System.out.println(arr[i]);
	}*/	

	/*for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" " +i);
	}
	
	System.out.println();
	for(int i=0; i<floatArr.length; i++){
		System.out.print(floatArr[i]);
	}*/

	/*int [][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			};*/

	
	
		
	//System.out.println(arr[0][0]);
	//System.out.println(arr[2][2]);


	// 2d array
	int arr[][] = new int[3][3];
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	System.out.println(arr[1].length);
	System.out.println(arr[2].length);

	for(int i=0; i<=2; i++){
		for(int j=0; j<=2; j++){
			System.out.print(arr[i][j]+" ");
		}
	System.out.println();

	}
	/*
		i	j
		0	0
			1	
			2
			3 f
		1  	0

0 0 0 
0 0 0
0 0 0 



	*/


















	}
}