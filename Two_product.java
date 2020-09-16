
import java.util.* ;
class Two_product{

	public static void main(String[] args) {
		
		int array[] = {1,2,3,1,4,5,6,9,7} ;
		int target = 35;
		HashSet<Integer> s  = new HashSet<Integer>();

		for(int i : array){


			if(target%i==0){

				int val = target/i ;
				// System.out.println(""+i+" "+val);

				if(s.contains(val)){

					System.out.println(""+i+" "+val);
					break;
				}else
			{
				s.add(i);
			}

			}
			
		}
	}
}