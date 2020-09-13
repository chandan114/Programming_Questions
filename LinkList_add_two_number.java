class LinkList_add_two_number{

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


	Node addnumber(Node head1 , Node head2){

		int sum = 0 , carry = 0 ;
		Node temphead = null ;
		Node pre = null;
		Node node = null;

		while(head1!=null || head2!=null){

			sum = carry + (head1!=null?head1.val:0) + (head2!=null?head2.val:0) ;

			carry = (sum >= 10) ? 1 : 0; 
  
            sum = sum % 10; 

            node = new Node(sum) ;

            if(temphead == null){

            	temphead = node ;

            }
            else{


            	pre.next  = node ;
            }

             pre = node;


              if (head1 != null) { 
                head1 = head1.next; 
            } 
            if (head2 != null) { 
               head2 =head2.next; 
            }

	}

	if (carry > 0) { 
            node.next = new Node(carry); 
        } 

        return temphead ;
	}




		
	


	public static void main(String[] args) {
		

		LinkList_add_two_number ob = new LinkList_add_two_number() ;
		ob.insert(1) ;
		ob.insert(2) ;
		ob.insert(5) ;

		LinkList_add_two_number ob2 = new LinkList_add_two_number() ;
		ob.insert(1) ;
		ob.insert(2) ;
		ob.insert(3) ;


			
		LinkList_add_two_number ob3 = new LinkList_add_two_number() ;
		ob3.head = ob3.addnumber(ob.head , ob2.head) ;


		while(ob3.head != null){

		System.out.println(ob3.head.val);
		ob3.head = ob3.head.next ;

	}

}

}
