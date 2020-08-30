class Kmp{

	public static void main(String[] args) {


		String text = "ABABDABACDABABCABAB" ;
		String find = "ABABCABAB" ;





		int lenfind = find.length();

		int pre[] = new int[lenfind];
		int index = 0 ;
		pre[index] = 0 ;
		int i = 1 ;

		while(i<lenfind){

			if(find.charAt(i)  == find.charAt(index)){

				index++ ;
				pre[i] = index ;
				i++ ;

			}

			else{

				if(index!=0){

					index = pre[index-1] ;

				}
				else{

					pre[i] = index ;
					i++ ;
				}
			}
		}

	// 	for( int l : pre)

	// System.out.print(l) ;
		
	// }

		int k = 0 ;
		int f= -1 ;
		int textlen = text.length() ;
		while(k<textlen){


			if( text.charAt(k) == find.charAt(f+1)){

				f++ ;
				k++ ;
			}

			if ( f == (lenfind-1) ){

				System.out.println(k - lenfind) ;
				f = pre[f] ;
			}

			
			else if(k<textlen && text.charAt(k) != find.charAt(f+1)){

				if(f == 0){

					k++ ;
				}
				else{

					f = pre[f-1] ;
				}
			}
		}



}
	

}