class Rotate_LinkList{

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

	void rotate(){

		Node temp  = head ;

		while(temp.next.next!=null){

			temp = temp.next ;
		}

		temp.next.next = head ;
		head = temp.next;
		temp.next = null ;
	}


	


	public static void main(String[] args) {
		

		Rotate_LinkList ob = new Rotate_LinkList() ;
		ob.insert(1) ;
		ob.insert(2) ;
		ob.insert(3) ;
		ob.insert(4) ;

		ob.rotate();

		while(head!=null){

			System.out.println(head.val) ;

			head = head.next ;
		}



	}
}