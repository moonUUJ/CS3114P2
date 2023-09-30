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
 * The test class for KeyValue class that should take generic key and Seminar
 * Value
 *
 * @author Moonwon Jeon
 * @version 2023/09/24
 */
public class KeyValueTest extends TestCase {

    /**
     * Fields
     */
    private String key1;
    private int key2;
    private Seminar sem;
    private KeyValue kv1;
    private KeyValue kv2;

    /**
     * The constructor for the test class of KeyValue
     */
    public KeyValueTest() {
        // intentionally empty
    }


    /**
     * The setup method for this test class
     */
    public void setUp() {
        key1 = "key";
        key2 = 1;
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

        kv1 = new KeyValue(key1, sem);
        kv2 = new KeyValue(key2, sem);
    }


    /**
     * test method for getKey()
     * 
     */
    public void testGetKey() {

        assertTrue(kv1.getKey().equals("key"));

        assertTrue((int)kv2.getKey() == 1);
    }


    /**
     * test method for getSeminar()
     */
    public void testGetSeminar() {
        assertTrue(kv1.getSeminar().id() == 0);

    }
}
