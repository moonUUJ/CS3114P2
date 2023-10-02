import java.util.*;

// On my honor:
// - I have not used source code obtained from another current o
// former student, or any other unauthorized source, either
// modified or unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
// anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.

/**
 * 
 * The BST class that gotten from OpenDSA and modified
 * 
 * 
 * @author Moonwon Jeon
 * @version 2023/09/24
 * @param <T>
 *            the generics
 * @param <root>
 */
public class BST<T extends Comparable<T>> {

    /**
     * 
     * Fields
     * 
     */

    private BinNode<KeyValue> radicle;
    private Comparator<T> comparator;
    private int level; 


    /**
     * 40
     * The constructor for the binary search tree
     * 41
     */

    public BST() {

        radicle = null;

        comparator = null;

        level = 0;
    }

    public void setRoot() {
        radicle = null;
        System.out.println("emptied");
    }
    /**
     * 
     * The compare method that has an important role to define whether
     * 
     * a new node should go left or right
     * 
     * @param x
     *            one of the element that will be compared to the other
     * @param y
     *            one of the element that twill be compared to the other
     * @return -1 if x is larger and 1 if y is larger
     */
    private int compare(T x, T y) {
        if (comparator == null)
        return x.compareTo(y);

         else
         return comparator.compare(x, y);

    }


   

    /**
     * 
     * Insert method to insert a generic key of keyvalue object to the bst
     * 
     * @param key
     *            The key of the keyvalue object, it will be an int or string
     */
    public void insert(KeyValue key) {
        radicle = insert(radicle, key);
    }


    private BinNode<KeyValue> insert(BinNode<KeyValue> p, KeyValue key) {
        if (p == null) {
            System.out.println("Successfully insert record with ID " + key
                .getKey());
            return new BinNode<KeyValue>(key, null, null);

        }
        if (compare((T)key.getKey(), (T)p.data.getKey()) == 0)
            return p;

        if (compare((T)key.getKey(), (T)p.data.getKey()) < 0)

            p.left = insert(p.left, key);

        else

            p.right = insert(p.right, key);

        return p;

    }

    // private Node<T[]> insert(Node<T[]> p, T[] toInsert)
    // {
    // if (p == null)
    // return new Node<T[]>(toInsert);
    //
    // if (compare(toInsert, p.data) == 0)
    // return p;
    //
    // if (compare(toInsert, p.data) < 0)

    // p.left = insert(p.left, toInsert);
    // else

    // p.right = insert(p.right, toInsert);
    //
    // return p;
    // }


    /*****************************************************
     * 
     * SEARCH
     * 
     ******************************************************/
    /**
     * This method searches for in order
     * 
     * @param element
     *            the element we are searching
     * @return true if in order or else false
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public boolean inorderSearch(T element) {
        return inorderSearch(radicle, element);
    }


    /**
     * This method is searched for in the tree
     * 
     * @param p
     *            the binNode
     * @param element
     *            the element we are finding
     * @return
     */

    private boolean inorderSearch(BinNode<KeyValue> p, T element) {
        level = level + 1; 
        if (p == null) {
            return false;

        }

        if (p.data.getKey() == element) {
            // return p.data;
            System.out.println(p.data.getSeminar() + "with level: " + level);
            return true;
        }
        else if (compare((T)p.data.getKey(), element) > 0) {
            return inorderSearch(p.left, element);
        }
        else {
            return inorderSearch(p.right, element);
        }

    }

    /**
     * Method to get the current level 
     * @return level the height of the binary search tree 
     */
    public int getLevel() {
        return level;
    }

    /**
     * 
     * The method finds whether their is a seminar that fits in the range
     * 
     * 
     * 
     * @param min
     * 
     *            the minimum range
     * @param max
     *            the maximum range
     */

    public void comparisonSearch(T min, T max) {
        comparisonSearch(radicle, min, max);
    }


    /**
     * 
     * The method finds whether their is a seminar that fits in the range
     * 
     * @param p
     *            the binNode
     * @param min
     *            the minimum range
     * @param max
     *            the maximum range
     * 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void comparisonSearch(BinNode<KeyValue> p, T min, T max) {
        int height = 0;
        String oneTab = "     ";
        if (p == null) {

        }
        else if (compare(min, (T)p.data.getKey()) > 0 && compare((T)p.data

            .getKey(), max) < 0) {
            height = height + 1;
            // String spaces = oneTab.repeat(height);
            // System.out.println(spaces + p.data.getSeminar().toString());
        }
        else if (compare(min, (T)p.data.getKey()) < 0) {
            comparisonSearch(p.left, min, max);
        }
        else if (compare(max, (T)p.data.getKey()) > 0) {
            comparisonSearch(p.right, min, max);
        }

    }


    /**
     * The method searches for the Seminar
     * 
     * @param toSearch
     *            the Seminar to search
     * @return true if found else false
     */
    public KeyValue search(T toSearch) {
        if (radicle == null) {
            return null;
        }
        return search(radicle, toSearch).data;
    }


    /**
     * The method searches for the Seminar
     * 
     * @param p
     *            the binNode
     * @param toSearch
     *            the Seminar to be searched
     * @return true if found else false
     * 
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private BinNode<KeyValue> search(BinNode<KeyValue> p, T toSearch) {
        if (compare(toSearch, (T)p.data.getKey()) == 0) {
            // System.out.println("Successfully searched");
            System.out.println(p.data.getSeminar().toString());
            return p;
        }

        else if (compare(toSearch, (T)p.data.getKey()) < 0) {
            return search(p.left, toSearch);
        }
        else {
            return search(p.right, toSearch);
        }
    }


    /**
     * The method searches for the key
     * 
     * @param toSearch
     *            the key to search
     * 
     * 
     * 
     */

    public void searchKey(T toSearch) {

        searchKey(radicle, toSearch);

    }


    /**
     * The method searches for this key
     * 
     * @param p
     *            the binNode
     * @param toSearch
     *            the key
     */

    @SuppressWarnings({ "rawtypes", "unchecked", "unused" })

    private void searchKey(BinNode<KeyValue> p, T toSearch) {

        if (p == null) {

            return;

        }

        else if (compare(toSearch, (T)p.data.getKey()) == 0) {

            System.out.println(p.data.getSeminar().toString());

        }

        else if (compare(toSearch, (T)p.data.getKey()) < 0) {

            searchKey(p.left, toSearch);

        }

        else {

            searchKey(p.right, toSearch);

        }

    }

    /*****************************************************
     * 
     * DELETE
     * 
     ******************************************************/

    /**
     * 
     * BinNode Class
     * 
     * 
     * 
     * @author busam
     * 
     * @author Moonwon Jeon
     *
     * 
     * 
     * @param <KeyValue>
     * 
     */

    

        private class BinNode<KeyValue> {

            private KeyValue data;

            private BinNode<KeyValue> left;

            private BinNode<KeyValue> right;

            /**
             * 
             * Constructor for BinNode
             * 
             * 
             * 
             * @param data
             * 
             *            the keyvalue
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

            public BinNode(

                KeyValue data,

                BinNode<KeyValue> l,

                BinNode<KeyValue> r) {

                left = l;

                right = r;

                this.data = data;

            }

            // public String toString() {
            // return data.toString();

            // }

        }

        // public Iterator<T> iterator() {

        // return new MyIterator();

        // }
        //
        // // pre-order
        // private class MyIterator implements Iterator<T> {
        // Stack<BinNode<T>> stk = new Stack<BinNode<T>>();
        //
        // public MyIterator() {
        // if (radicle != null)
        // stk.push((BST<T>.BinNode<T>)radicle);

        // }

        //

        //

        // public boolean hasNext() {

        // return !stk.isEmpty();

        // }

        //

        //

        // public T next() {

        // BinNode<T> cur = stk.peek();

        // if (cur.left != null) {

        // stk.push(cur.left);

        // }

        // else {

        // BinNode<T> tmp = stk.pop();

        // while (tmp.right == null) {

        // if (stk.isEmpty())

        // return cur.data;

        // tmp = stk.pop();

        // }

        // stk.push(tmp.right);

        // }

        //

        // return cur.data;

        // }// end of next()

        //
        //

        // public void remove() {

        //

        // }
    }

