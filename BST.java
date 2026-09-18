class BST {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    Node insert(Node root, int value) {

        if(root==null){
            return new Node(value);
        }
        else if(value<root.data){
             root.left=insert(root.left,value);
        }
        else{
             root.right=insert(root.right,value);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    
    }
    void search(Node root,int value){
        Node temp=root;int found=0;
        while(temp!=null){
            if(temp.data==value){
                found =1;
                break;
            }
            else if(temp.data>value){
                temp=temp.left;

            }
            else{
                temp=temp.right;
            }
            

        }
        if(found==1){
                System.out.println("element "+value+" found");
            }
        else{
            System.out.println("element "+value+" not found");
        }
    }

    public static void main(String[] args) {

        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);
        tree.search(tree.root,20);
        tree.search(tree.root,999);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
       
    }
}