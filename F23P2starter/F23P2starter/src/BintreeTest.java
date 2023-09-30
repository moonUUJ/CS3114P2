import student.TestCase;
public class BintreeTest extends TestCase {

    private Bintree bt; 
    private KeyPair kp1; 
    private KeyPair kp2; 
    private KeyPair kp3; 
    public BintreeTest() 
    {
        //
    }
    
    public void setUp() 
    {
        bt = new Bintree(256); 
        kp1 = new KeyPair(130, 200);
        kp2 = new KeyPair(90, 200); 
        
    }
    
    public void testInsert()
    {
        assertTrue(bt.size() == 256);
        bt.insertBin(kp1);
        bt.insertBin(kp2);
    }
}
