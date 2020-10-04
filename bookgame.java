import java.util.* ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class bookgame{

	static long book(ArrayList<Integer> array , int n , int k , long sum , int dp[]){

		// System.out.println(sum);

		if(n==array.size()){

			return sum ;
		}

		if(dp[n]!=-1){

			return dp[n] ;
		}

		return Math.max( book(array , n+1 , k , sum+((array.get(n))%10 ) , dp) , book(array , n+1 , k , sum*((array.get(n))%10) , dp));
	}

	public static void main(String[] args) throws IOException {







		ArrayList<Integer> array = new ArrayList<Integer>() ;


		 Scanner scanner = new Scanner(System.in);


		 String s[]= scanner.nextLine().split(" ");
for(int i =0 ;i < s.length;i++){
    array.add(Integer.parseInt(s[i]));
}

int dp[]= new int[array.size()+1];

Arrays.fill(dp , -1);
		
		System.out.println(book(array , 0 ,  50 , 0,dp) % 1000000007);

	}
}