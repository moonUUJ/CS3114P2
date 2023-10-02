import student.TestCase;
public class BintreeTest extends TestCase {

    private Bintree bt; 
    private Seminar sem;
    private Seminar sem1;
    private Seminar sem2;
    private Seminar sem3;
    private Seminar sem4;
    private Seminar sem5;
    private Seminar sem6;
    private Seminar sem7;
    private Seminar sem8;
    ; 
    public BintreeTest() 
    {
        //
    }
    
    public void setUp() 
    {
        bt = new Bintree(512); 
        int idin = 0;
        String[] keywords = new String[3];
        keywords[0] = "a";
        keywords[1] = "b";
        keywords[2] = "c";
        String tin = "";
        String datein = "11";
        int lin = 0;

        short x = 130;
        short y = 120;

        short x1 = 90;
        short y1 = 200;
        int cin1 = 10;
        int cin2 = 20;
        int cin = 0;
        String descin = "";

        short x2 = 30;
        short y2 = 154;

        short x3 = 1;
        short y3 = -1;

        short x4 = 10;
        short y4 = 10;

        short x5 = 1;
        short y5 = 20;

        short x6 = 20;
        short y6 = 1;

        short x7 = 1;
        short y7 = 9;

        short x8 = 20;
        short y8 = 20;

        int idin1 = 1;
        sem = new Seminar(idin, tin, datein, lin, x, y, cin, keywords, descin);
        sem1 = new Seminar(idin, tin, datein, lin, x1, y1, cin1, keywords,
            descin);

        sem2 = new Seminar(idin, tin, datein, lin, x2, y2, cin2, keywords,
            descin);
        sem3 = new Seminar(idin, tin, datein, lin, x3, y3, cin, keywords,
            descin);
        sem4 = new Seminar(idin, tin, datein, lin, x4, y4, cin, keywords,
            descin);
        sem5 = new Seminar(idin, tin, datein, lin, x5, y5, cin, keywords,
            descin);
        sem6 = new Seminar(idin, tin, datein, lin, x6, y6, cin, keywords,
            descin);
        sem7 = new Seminar(idin, tin, datein, lin, x7, y7, cin, keywords,
            descin);
        sem8 = new Seminar(idin, tin, datein, lin, x8, y8, cin, keywords,
            descin);
    }
    
    public void testInsert()
    {
        assertTrue(bt.size() == 512);
        
        bt.insertBin(sem);
        bt.getRoot().toString();
        bt.insertBin(sem1);
        bt.insertBin(sem2);
        
    }
    
    public void testPrint() 
    {
        bt.print();
        
        bt.insertBin(sem);
        //bt.getRoot().toString();
        bt.insertBin(sem1);
        bt.insertBin(sem2);
        
        bt.print(); 
    }
}
