import java.util.Iterator;
import java.util.Stack;

public class IteratorTree implements Iterator<Integer> {
    private Stack<Tree> stack;

    public IteratorTree (Tree root){

        stack = new Stack<>();
        // stack -> provide guidance to the iterator on how to traverse the binary tree efficiently

        pushNodes(root);
        //pushLeft -> pushes the left nodes of the tree onto a stack data structure
    }

    //@Override is being used since IteratorTree is implementing the Iterator interface
    @Override
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    /*The boolean value returned by hasNext() is based on whether there are more nodes
     left to explore in the tree. If there are,
     it returns true, otherwise, it returns false.
     */
    //
    //

    @Override
    public Integer next(){
        //pop() removes the top node from the stack
        Tree node = stack.pop();
        pushNodes(node.right);
        return node.value;
    }


    // Traverses the binary tree in ascending order of node values using an inorder traversal strategy.
    // The traversal starts by visiting all left nodes, then the root node, and finally the right nodes.
    // This ensures that nodes are processed in ascending order.
    // The `pushNodes` method traverses left nodes and pushes them onto the stack,
    // while also ensuring that right nodes are explored after processing the root node.
    private void pushNodes (Tree node){
       while (node != null){
           stack.push(node);
           node = node.left;
       }
//

    }




}
