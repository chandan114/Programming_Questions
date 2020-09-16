import java.util.HashSet;

class Sum_2{

	public static void main(String[] args) {


		HashSet<Integer> s = new HashSet<Integer>() ;
		
		int array[] = {1,7,3,4,5,7} ;
		int target = 14 ;

		for(int i : array){

			int a = target - i ;

			if(s.contains(a)){

				System.out.println("" + i + "," + a);
			}
			else{

				s.add(i) ;
			}
		}

		

		


	}
}