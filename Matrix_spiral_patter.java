import java.util.Scanner ;

class Matrix_spiral_patter{

	// int print( int arr[][] , int n , int col , int row){

	// 	if(col>n-1){

	// 		return 0;
	// 	}

	// 	if( row == 0){
	// 		row = n-3
	// 		print(arr , n , col , row)
	// 	}

	// 	if(col != (n-1) ){

	// 		while(true) {
				
	// 			arr[row][col] = 

	// 	}

	// 	}

	// 	if(col == n-1){

	// 		for ( int i = n-2 ; i >= 0 ; i-- ) {
				


	// 	}
	// 	}
		
	// }

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int[][] arr = new int[n][n];
		int count = 0 ;

		int row = n-2 ;
		int num = 1 ;
		for(int i = 0 ; i < n-2 ; i++){

			for(int j = 0 ; j < n-1 ; j++){

				if(count == n-2){

					num++ ;
					count = 0 ;

				}
				arr[row][i] = num ;
				row-- ;
				count++ ;
			}

			row = n-2 ;

		}

		int col = n-2;
		for ( int i = 0; i<n-1 ; i++ ) {
			
			arr[i][col] = n;
		}


		for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n-1; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
  
            System.out.println(); 
        } 
	}
}