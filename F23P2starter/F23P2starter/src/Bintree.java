
public class Bintree<T extends Comparable<T>> {

    private int x;
    private int y;
    private int r;

    private String nullTree = "This tree is empty";
    private int level;
    private Node<KeyPair> temp;
    private Node<KeyPair> root;

    public Bintree(int size) {

        this.x = size;
        this.y = size;

        root = null;

        level = 1;
        temp = null;
    }


    public int size() {
        return x;
    }


    private void split(Node<KeyPair> p) {
        temp = p;
        System.out.println("temp node: " + p.data.getX() + ", " + p.data.getY());
        p.left = null;
        p.right = null;
        p = null;
        level = level + 1;
        System.out.println("Current Level: " + level);
    }


    private void merge() {

    }


    public void insertBin(KeyPair key) {

        root = insertBin(root, key);

    }


    private Node<KeyPair> insertBin(Node<KeyPair> p, KeyPair key) {

        // if current left node is empty
        if (p == null) {

            System.out.println("Successfully insert record with location " + key
                .getX() + ", " + key.getY());
            return new Node<KeyPair>(key, null, null);
        }

        Node<KeyPair> pair = new Node<KeyPair>(key, null, null);
        System.out.println("KeyPair is made with location: " + key.getX() + ", "
            + key.getY());

        // if not, split into internal nodes
        // based on level, define to divide by x or y
        // make a left to an internal node first.
        split(p);
        // divide in y-axis
        if (level % 2 == 0 || level != 1) {
            if (temp.data.getY() > y || pair.data.getY() < y) {

            }
        }
        else {
            int split = x / level;

            if (temp.data.getX() > split) {
                p.right = temp;
            }
        }
        return pair;

    }


    public void print() {
        if (root == null) {
            System.out.println("E");

        }
        else {

        }
    }

    private class Node<KeyPair> {

        private KeyPair data;

        private Node<KeyPair> left;

        private Node<KeyPair> right;

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

        public Node(

            KeyPair data,

            Node<KeyPair> l,

            Node<KeyPair> r) {

            left = l;

            right = r;

            this.data = data;

        }


        /**
         * 
         * The Node Constructor with KeyValue parameter
         * 
         * 
         * 
         * @param data
         * 
         *            the keyValue
         * 
         */

        public Node(KeyPair data) {

            this(data, null, null);

        }
    }
}
