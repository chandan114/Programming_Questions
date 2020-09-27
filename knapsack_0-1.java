class knapsack_0{





	static int knap(int weight[] , int n , int val[] , int target , int dp[][]){

		if(n<0 || target==0){

			return 0 ;
		}

		if(dp[n][target] != - 1){

			return dp[n][target] ;
		}



		if(target>=weight[n]){

				return dp[n][target]= Math.max(val[n] + knap(weight , n-1 , val ,target - weight[n] , dp) ,  knap(weight , n-1 , val ,target ,dp)) ;

		}
		else{

			return dp[n][target]= knap(weight , n-1 , val ,target, dp) ;
		}




		

	}

	public static void main(String[] args) {
			

		int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        int n = val.length;
        int dp[][] = new int[wt.length+1][W+1] ;

        for (int i = 0; i < n; i++) {

        	 for (int j = 0; j < W + 1; j++){

        	 		dp[i][j] = -1; 
        	 }
            
        }
       

       	System.out.print(knap(wt , n-1 , val , W , dp) );



       	for (int i = 0; i < n; i++) {

        	 for (int j = 0; j < W + 1; j++){

        	 	System.out.print(	" "+dp[i][j] );
        	 }

        	 System.out.println('\n');
            
        }

	}
}