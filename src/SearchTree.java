// Class SearchTree stores and prints a binary search tree of
// objects of type E.  E must implement the Comparable<E>
// interface

public class SearchTree<E extends Comparable<E>> {
    private SearchTreeNode<E> overallRoot; // root of overall tree

    // post: constructs an empty search tree
    public SearchTree() {
//      TO DO:
        overallRoot = new SearchTreeNode<E>(null, null, null);
    }

    // post: value added to tree so as to preserve binary search tree
    public void add(E value) {
        // Yueheng
//    	TO DO:

    }

    // post: value added to tree so as to preserve binary search tree
    private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
        // Yueheng
//    	TO DO:
        return null;
    }

    // post: returns true if tree contains value, returns false otherwise
    public boolean contains(E value) {
//    	TO DO:
        return false;
    }

    // post: returns true if given tree contains value, returns false otherwise
    private boolean contains(SearchTreeNode<E> root, E value) {
//    	TO DO:
        return false;
    }

    // post: value removed from tree so as to preserve binary search tree
    public void remove(E value) {
//    	TO DO (the real):
        if (!contains(value)) return;  // it dont exits bruh

        SearchTreeNode<E> oldNode = searchFor(overallRoot, value);
        SearchTreeNode<E> newNode = findSmallest(oldNode);


    }

    // returns a node that (insert explanation here)
    public SearchTreeNode<E> searchFor(SearchTreeNode<E> root, E value) {
        if (root == null || root.data == value) return root;

        if (root.data.compareTo(value) > 0) return searchFor(root.right, value);
        else return searchFor(root.left, value);
    }


    // post: value removed to tree so as to preserve binary search tree
    private SearchTreeNode<E> remove(SearchTreeNode<E> root, E value) {
//    	TO DO(Theriel):

        // go right

        // then go far left
        return null;
    }

    // post: return the smallest value in the binary search tree
    // Precondition: the initial root is not null
    private SearchTreeNode<E> findSmallest(SearchTreeNode<E> root) {
        // Yueheng
//    	TO DO:
        if (root.left == null) return root;

        return findSmallest(root.left);
    }

    // post: prints the data of the tree, one per line
    public void print() {
        // Justin
//    	TO DO:
        printInorder(this.overallRoot);
    }

    // post: prints the data of the tree using an inorder traversal
    private void printInorder(SearchTreeNode<E> root) {
        // Justin
//    	TO DO:
        if (root == null) return;
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
        return;
    }



    private static class SearchTreeNode<E> {
        public E data;                   // data stored in this node
        public SearchTreeNode<E> left;   // left subtree
        public SearchTreeNode<E> right;  //  right subtree

        // post: constructs a leaf node with given data
        public SearchTreeNode(E data) {
            this(data, null, null);
        }

        // post: constructs a node with the given data and links
        public SearchTreeNode(E data, SearchTreeNode<E> left,
                              SearchTreeNode<E> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
