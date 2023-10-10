import java.util.Comparator;
import java.util.Iterator;
// import java.util.Stack;
import java.util.*;

/**
 * The bintree class
 * 
 * @param <T>
 */
public class Bintree<T extends Comparable<T>> {

    /**
     * Fields
     */
    private int x;
    private int y;
    private int r;
    private Comparator<T> comparator;
    private String nullTree = "This tree is empty";
    private int level;
    private int length;
    private Seminar tomb;
    private Node<Seminar> temp;
    private Node<Seminar> root;
    private MyIterator it;
    

    /**
     * The constructor of the bintree class
     * 
     * @param size
     *            The size of the bintree
     */
    public Bintree(int size) {

        // The size is boundary of the bintree map.
        // The bintree is a form of square, so only one integer size is needed.
        this.x = size;
        this.y = size;

        this.length = size;
        it = new MyIterator();
        comparator = null;
        level = 1;
        temp = null;
        root = null;
    }


    public Iterator<Seminar> iterator() {
        return new MyIterator();
    }


    /**
     * The method to get the size of the bintree
     * 
     * @return
     */
    public int size() {
        return x;
    }


    /**
     * The method to compare the integers.
     * This method is used when a leafnode becomes internal node.
     * When an internal node is created, I should decide whether the seminar
     * that was in the leaf node to be left or right.
     * 
     * Based on the level of the bintree, the comparison is made based on x axis or y axis. 
     * 
     * 
     * 
     * @param x
     * @param y
     * @return
     */
    private int compare(Integer x, Integer y) {
        // if (comparator == null)
        return x.compareTo(y);

// else
// return comparator.compare(x, y);

    }

// private void split(Node<KeyPair> p) {
// // put the originally placed node to temp
// if (p.data.getX() != -1)
// {
// temp = p;
// System.out.println("temp node: " + temp.data.getX() + ", " + temp.data
// .getY());
// }
//
//
//
// // make the left and right node
//
// // set the root of the node null
//
// p.data = tomb;
// p.left = null;
// p.right = null;
// // the level inorder search should be used to calculate level.
// // level = level + 1;
// // System.out.println("Current Level: " + level);
// }


    private void merge() {

    }


    public Seminar getRoot() {
        return root.data;
    }


    /**
     * Splitting a node into two.
     * 
     * TA said there is better way than this. 
     * But I will leave this. 
     * @param curr
     */
    private void split(Node<Seminar> curr) {

        Seminar store = curr.data;
        curr.data = tomb;
        level = level + 1;
        if (level % 2 == 0) {

            // work with x axis
            if (store.x() > (x / level)) {
                curr.right = new Node(store);
            }
            else {
                curr.left = new Node(store);
            }

        }
        else {
            if (store.y() > (y / level)) {
                curr.right = new Node(store);
            }
            else {
                curr.left = new Node(store);
            }
        }
    }


    public void insertBin(Seminar key) {

        root = insertBin(root, key);

    }


    private Node<Seminar> insertBin(Node<Seminar> p, Seminar key) {

        // if current leaf node is empty
        // just insert the pair.
        if (p == null) {

            System.out.println("Successfully insert record with location " + key
                .x() + ", " + key.y());

            temp = new Node(key);

            System.out.println(temp.data.toString());
            return temp;
        }
        else {

            split(p);

            if (level % 2 == 0) {

                System.out.println(level % 2 == 0);
                if (key.x() > (x / level)) {
                    System.out.println(key.x() > (x / level));

                    // root.right = curr;
                    // temp.data = tomb;
                    System.out.println("placed to right");
                    return insertBin(p.right, key);
                }
                else {
                    System.out.println(key.x() > (x / level));
// p.left = temp;
// p.data = tomb;
// System.out.println(temp.data.x());
                    System.out.println("placed to left");
                    return insertBin(p.left, key);
                }

            }

            else {
                if (key.y() > (y / level)) {
// System.out.println("a");
// p.right = temp;
// p.data = tomb;
                    System.out.println("placed to right");
                    insertBin(p.right, key);
                }
                else {
// System.out.println("b");
// p.left = temp;
// p.data = tomb;
                    System.out.println("placed to left");
                    insertBin(p.left, key);
                }
            }

        }
        return null;
    }


    /**
     * Method to check whether current node is leaf node or internal node
     * 
     * @param p
     *            current node p
     * @return false if this node is internal, true if this node is leaf.
     */
    private boolean isLeaf(Node<KeyPair> p) {

        if (p.left == null && p.right == null) {
            return true;
        }
        return false;
    }


    public void print() {
        while (it.hasNext()) {
            if (it.next() == null) {
                System.out.println("E");
            }
            else {
                //
            }
        }

    }

    /*****************************************************
     *
     * TREE ITERATOR
     *
     ******************************************************/

    private class MyIterator implements Iterator<Seminar> {
        Stack<Node<Seminar>> stk = new Stack<Node<Seminar>>();

        public MyIterator() {
            if (root != null)
                stk.push((Node<Seminar>)root);
        }


        public boolean hasNext() {
            return !stk.isEmpty();
        }


        public Seminar next() {
            Node<Seminar> cur = stk.peek();
            if (cur.left != null) {
                stk.push(cur.left);
            }
            else {
                Node<Seminar> tmp = stk.pop();
                while (tmp.right == null) {
                    if (stk.isEmpty())
                        return cur.data;
                    tmp = stk.pop();
                }
                stk.push(tmp.right);
            }

            return cur.data;
        }// end of next()


        public void remove() {

        }
    }


    private class Node<Seminar> {

        private Seminar data;

        private Node<Seminar> left;

        private Node<Seminar> right;

        /**
         * 
         * Constructor for BinNode
         * 
         * 
         * 
         * @param data
         * 
         *            the seminar
         * 
         * @param l
         * 
         *            the left binNode
         * 
         * @param r
         * 
         *            the right binNode
         * 
         */

        public Node(Seminar data, Node<Seminar> left, Node<Seminar> right) {

            this.left = left;

            this.right = right;

            this.data = data;

        }


        public Node(Seminar data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
}
