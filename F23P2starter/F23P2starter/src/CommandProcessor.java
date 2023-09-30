
import java.io.File;
import java.util.Scanner;

/**
 * The class responsible for parsing through the input files and then sends the
 * necessary information to the WorldDatabase
 * 
 * @author anekab
 * 
 * @version August 2023
 */
public class CommandProcessor {
    private World world;
    private Seminar seminar;

    /**
     * Constructor for CommandProcessor
     * 
     * @param seminar
     *            Seminar
     */
    public CommandProcessor(Seminar seminar) {
        this.seminar = seminar;
    }


    /**
     * Method were the actual parsing/reading of the file is being taken place
     * 
     * @param worldSize
     *            the world size
     * 
     * @param fileName
     *            String
     * @throws Exception
     * 
     */
    public void beginParsing(int worldSize, String fileName) throws Exception {
        int iD = 0;
        world = new World(worldSize);
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                String command = scanner.next();

                switch (command) {
                    case "insert":
                        iD = scanner.nextInt();
                        scanner.nextLine();
                        String title = scanner.nextLine();
                        String date = scanner.next();
                        int length = scanner.nextInt();
                        short x = scanner.nextShort();

                        short y = scanner.nextShort();
                        int cost = scanner.nextInt();
                        scanner.nextLine();
                        String totalKeyword = scanner.nextLine();
                        String[] keywords = totalKeyword.split("\\s+");

                        String description = scanner.nextLine();
                        Seminar insertSeminar = new Seminar(iD, title, date,
                            length, x, y, cost, keywords, description);
                        world.insert(insertSeminar);
                        break;
                    case "delete":
                        iD = scanner.nextInt();
                        world.delete(iD);
                        break;
                    case "search":
                        String specific = scanner.next();
                        if (specific.equals("ID")) {
                            iD = scanner.nextInt();
                            world.search(iD);
                        }
                        else if (specific.equals("cost")) {
                            int low = scanner.nextInt();
                            int high = scanner.nextInt();
                            world.search(low, high);
                        }
                        else if (specific.equals("date")) {
                            int date1 = scanner.nextInt();
                            int date2 = scanner.nextInt();
                            world.search(date1, date2);
                        }
                        else if (specific.equals("keyword")) {
                            String key = scanner.next();

                            world.search(key);
                        }
                        else if (specific.equals("location")) {
                            int xLocation = scanner.nextInt();
                            int yLocation = scanner.nextInt();
                            int radius = scanner.nextInt();
                            world.search(xLocation, yLocation, radius);
                        }

                        break;
                    case "print":
                        String printStatement = scanner.next();
                        world.print(printStatement);
                        break;

                }

            }
            scanner.close();

        }
        catch (

        Exception e) {
            e.printStackTrace();
        }

    }
}
