class LevelOrderTraversalOfBinarySearchTree{

	public static Node root = null;

	class Node{

 		int val ;

 		Node left , right ;

 		Node(int val){

 			this.val =val ;
 			right = left = null ;

 		}
 	}


 	Node insert(Node node , int val){

 		if(root==null){

 			root = new Node(val);
 		}

 		if(root!=null){


 			if(node==null){

 				node = new Node(val);
 				return node ;
 				
 			}

 			if(val < node.val){

 				node.left = insert( node.left , val) ;
 			}
 			else{

 				node.right = insert(node.right , val) ;
 			}

 		}

 		return node ;
 	}

 	static void Leveltraversal(Node node , int level){

 		if(level>=0){

 			if(node!=null){

 			if(level==0){

 				System.out.println(node.val);

 			}

 			Leveltraversal(node.left, level-1);
 			Leveltraversal(node.right , level-1);
 		}
 		}

 		

 	}


 	public static void main(String[] args) {
 		

 		LevelOrderTraversalOfBinarySearchTree ob = new LevelOrderTraversalOfBinarySearchTree() ;
 		ob.insert(root , 50) ;
 		ob.insert(root , 40) ;
 		ob.insert(root , 10) ;
 		ob.insert(root , 60) ;
 		ob.insert(root , 78) ;
 		ob.insert(root , 42) ;

 		for(int i = 0 ; i<4 ; i++){

 			Leveltraversal(root , i);
 		}
 	}
}