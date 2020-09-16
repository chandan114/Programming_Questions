import java.util.* ;

class Max_product_array{

	public static void main(String[] args) {
		
		int array[] = {1,5,4,3,9,8,2,1,7};

		int max = 0 ;
		int min = 0 ;

		if(array.length==0){

			System.out.println("length 0") ;
			System.exit(0) ;
		}
		if(array.length ==2){

			int pro = array[0]+array[1] ;
			System.out.println("product is:"+pro) ;
			System.exit(0) ;

		}

		if(array.length==1){

			int pro = array[0] ;
			System.out.println("product is:"+pro);
			System.exit(0) ;
		}

		if(array[0]<array[1]){

			min =array[0] ;
			max = array [1] ;

		}
		else{

			min =array[1] ;
			max = array [0] ;

		}


		for(int i  = 2 ; i<array.length ; i++){

			if(array[i]>=min){

				if(array[i]>max){

				min = max ;
				max = array[i] ;
				}
				else{

					min = array[i];
				}

				
			}
		}

		int pro = max*min ;
		System.out.println(pro) ;
	}


}