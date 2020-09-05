class Repeat_and_missing_number{

	public static void main(String[] args) {
		
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 } ;
		int a = 0 ;
		int sum = 0 ;
		int rep = 0;


		for(int i = 0 ; i< arr.length; i++){

			if(arr[Math.abs(arr[i])-1] > 0){

				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}
			else{

				System.out.println(Math.abs(arr[i])) ;
				rep = Math.abs(arr[i]) ;
			}

			sum = sum + Math.abs(arr[i]) ;
		}

		int n = arr.length ;
		int x = Math.abs(sum - rep) ;
		int ans =Math.abs(Math.floorDiv((n*(n+1)) , 2 ) - x );
		System.out.println( ans  );
	}
}