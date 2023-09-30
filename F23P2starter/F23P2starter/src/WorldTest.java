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
 * The test class for World
 * 
 *
 * @author Moonwon Jeon
 * @version 2023/09/24
 */
public class WorldTest extends TestCase {

    /**
     * Fields
     */
    private World world;
    private World worldWrong;
    private Seminar sem;
    private Seminar sem1;
    private Seminar sem2;
    private Seminar sem3;
    private Seminar sem4;
    private Seminar sem5;
    private Seminar sem6;
    private Seminar sem7;
    private Seminar sem8;

    /**
     * The constructor of the test class
     */
    public WorldTest() {
        // intentionally empty
    }


    /**
     * The set up method for this test class
     */
    public void setUp() throws Exception {
        world = new World(16);

        int idin = 0;
        String[] keywords = new String[3];
        keywords[0] = "a";
        keywords[1] = "b";
        keywords[2] = "c";
        String tin = "";
        String datein = "11";
        int lin = 0;

        short x = 0;
        short y = 0;

        short x1 = -1;
        short y1 = 1;
        int cin1 = 10;
        int cin2 = 20;
        int cin = 0;
        String descin = "";

        short x2 = -1;
        short y2 = -1;

        short x3 = 1;
        short y3 = -1;

        short x4 = 10;
        short y4 = 10;

        short x5 = 1;
        short y5 = 20;

        short x6 = 20;
        short y6 = 1;

        short x7 = 1;
        short y7 = 9;

        short x8 = 20;
        short y8 = 20;

        int idin1 = 1;
        sem = new Seminar(idin, tin, datein, lin, x, y, cin, keywords, descin);
        sem1 = new Seminar(idin, tin, datein, lin, x1, y1, cin1, keywords,
            descin);

        sem2 = new Seminar(idin, tin, datein, lin, x2, y2, cin2, keywords,
            descin);
        sem3 = new Seminar(idin, tin, datein, lin, x3, y3, cin, keywords,
            descin);
        sem4 = new Seminar(idin, tin, datein, lin, x4, y4, cin, keywords,
            descin);
        sem5 = new Seminar(idin, tin, datein, lin, x5, y5, cin, keywords,
            descin);
        sem6 = new Seminar(idin, tin, datein, lin, x6, y6, cin, keywords,
            descin);
        sem7 = new Seminar(idin, tin, datein, lin, x7, y7, cin, keywords,
            descin);
        sem8 = new Seminar(idin, tin, datein, lin, x8, y8, cin, keywords,
            descin);
        Exception thrown = null;
        try {
            worldWrong = new World(8);
        }
        catch (Exception exception) {
            thrown = exception;
        }
        try {
            World worldOne = new World(9);
        }
        catch (Exception exception) {
            thrown = exception;
        }
        try {
            World worldThree = new World(-1);
        }
        catch (Exception exception) {
            thrown = exception;
        }

        World worldTwo = new World(2);

    }


    /**
     * The method to test insert.
     */
    public void testInsert() {
        assertTrue(world.getWorldSize() == 16);
        assertFalse(world.getWorldSize() == 15);
        world.insert(sem);
        world.insert(sem1);
        world.insert(sem2);
        world.insert(sem3);
        world.insert(sem4);
        world.insert(sem5);
        world.insert(sem6);
        world.insert(sem7);
        world.insert(sem8);
    }


    /**
     * The method to test various search method
     */
    public void testSearch() {

        world.search(0, 100);
        world.insert(sem);
        world.insert(sem1);
        world.insert(sem2);

        world.search(0);
        world.search(1);

        world.search(5, 40);

        world.search("a");
        world.search("d");

        int x = 0;
        int y = 0;
        int r = 0;

        world.search(x, y, r);
    }


    /**
     * The method to test delete method.
     */
    public void testDelete() {
        int x = 0;
        world.delete(x);
    }
}
