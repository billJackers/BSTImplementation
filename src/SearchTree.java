// Class SearchTree stores and prints a binary search tree of
// objects of type E.  E must implement the Comparable<E>
// interface

public class SearchTree<E extends Comparable<E>> {
    private SearchTreeNode<E> overallRoot; // root of overall tree

    // post: constructs an empty search tree
    public SearchTree() {
//      TO DO:
        overallRoot = new SearchTreeNode<E>(null);
    }

    // post: value added to tree so as to preserve binary search tree
    public void add(E value) {
        // Yueheng
//    	TO DO:
        // Add to an empty tree
        if (overallRoot.data == null) {
            overallRoot = new SearchTreeNode<E>(value);
        } else {
            // If tree is not empty
            add(overallRoot, value);
        }
    }

    // post: value added to tree so as to preserve binary search tree
    private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
        // Yueheng
//    	TO DO:
        if (root == null) root = new SearchTreeNode<E>(value);
        else if (root.data.compareTo(value) > 0) root.left = add(root.left, value);
        else if (root.data.compareTo(value) < 0) root.right = add(root.right, value);

        return root;
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
        overallRoot = remove(overallRoot, value);
    }

    private SearchTreeNode<E> remove(SearchTreeNode<E> root, E value) {
        if (root == null) return null;
        else if (root.data.compareTo(value) > 0) {
            root.left = remove(root.left, value);
        } else if (root.data.compareTo(value) < 0) {
            root.right = remove(root.right, value);
        } else {
            if (root.right == null) return root.left;
            else if (root.left == null) return root.right;
            else {
                root.data = findSmallest(root.right).data;
                root.right = remove(root.right, root.data);
            }
        }
        return root;
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
