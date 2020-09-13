class ReversePairs{


		int sort(int low , int high , int array[]){

		int c = 0;

		if(low<high){

			int mid = (low+high)/2 ;

			c+=sort(low , mid , array);
			c+=sort(mid+1 , high , array) ;
			c+=merge(low , mid , high , array);
		}

		return c;
	}

	int merge(int low , int mid ,int high , int array[]){

		int  n1 = mid - low + 1;
		int n2 = high - mid;

		int l[] = new int[n1];
		int r[] = new int[n2];



		for(int i=0 ; i<n1 ; ++i){

			l[i] = array[low+i] ;
		}

		for(int j=0 ; j<n2 ; ++j){

			r[j] =  array[mid + 1 + j];
		}

		int p = 0 ;
		int c= 0 ;

		 for(int i = 0 ; i < n1 ; i++){

		 	while(p<n2){

		 		if(l[i] > 2*r[p]){
		 			p++ ;
		 		}
		 		else{

		 			break;
		 		}

		 		
		 	}

		 	c+=p;



		 }


		int i = 0 , j = 0 , k = low  ;
		

		while(i<n1 && j<n2){




			if(l[i]<=r[j]){

				array[k] = l[i] ;
				i++ ;


			}else {
				
				array[k] = r[j] ;
				j++ ;
				
			}

			k++ ;
		}

		while(i<n1){

			array[k] = l[i] ;
			i++ ;
			k++ ;


		}

		while(j<n2){

			array[k] = r[j] ;
			j++ ;
			k++ ;


		}

		return(c);
	}

	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 


	public static void main(String[] args) {
			

			int arr[] = {1,3,2,3,1}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        ReversePairs ob = new ReversePairs(); 
        System.out.println(ob.sort(0, arr.length - 1 ,arr)); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 


	}
}