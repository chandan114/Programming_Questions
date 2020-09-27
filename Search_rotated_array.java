class Search_rotated_array{

	static int binary(int array[] , int low , int high , int key){

		while(low<high){

			int mid = (low + high)/2 ;

			if(array[mid] == key ) {

				return 1 ;
				


			}
			else if(key>array[mid]){

				low = mid+1;
			}
			else{

				high = mid;
			}

		}

		return 0;
	}

	static int findpivot(int array[]){

		for (int i=0; i<array.length-1;i++ ) {
			
			if(array[i] > array[i+1]){

				return i+1 ;
			}
		}

		return 0 ;
	}


	static int rotatedarray(int array[] , int key){

		int pivot = findpivot(array) ;

		if(binary(array , 0 , pivot , key)==1){

			System.out.println("yes") ;
		}
		else if (binary(array , pivot , array.length , key)==1) {
				
				System.out.println("yes") ;
		}
		else{

			System.out.println("NO") ;
		}

		return 0;

	}

	public static void main(String[] args) {
		
		int array[] = {4,5,6,7,8,1,2} ;

		rotatedarray(array , 61);
	}
}