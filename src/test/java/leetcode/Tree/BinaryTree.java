package leetcode.Tree;

import net.sf.ehcache.search.parser.MCriteria;

import java.util.LinkedList;

/**
 * Created by shayuan on 2016/12/30.
 */
public class BinaryTree {
    private Node root;
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public BinaryTree(int[] values) {
        System.out.print("创建二叉树：");
        size = values.length;
        for (int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
        root = new Node(values[0]);
        boolean isLeft = true;
        Node parent = null;
        Node current = null;
        LinkedList<Node<Integer>> queue = new LinkedList<Node<Integer>>();
        queue.addLast(root);
        for (int i = 1; i < values.length; i++) {
            current = new Node(values[i]);
            queue.addLast(current);
            if (isLeft) {
                parent = queue.getFirst();
                parent.setLeftChild(current);
                isLeft = false;
            } else {
                parent = queue.removeFirst();
                parent.setRightChild(current);
                isLeft = true;
            }

        }
    }

    public void levelTraverse() {
        System.out.print("层级遍历：");
        LinkedList<Node<Integer>> queue = new LinkedList<Node<Integer>>();
        queue.add(root);
        Node current = null;
        while (!queue.isEmpty()) {
            current = queue.removeFirst();
            if (current.getLeftChild() != null) {
                queue.addLast(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                queue.addLast(current.getRightChild());
            }
            System.out.print(current.getValue() + " ");
        }
        System.out.println();
    }

    public void preorderTraverse() {
        System.out.print("递归先序遍历：");
        preorderTraverseRecursion(root);
        System.out.println();
    }

    private void preorderTraverseRecursion(Node node) {
        System.out.print(node.getValue() + " ");
        if (node.getLeftChild() != null)
            preorderTraverseRecursion(node.getLeftChild());
        if (node.getRightChild() != null)
            preorderTraverseRecursion(node.getRightChild());

    }

    public void inorderTraverse() {
        System.out.print("递归中序遍历：");
        inorderTraverseRecursion(root);
        System.out.println();
    }

    private void inorderTraverseRecursion(Node node) {
        if (node.getLeftChild() != null)
            preorderTraverseRecursion(node.getLeftChild());
        System.out.print(node.getValue() + " ");
        if (node.getRightChild() != null)
            preorderTraverseRecursion(node.getRightChild());
    }

    public void lastorderTraverse() {
        System.out.print("递归后序遍历：");
        lastorderTraverseRecursion(root);
        System.out.println();
    }

    private void lastorderTraverseRecursion(Node node) {
        if (node.getLeftChild() != null)
            preorderTraverseRecursion(node.getLeftChild());
        if (node.getRightChild() != null)
            preorderTraverseRecursion(node.getRightChild());
        System.out.print(node.getValue() + " ");
    }

    public void preorderTraverseNoRecursion() {
        System.out.print("非递归先序遍历：");
        LinkedList<Node<Integer>> stack = new LinkedList<Node<Integer>>();
        stack.push(root);
        Node current = null;
        while (!stack.isEmpty()) {
            current = stack.pop();
            System.out.print(current.getValue() + " ");
            if (current.getRightChild() != null) {
                stack.push(current.getRightChild());
            }
            if (current.getLeftChild() != null) {
                stack.push(current.getLeftChild());
            }
        }
        System.out.println();
    }

    public void inorderTraverseNoRecursion() {
        System.out.print("非递归中序遍历：");
        LinkedList<Node<Integer>> stack = new LinkedList<Node<Integer>>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeftChild();
            }
            if (!stack.isEmpty()) {
                current = stack.pop();
                System.out.print(current.getValue() + " ");
                current = current.getRightChild();
            }
        }
        System.out.println();
    }

    public void lastorderTraverseNoRecursion() {
        System.out.print("非递归后序遍历");
        LinkedList<Node<Integer>> stack = new LinkedList<Node<Integer>>();
        Node<Integer> rNode = null;
        Node<Integer> current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeftChild();
            }
            current = stack.pop();
            while (current != null && (current.getRightChild() == null || current.getRightChild() == rNode)) {
                System.out.print(current.getValue() + " ");
                rNode = current;
                if (stack.isEmpty()) {
                    System.out.println();
                    return;
                }
                current = stack.pop();
            }
            stack.push(current);
            current = current.getRightChild();
        }
    }



    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println("节点个数：" + bt.getSize());
        bt.levelTraverse();
        bt.preorderTraverse();
        bt.inorderTraverse();
        bt.lastorderTraverse();
        bt.preorderTraverseNoRecursion();
        bt.inorderTraverseNoRecursion();
        bt.lastorderTraverseNoRecursion();
    }
}

class Node<V> {
    private V value;
    private Node<V> leftChild;
    private Node<V> rightChild;

    public Node() {
    }

    public Node(V value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<V> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<V> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<V> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<V> rightChild) {
        this.rightChild = rightChild;
    }
}
