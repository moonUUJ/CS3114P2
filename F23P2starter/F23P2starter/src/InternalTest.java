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
public class InternalTest extends TestCase {

    
    /**
     * fields
     */
    private Internal inter1; 
    private KeyPair a; 
    private KeyPair b; 
    private KeyPair c; 
     
    
    public InternalTest() {
        //empty
    }
    
    public void setUp() {
        a = new KeyPair(130, 120); 
        b = new KeyPair(90, 200); 
        c = new KeyPair(30, 154); 
        inter1 = new Internal(); 
    }
    
    public void testInsert() {
        inter1.insert(a);
        assertTrue(inter1.getRoot().getX() == 130);
    }
}
