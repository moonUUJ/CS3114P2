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
 * The class for KeyValue that takes a key and a seminar to form an object
 * Value
 *
 * @author Moonwon Jeon
 * @version 2023/09/24
 * @param <T>
 *            the generics
 */
public class KeyValue<T extends Comparable<T>> {

    /**
     * Fields
     */
    private T key;
    private Seminar sem;

    /**
     * The constructor for this class
     * 
     * @param obj
     *            This will be either id, cost, date, and keywords, so it should
     *            be generic as it can be both integer or string
     * @param seminar
     *            The Seminar that corresponds to the key.
     */
    public KeyValue(T obj, Seminar seminar) {
        key = obj;
        sem = seminar;
    }


    /**
     * The getter method for the key.
     * 
     * @return key this can be integer or string based on which key is used to
     *         make the object
     */
    public T getKey() {
        return key;
    }


    /**
     * The getter method for the seminar.
     * 
     * @return sem The seminar that was used to make this keyvalue object.
     */
    public Seminar getSeminar() {
        return sem;
    }
}
