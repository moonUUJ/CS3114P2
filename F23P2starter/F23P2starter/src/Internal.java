
public class Internal<leaf> {

    
    private leaf<KeyPair> left; 
    private leaf<KeyPair> right; 
    private leaf<KeyPair> root; 
    private leaf<KeyPair> temp; 
    
    
    public Internal()
    {
        this.root = null;
        this.left = null;
        this.right = null; 
    }
    
    public void insert(KeyPair key) 
    {
        if (root == null)
        {
            System.out.println("root is empty");
            root = new leaf<KeyPair>(key);
            System.out.println("added: " + key.getX() + ", " + key.getY());
        }
        
        //root is full, set the current root as temp and make empty leaves
        
        
        
    }
    
    public KeyPair getRoot() {
        return root.data;   
    }
    private class leaf<KeyPair>
    {
        private KeyPair data; 
        
        public leaf(KeyPair data)
        {
            this.data = data; 
        }
    }
}
