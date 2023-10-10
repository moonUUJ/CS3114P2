/**
 * Interface called Binode
 * This interface is consisted of three classes: EmptyNode, LeafNode, and InternalNode
 * The three classes are the form of nodes can be.
 * The node is empty at first, and when it is inserted, it becomes leafnode. 
 * Since there is an element in the leafnode, it becomes internal node when another seminar is to be inserted.
 * The leafnode is splitted into two separate nodes that has no root, called internal node. 
 * 
 */
public interface BiNode {

    /**
     * Insert classes for emptynode, leafnode, and internal node
     * @param Key The seminar that will be inserted 
     * @return BiNode The node used in Bintree 
     */
    public BiNode insert(Seminar Key);  
    
    
    /**
     * The Traverse method that traverses the nodes
     * @return seminars as a string 
     */
    public String traverse(); 

    
}



