import java.util.* ;

class Combinationsum{


	static int comsum(int array[] , int n ,int target , ArrayList<ArrayList> finalans , ArrayList<Integer> ans ){

		if(target==0){

			System.out.println( ans);
			finalans.add(ans) ;
			ans.remove(ans.size()-1) ;
			// ans.clear();
			return 1 ;
		}

		if(n<0 || target<0){


			if(ans.size()>0){

				ans.remove(ans.size()-1) ;

			}

			return 0;
		}

		

		

		if(array[n]<=target){

			ans.add(array[n]);

			   
			   return comsum(array , n-1, target-array[n] , finalans , ans)  comsum(array , n-1 , target , finalans , ans);
				

			

			

		}else{

			return comsum(array , n-1 , target , finalans , ans);
		
		

			
		}


		


		
		
		
	}


	public static void main(String[] args) {
		
		int array[] = {2,4,6,8};

		int target = 8 ;
		
		ArrayList<ArrayList> finalans = new ArrayList<ArrayList>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		System.out.println(comsum(array , array.length-1 , target , finalans , ans));
		

		
	}
}