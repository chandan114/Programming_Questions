import java.util.* ;
class Sort_0_1_2{


	static void swap( int arr[] , int low , int high){

		int temp = arr[low] ;
		arr[low] = arr[high] ;
		arr[high] = temp ; 
	}



	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in) ;

		int arr[] = {0,1,0,1,0,2,2,0} ;


		int mid = 0 ;
		int high = arr.length -1 ;
		int low = 0 ;

		while(mid<=high){


			if(arr[mid]==0){

				swap( arr ,low, mid) ;
				low++ ;
				mid++ ;
			}
			else if (arr[mid]==1) {
				
				mid++ ;
			}
			else if(arr[mid] == 2){

				swap(arr ,mid , highn) ;
				high-- ;
			}
		}

		for(int n : arr){

			System.out.println(n) ;
		}



	}
}