
public class EmptyNode implements BiNode {

    private Seminar temp; 
    
    public EmptyNode(Seminar key)
    {
        temp = key; 
    }
    
    @Override
    public BiNode insert(Seminar key)
    {

        LeafNode leaf = new LeafNode(key); 
        return leaf;
        
    }

    @Override
    public void traverse() {
        // TODO Auto-generated method stub
        
    }
    
    
    
    
    
    
}
