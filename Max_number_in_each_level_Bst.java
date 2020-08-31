 import java.util.*;

 class Max_number_in_each_level_Bst{

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

 	void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
        	System.out.println(root.val); 
            inorderRec(root.left); 
            
            inorderRec(root.right);
        }
    }

    void level( Hashtable<Integer , Integer> dic , int d , Node node){


    	if(node!=null){

    		try{

    		dic.put(d , Math.max(dic.get(d) , node.val));
    	}
    	catch(Exception e){

    		dic.put(d , node.val);
    	}
    	

    	level(dic , d+1 , node.right) ;
    	level(dic ,d+1 ,node.left ) ;

    	}

    	

    }


 	public static void main(String[] args) {

 		Max_number_in_each_level_Bst ob = new Max_number_in_each_level_Bst() ;
 		ob.insert(root , 50) ;
 		ob.insert(root , 40) ;
 		ob.insert(root , 10) ;
 		ob.insert(root , 60) ;
 		ob.insert(root , 78) ;
 		ob.insert(root , 42) ;


 		ob.inorder();

 		Hashtable< Integer , Integer > dic = new Hashtable<Integer , Integer>() ;
 		ob.level(dic , 0 , root);


 		dic.forEach ( (k , v) ->

 			System.out.println("level:"+k+" max val :"+v) ) ;
 		
 		
 		
 	}
 }