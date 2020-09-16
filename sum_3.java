import java.util.HashSet ;

class Sum_3{

	public static void main(String[] args) {
		
		int array[] = { 1 , 4 , 8 , 3 , 12 , 2 , 6} ;
		int target = 12;
		int c = 0 ;
		

		for(int i = 0 ; i < array.length ; i++){

			if(c == 1){
				break ;
			}
			HashSet<Integer> s = new HashSet<Integer>() ;
			int sum = target - array[i] ;


			for(int j=i+1 ; j < array.length ; j++){

				int res = sum  - array[j] ;

				if(s.contains(res)){

					System.out.println(""+array[i]+" "+array[j]+" "+res) ;
					c = 1;
					break ;


				}else{

					s.add(array[j]);
				}
			}
		}
	}
}