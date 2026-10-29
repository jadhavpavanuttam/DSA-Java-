package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(30);
        System.out.printf("\nPre-order : \n");
        tree.inorder(root);
        System.out.printf("\nPost-order : \n");
        tree.postorder(root);
        System.out.printf("\nIn-order : \n");
        tree.preorder(root);
        System.out.println("\n Searching : \n");
        System.out.println(root.data + " : Is Found  ? \n " + tree.search(root, 20));
        System.out.println("\n Insert value at : \n ");
        System.out.println(tree.insert(root, 100).hashCode());
        System.out.println("\n Pring Lavel Order : \n");
        tree.levelOrder(root);
    }
}

