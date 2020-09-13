class LinkList_merge{

	Node head = null;

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


Node merge(Node head1 , Node head2){


	Node temp ;
	Node temp2 ;

	if(head1==null){

		return head2;
	}

	if (head2==null) {
		
		return head1;
	}

	if(head1.val<head2.val){

		temp2 = head1;

		temp = head1 ;
		head1 =head1.next ;
	}
	else{

		temp2 = head2 ;
		temp = head2;
		head2 = head2.next ;
	}

	while(head1!=null && head2!=null){


		

		if(head1.val <= head2.val){


			// System.out.println(head2.val);

			temp.next = head1 ;
			head1 = head1.next;
			temp = temp.next ;

		}
		else{

			// System.out.println(head1.val);

			temp.next = head2;
			head2 = head2.next;
			temp = temp.next ;
		}


	}

	if(head2!=null){

		temp.next = head2 ;
	}else{

		temp.next = head1 ;
	}

	return temp2 ;

}


	


	public static void main(String[] args) {
		

		LinkList_merge ob = new LinkList_merge() ;
		ob.insert(2) ;
		ob.insert(8) ;
		ob.insert(12) ;

		LinkList_merge ob2 = new LinkList_merge() ;

		ob2.insert(3);
		ob2.insert(5);
		ob2.insert(9);
		ob2.insert(16);

		LinkList_merge ob3 = new LinkList_merge() ;
		ob3.head = ob3.merge(ob.head , ob2.head) ;



		while(ob3.head != null){

		System.out.println(ob3.head.val);
		ob3.head = ob3.head.next ;

	}

	}
}