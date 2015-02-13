package freakster.hack;

/**
 * Created by aga2 on 2/9/2015.
 */
public class BinarySearchTree {

    private BinaryTreeNode root;


    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private BinaryTreeNode insert(BinaryTreeNode node, int data) {

        if(node == null){
            node = new BinaryTreeNode(data);
        }else if( data <= node.getData()){
            insert( node.getLeft(),data);
        }else{
            insert(node.getRight(),data);
        }

        return node;
    }
    private boolean searchNode(int data){
        if(isEmpty()){
            return Boolean.FALSE;
        }
        return searchNode( root, data );
    }

    private boolean searchNode(BinaryTreeNode node, int data) {
        boolean found = Boolean.FALSE;
        if( node.getData() == data){
            found =true;
        }else if( data < node.getData()){
            searchNode(node.getLeft(),data);
        } else{
            searchNode(node.getRight(),data);
        }
        return found;
    }

    private void deleteNode(int data) {
        if(isEmpty() ){
            return;
        }
        deleteNode(root, data);

    }

    private BinaryTreeNode deleteNode(BinaryTreeNode node, int data) {
        //if()


        return node;
    }
}
