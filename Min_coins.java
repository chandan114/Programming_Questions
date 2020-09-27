class Min_coins{


	static int minsum(int target , int array[] ){

		int dp[][] = new int[array.length+1][target+1] ;

		Arrays.fill(dp , -1) ;

		 if(target==0){

		 	return(0);
		 }

		 

		 for (int j=0; j<target+1 ; j++ ) {


		 	for(int i = 0 ; i<array.length+1 ; i++){




		 	if(array[i] <= j){

		 		

		 			p[j][i]  = minsum(j-array[i] , array) ;
		 		
		 	}else{

		 		int val = dp[j][i];
		 	}
 
		 	if(dp[j][i]==-1){

		 	

		 	dp[j][i] = Math.min(val+1 , ans) ;

		 	}else{



		 	}

		 	return dp[j][i] ;

		 	
		 }

		 

		 	
		 }

		 return dp[array.length][target] ;
		 

		 
		 
	}

	public static void main(String[] args) {
		

		int array[] = {5,1,7} ;
		int target = 19 ;

		System.out.print(minsum(target , array)) ;
	}
}