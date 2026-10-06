public class BinarySearchTree {

    BinaryTreeNode root;

    public void insert(int data) {

        BinaryTreeNode newNode = new BinaryTreeNode(data);

        if (root == null) {
            root = newNode;
            return;
        }

        BinaryTreeNode current = root;

        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    } 
    
    public void inorder (BinaryTreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");

            inorder(node.right);
        }
    }

    public static void main(String[] args) {

    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(10);
    tree.insert(5);
    tree.insert(15);
    tree.insert(3);
    tree.insert(7);

    tree.inorder(tree.root);
}
}
