import student.TestCase;

// On my honor:
// - I have not used source code obtained from another current or
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
 * The test class for BST
 * Value
 *
 * @author Moonwon Jeon
 * @version 2023/09/24
 */
public class BSTTest extends TestCase {

    /**
     * Fields
     */
    private String key1;
    private String key2;
    private String key3;
    private Seminar sem;
    private Seminar sem1;
    private Seminar sem2;
    private Seminar sem3;

    private KeyValue kv1;
    private KeyValue kv2;
    private KeyValue kv3;
    private BST<String> bst;

    /**
     * The constructor for the bst test class
     */
    public BSTTest() {
        // intentionally empty
    }


    /**
     * The setup method for the bst test class
     */
    public void setUp() {
        key1 = "key";
        key2 = "keyyy";
        key3 = "ke";

        int cin1 = 10;
        int cin2 = 30;
        int cin3 = 2;
        String[] keywords = new String[5];

        int idin = 0;
        String tin = "";
        String datein = "11";
        int lin = 0;
        short x = 0;
        short y = 1;
        int cin = 2;
        String descin = "";

        sem = new Seminar(idin, tin, datein, lin, x, y, cin, keywords, descin);
        sem1 = new Seminar(idin, tin, datein, lin, x, y, cin1, keywords,
            descin);
        sem2 = new Seminar(idin, tin, datein, lin, x, y, cin2, keywords,
            descin);
        sem3 = new Seminar(idin, tin, datein, lin, x, y, cin3, keywords,
            descin);
        kv1 = new KeyValue(key1, sem1);
        kv2 = new KeyValue(key2, sem2);
        kv3 = new KeyValue(key3, sem3);

        bst = new BST();

    }


    /**
     * The method to test insert method
     */
    public void testInsert() {
        bst.insert(kv1);
        bst.insert(kv2);
        bst.insert(kv3);
        bst.insert(kv1);

    }


    /**
     * The method to test search method
     */
    public void testSearch() {
        String element = "key";
        assertTrue(bst.search(element) == null);

        bst.insert(kv1);
        bst.insert(kv2);
        bst.insert(kv3);

        bst.search(element);

        String element2 = "ke";

        bst.search((String)kv2.getKey());
        bst.search((String)kv3.getKey());
        bst.search(element2);
    }


    /**
     * This method tests the search key
     */
    public void testSearchKey() {
        String element = "key";
        bst.searchKey(element);

        bst.insert(kv1);
        bst.insert(kv2);
        bst.insert(kv3);

        bst.searchKey(element);

        String element2 = "ke";

        bst.searchKey((String)kv2.getKey());
        bst.searchKey((String)kv3.getKey());
    }


    /**
     * This method tests comparison
     */
    public void testComparisonSearh() {
        bst.comparisonSearch((String)"k", (String)"keyyyy");
        bst.insert(kv1);
        bst.insert(kv2);
        bst.insert(kv3);

        bst.comparisonSearch((String)"k", (String)"keyyyy");
        bst.comparisonSearch((String)"ke", (String)"keyyyyy");
        bst.comparisonSearch((String)"", (String)"zzzzz");
        bst.comparisonSearch((String)"zzzz", (String)"zzzzz");
        bst.comparisonSearch((String)"key", (String)"key");
        bst.comparisonSearch((String)"keyyy", (String)"");

    }


    /**
     * This method tests in order search
     */
    public void testInorderSearch() {
        assertFalse(bst.inorderSearch((String)"ke"));
        bst.insert(kv1);
        bst.insert(kv2);
        bst.insert(kv3);

        assertTrue(bst.inorderSearch((String)"key"));
        assertTrue(bst.inorderSearch((String)kv3.getKey()));
        bst.inorderSearch((String)kv2.getKey());
    }


    /**
     * This method tests delete
     */

    public void testDelete() {
        BST<Integer> bstInt = new BST();
        int a = 1;
        KeyValue keyInt = new KeyValue(a, sem);
        bst.insert(keyInt);
        // bstInt.delete(a);

    }
}
