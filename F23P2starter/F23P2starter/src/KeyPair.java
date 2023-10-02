
public class KeyPair {

    private int x; 
    private int y; 
    private Seminar sem; 
    
    public KeyPair(int x, int y, Seminar sem)
    {
        this.x = x;
        this.y = y; 
        this.sem = sem; 
    }
    
    public int getX() 
    {
        return x; 
    }
    
    public int getY() 
    {
        return y; 
        
    }
    
    public Seminar getSeminar() 
    {
        return sem; 
    }
}
