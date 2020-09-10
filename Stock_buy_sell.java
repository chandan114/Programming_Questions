import java.util.* ;

class Stock_buy_sell{

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4} ;
		int minval = arr[0] ;
		int diff = 0 ;

		for(int a : arr){

			minval = Math.min(a , minval);

			diff = Math.max((a-minval) , diff);
		}

		System.out.println(diff) ;
	}
}