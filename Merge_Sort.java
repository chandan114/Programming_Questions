class Merge_Sort{


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


		int i = 0 , j = 0 , k = low , c = 0 ;

		while(i<n1 && j<n2){

			if(l[i]<=r[j]){

				array[k] = l[i] ;
				i++ ;


			}else {
				
				array[k] = r[j] ;
				j++ ;
				c+= (n1-i) ;
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
			

			int arr[] = { 3,1,2}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        Merge_Sort ob = new Merge_Sort(); 
        System.out.println(ob.sort(0, arr.length - 1 ,arr)); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 


	}
}