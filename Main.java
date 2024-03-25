import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Tree root = new Tree(100);
        root.left = new Tree(13);
        root.left.left = new Tree(15);
        root.left.right = new Tree(33);
        root.right = new Tree (22);
        root.right.right = new Tree(17);

        //---------- Comments -------------
        // This IteratorTree class implements an iterator for traversing a binary tree in *Ascending* order.
        // Sequence:: left nodes --> root node --> right nodes.
        //The pushNodes method traverses left nodes and pushes them onto the stack ensuring that right nodes are explored after processing the root node.
        // When hasNext is called, it checks if the stack is empty to determine if there are more nodes left to explore in the tree.
        // The next method returns the next node value in the traversal sequence by popping the top node from the stack and pushing its right child nodes onto the stack.


        IteratorTree iterator = new IteratorTree(root);


        System.out.println("Values of the Tree: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
