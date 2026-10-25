package arraySeries;

public class TreePrePostIn {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(5);
        bt.insert(4);
        bt.insert(12);
        bt.insert(7);
        bt.insert(12);
        System.out.print("Inorder: ");
        bt.inOrder();

        System.out.print("Preorder: ");
        bt.preOrder();

        System.out.print("Postorder: ");
        bt.postOrder();
    }
}

class BinaryTree {
    TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) return new TreeNode(data);

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode root) {
        if (root == null) return;

        inOrderRec(root.left);
        System.out.print(root.data + " ");
        inOrderRec(root.right);
    }


    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(TreeNode root) {
        if (root == null) return;

        System.out.print(root.data + " "); // Root first
        preOrderRec(root.left);
        preOrderRec(root.right);
    }


    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(TreeNode root) {
        if (root == null) return;

        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.data + " "); // Root last
    }
}

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
    }
}

