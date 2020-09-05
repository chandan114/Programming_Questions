class Merge_two_sorted_array{

	public static void main(String[] args) {
		
		int arr1[] = { 2 , 10 , 18} ;
		int arr2[] = { 3 , 5 , 12,16};

		int arr1len  = arr1.length ;
		int arr2len = arr2.length ;

		int i =0 ;
		

		while(i < arr1len){

			if(arr1[i]>arr2[0]){

				int temp = arr1[i] ;
				arr1[i] = arr2[0] ;
				arr2[0]=temp ;


				int key = arr2[0] ;
				int j =  1 ;
				while(j<arr2len && arr2[j]<key){

					arr2[j-1] = arr2[j] ;
					j++ ;
				}

				arr2[j-1] = key ;

			}

			i++ ;

		}
		for(int n: arr1){

			System.out.println(n) ;
		}

		for(int n: arr2){

			System.out.println(n) ;
		}


	}
}