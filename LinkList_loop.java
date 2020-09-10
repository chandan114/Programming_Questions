class LinkList_loop{

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


	Node detectloop(){

		Node p = head ;
			Node q = head ;

		if(head!=null){

			

			while(p!=null){

				p = p.next.next ;
				q = q.next ;

				if(q==p){

					break;
				}
			}

			p = head ;
			while(p!=q){

				p = p.next ;
				q = q.next ;

			}




		}

		return p ;
	}


	public static void main(String[] args) {
		

		LinkList_loop ob = new LinkList_loop() ;
		ob.insert(1) ;
		ob.insert(2) ;
		ob.insert(3) ;
		head.next.next.next = head.next ;

		Node v = ob.detectloop() ;



		System.out.println(v.val);

	}
}