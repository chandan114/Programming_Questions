class Set_String{


	static int print(String array[] , String s , int n){


			// System.out.println(c) ;

			if(n==array.length){

				System.out.println(s) ;
				return 1;
			}


			int c = print(array , s+array[n] , n+1) + print(array , s , n+1 );

			return c ;


			

		}

	public static void main(String[] args) {


			String s  = " " ;
		
			String array[] = {"a","b"} ;
			System.out.println(print(array , s , 0))  ;
	}
}

