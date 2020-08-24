class Node{

	int data ;
	Node Next;
	Node head;

	Node(int data){

		this.data = data ;
		this.Next = null;
	}


// Delete the head ------------------------------------------------------------------

	void delhead(){
		

		head = head.Next ;
	}

	

// Insert at start-------------------------------

	void start(int elemnet){

		Node newnode = new Node(elemnet) ;
		newnode.Next = null ;

		Node temp = head ;
		head = newnode ;
		head.Next = temp ;


	}


// insert at end-------------------------------------------------------------------------------

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

	// delete eery kth Node---------------------------------------------------------------------------------

	void kthnode(int kval){

		int count = 1 ;

		Node temp ;
		temp = head ;
		while(temp.Next != null){

			
			count++;

			if(count == kval){

				if(temp.Next.Next == null){
					temp.Next = null ;
					continue ;
				}

				temp.Next = temp.Next.Next ;
				count = 1;

			}


			temp = temp.Next ;
		}

		


	}


	// delete dup val in link list sorted--------------------------------------------------

	void duplicateval(){

		

		Node temp ;
		temp = head ;
		while( temp.Next != null){
				

				Node d = temp ;
				while(d.data == temp.Next.data){

					temp = temp.Next ;


				}

				

			d.Next =  temp.Next ;

				

			temp = temp.Next ;


			}



	

			

		


	}

// Get nth element from link list -------------------------------------------------------------

	int getmyel(int position) {


	Node temp = head ;
	int count = 1 ;
	while(temp != null){


		System.out.println(count) ;

		if( count == position ){

			return temp.data ;

		}

		count++ ;

		temp = temp.Next ;

	

	}

return  0 ;

}


}

class LinkList{



	public static void main(String[] args) {



	Node node  = new Node(0) ;
	node.insert(4) ;
	node.insert(10) ;
	node.insert(100) ;
	node.insert(88) ;
	node.insert(100);
	node.insert(9);
	
	System.out.println("data : "+node.getmyel(4) ) ;
	
Node headdata = node.head ;
	while(headdata!=null){
		
		System.out.println("val:"+headdata.data);
		headdata = headdata.Next ;

	}





	}

} 