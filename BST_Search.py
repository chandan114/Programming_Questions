class Node(object):
    def __init__(self , key):
        self.val = key
        self.left = None
        self.right = None
        
def insert(root , node):

    if(node is None):
        root = node
    if(root.val < node.val):
        if(root.right is None):
            root.right = node
        else:
            insert(root.right , node)
        
    if(root.val>node.val):
        if(root.left is None):
            root.left = node
        else:
            insert(root.left , node)
    
def search(root , key):
    if(root.val == key):
        return True
    if(key < root.val):
        return search(root.left , key)
    elif(key>root.val):
        return search(root.right , key)
    
def inorder(root): 
    if root: 
        inorder(root.left) 
        print(root.val) 
        inorder(root.right)

r = Node(50) 
insert(r,Node(90)) 
insert(r,Node(20)) 
insert(r,Node(40)) 
insert(r,Node(20)) 
insert(r,Node(60)) 
insert(r,Node(80)) 

inorder(r)

print(search(r , 60))
