
package DAA;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class exp6{
    Node root;

    exp6() {
        root = null;
    }

    // Function to print preorder traversal
    void printPreorder(Node node) {
        if (node == null)
            return;

        // Deal with the node
        System.out.print(node.data + " ");

        // Recur on left subtree
        printPreorder(node.left);

        // Recur on right subtree
        printPreorder(node.right);
    }

    // Driver code
    public static void main(String[] args) {
        exp6 tree = new exp6();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Function call
        System.out.println("Preorder traversal of binary tree is: ");
        tree.printPreorder(tree.root);
    }
}