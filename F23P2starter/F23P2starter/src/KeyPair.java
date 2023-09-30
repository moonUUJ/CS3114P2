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
 * The class for KeyPair that takes x and y 
 *
 * @author Moonwon Jeon
 * @version 2023/09/24
 * @param <T>
 *            the generics
 */
public class KeyPair<T extends Comparable<T>> {

    /**
     * Fields 
     */
    private int x; 
    private int y; 
    
    public KeyPair(int xCord, int yCord)
    {
        x = xCord;
        y = yCord; 
    }
    
    public int getX()
    {
        return x; 
        
    }
    
    public int getY()
    {
        return y; 
    }
}
