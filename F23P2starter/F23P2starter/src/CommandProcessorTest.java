import student.TestCase;

/**
 * Test class for CommandProcessor
 * 
 * @author anekab
 * 
 * @version August 2023
 */
public class CommandProcessorTest extends TestCase {

    private Seminar sem = new Seminar();
    private CommandProcessor commandProcessor = new CommandProcessor(sem);
    private World testWorld;

    /**
     * The set up method for the command processor test
     */
    public void setUp() throws Exception {
        testWorld = new World(64);
    }


    /**
     * Test method for the parsing method
     * 
     * @throws Exception
     */
    public void testParsing() throws Exception {

        commandProcessor.beginParsing(16, "P2Sample_input.txt");
        commandProcessor.beginParsing(16, null);
        String fileName = "TestInvalidCommand";
        commandProcessor.beginParsing(16, fileName);
        assertNotNull(fileName);

    }


    /**
     * Test method for insert
     */
    public void testMethods() {
        int idin = 0;
        String[] keywords = new String[3];
        keywords[0] = "a";
        keywords[1] = "b";
        keywords[2] = "c";
        String tin = "";
        String datein = "11";
        int lin = 0;
        short x = 0;
        short y = 1;
        int cin = 2;
        String descin = "";

        sem = new Seminar(idin, tin, datein, lin, x, y, cin, keywords, descin);
        testWorld.insert(sem);
        assertEquals(testWorld.getWorldSize(), 64);
        idin = -1;
        assertTrue(idin < 0);
        assertFalse(idin > 0);

    }

}
