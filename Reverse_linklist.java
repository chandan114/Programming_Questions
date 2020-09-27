class Reverse_linklist{

	static Node head = null;

	class Node{

		

		int val ;
		Node next ;

		Node(int val){

			this.val = val ;
			this.next = null ;

		}

	}

	public void insert(int val){

		Node node = new Node(val);

		if(head==null){

			head = node ;
		}
		else{

			Node curr = head ;
			while(curr.next!=null){

				curr = curr.next ;
			}

			curr.next = node ;

		}

	}


	void reverse(){

		if(head!=null){

			if(head.next!=null){

				Node q = null ;
				Node p = head.next ;


				while(p!=null){

					head.next = q ;
					q = head ;
					head = p ;
					p  = p.next ;


				}

				head.next = q;



			}
		}

	}

	


	


	public static void main(String[] args) {
		

		Reverse_linklist ob = new Reverse_linklist() ;
		ob.insert(1) ;
		ob.insert(2) ;


		// ob.reverse(4) ;

		ob.reverse() ;

		while(head!=null){

			System.out.println(head.val) ;
			head = head.next ;
		}
		



	}
}