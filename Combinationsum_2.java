import java.util.* ;

class Combinationsum_2{


	static int comsum(int array[] , int n ,int target , ArrayList<ArrayList> finalans , ArrayList<Integer> ans ){

		if(target==0){

			System.out.println( ans);
			finalans.add(ans) ;
			ans.remove(ans.size()-1) ;
			// ans.clear();
			return 1 ;
		}

		if(n==array.length || target<0){


			if(ans.size()>0){

				ans.remove(ans.size()-1) ;

			}

			return 0;
		}

		

		

		if(array[n]<=target){

			
			

			ans.add(array[n]);



			   

			   	comsum(array , n+1, target-array[n] , finalans , ans);


			   	if(n==7){

			   		return 0 ;
			   	}

			   	if(array[n]==array[n+1]){

			   		comsum(array , n+2 , target , finalans , ans);
			   	}
			   	else{

			   		 comsum(array , n+1 , target , finalans , ans);
			   	}

			

			

		}else{

			 comsum(array , n+1 , target , finalans , ans);
		
		

			
		}

		return 0 ;


		


		
		
		
	}


	public static void main(String[] args) {
		
		int array[] = {1,1,2,5,5,6,7,8};

		int target = 8 ;
		
		ArrayList<ArrayList> finalans = new ArrayList<ArrayList>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		System.out.println(comsum(array , 0 , target , finalans , ans));
		

		
	}
}