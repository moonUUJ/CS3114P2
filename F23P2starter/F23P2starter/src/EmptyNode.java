/**
 * EmptyNode class that results in leaf node 
 */
public class EmptyNode implements BiNode {

    /**
     * Fields 
     */
    private Seminar temp; 
    public int level = 1;
    public EmptyNode(Seminar key)
    {
        temp = key; 
    }
    
    /**
     * EmptyNode is assumed to be empty, when it is inserted with a seminar, it becomes a leafnode
     */
    @Override
    public BiNode insert(Seminar key)
    {

        
        
        LeafNode leaf = new LeafNode(key); 
        return leaf;
        
    }

    @Override
    public String traverse() {
        
        return "Nothing in it";
        
    }

    
    
    
    
    
    
}
