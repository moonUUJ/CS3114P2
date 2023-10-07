/**
 * The KV Pair class
 * 
 * @author busam
 * @author moonmoon
 * @version 09/23
 *
 * @param <K>
 *            the key
 * @param <V>
 *            the value
 */
public class KVPair<K extends Comparable<K>, V>
    implements Comparable<KVPair<K, V>> {
    private K theKey;
    private V theVal;

    /**
     * The KVPair Constructor
     * 
     * @param k
     *            the Key
     * @param v
     *            the Value
     */
    public KVPair(K k, V v) {
        theKey = k;
        theVal = v;
    }


    /**
     * The Compare to method
     * 
     * @param it
     *            the KV Pair
     * @return the int value of comparison
     */

    // Compare KVPairs
    public int compareTo(KVPair<K, V> it) {
        return theKey.compareTo(it.key());
    }


    /**
     * Compare the Keys
     * 
     * @param it
     * @return int value of comparsion
     */
    // Compare against a key
    public int compareTo(K it) {
        return theKey.compareTo(it);
    }


    /**
     * Getter method for key
     * 
     * @return the key
     */
    public K key() {
        return theKey;
    }


    /**
     * Getter method for value
     * 
     * @return the value
     */
    public V value() {
        return theVal;
    }


    /**
     * Return String format
     * 
     * @return the string
     */
    public String toString() {
        String s = "(";
        if (theKey != null) {
            s += theKey.toString();
        }
        else {
            s += "null";
        }
        s += ", ";
        if (theVal != null) {
            s += theVal.toString();
        }
        else {
            s += "null";
        }
        s += ")";
        return s;
    }
}
