
public class InternalNode<Seminar> implements BiNode {

    //private Seminar data;

    private Seminar data; 
    private LeafNode<Seminar> left;

    private LeafNode<Seminar> right;
    
    
    
    public InternalNode(LeafNode<Seminar> l, LeafNode<Seminar> r) 
    {
         
        this.left = l; 
        this.right = r; 
        
    }


    @Override
    public void insert(Seminar Key) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void traverse() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void insert(Seminar Key) {
        // TODO Auto-generated method stub
        
    }
}
