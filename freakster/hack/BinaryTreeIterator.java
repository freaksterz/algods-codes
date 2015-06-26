package freakster.hack;



 // Definition for binary tree


import java.util.Stack;

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 *
 *
 * Created by freakster on 6/22/2015.
 */
public class BinaryTreeIterator
{

    Stack<BinaryTreeNode> stack ;

    public static void main(String[] args)
    {
     BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
     BinarySearchTree searchTree = new BinarySearchTree();

        searchTree.insert(10);
        searchTree.insert(20);
        searchTree.insert(30);
        searchTree.insert(40);


    }

    public BinaryTreeIterator(BinaryTreeNode root)
    {
        stack  = new Stack<BinaryTreeNode>();
        while( root!= null)
        {
            stack.push(root);
            root = root.left;
        }
    }

    public boolean hasNext()
    {
        if(stack.isEmpty())
        {
         return false;
        }
        else
        {
           return true;
        }
    }



    public int next( BinaryTreeNode node)
    {
        int result =0 ;
        BinaryTreeNode binaryTreeNode;
        if(hasNext())
        {
            binaryTreeNode =  stack.pop();
            result = node.getData();

            if(node.right!=null)
            {
                node = node.right;
                while(node != null)
                {
                    stack.push(node);
                    node = node.left;
                }
            }

        }

        return result;

    }

}
