import java.util.Arrays ;
import java.util.Comparator ;

class Jobsequencing{


	class jobslist{

		int job ;
		int val ;

		jobslist(int val , int job){

			this.val = val ;
			this.job = job ;

		}
	}


	int maxvaljob(int job[] , int val[] , int t){


		boolean visited[] = new boolean[t] ;
		int profit = 0 ;
		Arrays.fill(visited , false) ;

		jobslist[] ob = new jobslist[job.length] ;

		for(int i = 0 ; i < job.length ; i++){

			ob[i] = new jobslist(val[i] , job[i]);
		}


		Arrays.sort(ob , new  Comparator<jobslist>(){


			@Override
			 public int compare(jobslist o1, jobslist o2)
            { 
                if(o2.val>o1.val)
                	return 1;

                return -1;
            } 

		});


		for(int i = 0 ; i < job.length ; i++){



			for(int j = Math.min( t-1 , (int)ob[i].job - 1 ) ; j > -1 ; j--  ){


				if( !(visited[j]) ){

					visited[j] = true ;
					profit+=  (int)ob[i].val ;
					break ;
				}
			}
		}
		

		for(jobslist i : ob  ){

			System.out.println((int)i.val) ;
		
		}


		System.out.println(profit) ;
		return 0;
	}


	public static void main(String[] args) {

		Jobsequencing k = new Jobsequencing();
		
		int job[] = {2,1,2,1,3} ;
		int val[] = {100,18,27,25,15};
		int t =3 ;
		k.maxvaljob(job , val ,t) ;
		

	}
}