class Node{

	int data ;
	Node Next;
	Node head;

	Node(int data){

		this.data = data ;
		this.Next = null;
	}

	void insert(int elemnet){

		
		Node newnode = new Node(elemnet) ;
		newnode.Next = null ;

		if(head == null){
			head = newnode ;
		}
		else {


			Node current = head ;
			while(current.Next!= null){

				current = current.Next ;
			}

			current.Next = newnode ;



		}



	}


void sortinsert(int val){

	Node newnode = new Node(val) ;
	newnode.Next = null ;
	

	Node temp = head  ;

	if(temp.Next==null){

		if(newnode.data>temp.data){
			temp.Next = newnode  ;

		}
		else{

			head = newnode ;
			head.Next = temp ;
			
		}

	}

	else
	{
	while(temp.Next !=null){

		if(newnode.data < temp.Next.data){

			newnode.Next  = temp.Next ;
			temp.Next = newnode ;
			
			break ;

		}

		temp = temp.Next ;

	}
}
}

}


class insertinsortedlinklist{



	public static void main(String[] args) {



	Node node  = new Node(0) ;
	node.insert(1) ;
	node.insert(2) ;
	node.insert(3) ;
	node.insert(4) ;
	node.insert(5);
	node.insert(6);
	node.sortinsert(2) ;
	
Node headdata = node.head ;
	while(headdata!=null){
		
		System.out.println("val:"+headdata.data);
		headdata = headdata.Next ;

	}





	}

} 