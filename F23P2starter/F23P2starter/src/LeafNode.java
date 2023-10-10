/**
 * The class for leafNode
 * 
 */
public class LeafNode implements BiNode {

    /**
     * Fields
     */
    private Seminar data;
    private LeafNode temp;

    /**
     * Constructor
     * 
     * @param key
     */
    public LeafNode(Seminar key) {
        this.data = key;

    }


    /**
     * The method to insert a seminar in the leafNode
     * If a seminar is inserted in the leafNode, the leaftnode
     * transforms to the internal node.
     * Assume that the leafnode is not empty, as leafnode is made when there is
     * a seminar inside an empty node
     * 
     */
    @Override
    public BiNode insert(Seminar Key) {

        InternalNode inter = new InternalNode(null, null);

        return inter;

    }


    @Override
    public String traverse() {
        // TODO Auto-generated method stub
        return this.data.toString();
    }

}
