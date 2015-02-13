package freakster.hack;

/**
 * Created by aga2 on 2/9/2015.
 */
public class BinaryTreeNode {

    BinaryTreeNode left,right;
    int data;


    BinaryTreeNode(){
        data = 0;
        left = null;
        right = null;
    }
    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public int getData() {
        return data;
    }
}
