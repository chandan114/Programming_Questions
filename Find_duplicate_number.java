import java.util.* ;

class Find_duplicate_number{

	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in) ;

		int arr[] = {1 , 3 , 6 , 4 , 2 , 3 , 5 , 2} ;

		int slow = arr[0];
		int fast = arr[0];


		do{

			slow = arr[slow] ;
			fast = arr[ arr[fast]] ;
		}while(slow!=fast) ;

		fast = arr[0] ;

		while(slow!=fast){

			slow = arr[slow] ;
			fast = arr[fast]  ;

		}

		System.out.println(slow) ;
	}
}