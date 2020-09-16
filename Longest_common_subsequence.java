import java.util.* ;

class Longest_common_subsequence{

	public static void main(String[] args) {
		
		int arr[] = { 5,12,18,9,3,1,2,80,4} ;
		Hashtable<Integer , Integer> s = new Hashtable<Integer , Integer>() ;
		int max = 0 ;

		for(int i : arr){

				s.put( i , 1) ;

		}

		for(int i = 0 ; i < arr.length ; i++){

			int c = 1 ;
 
			if( (s.containsKey( (arr[i]) -1) ) ){

						
						continue ;
					}
				else{

				

				while(s.containsKey( (arr[i])+c )){
					
					c++ ;
					max = Math.max(max , c);

				}
			}
		}

		System.out.println(max) ;

	}
}