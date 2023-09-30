/**
 * 
 * World class that will work as a database for BST and Bintree.
 * 
 * 
 * 
 * @author busam
 * 
 * @author Moonwon Jeon
 * 
 * @version 2023/09/24
 * 
 * @param <T>
 * 
 */

public class World<T> {

    /**
     * 
     * Fields
     * 
     */

    private int size;

    private BST<Integer> idTree;

    private BST<String> keywordTree;

    private BST<Integer> costTree;

    private BST<String> dateTree;

    private Bintree map;

    /**
     * 
     * Constructor for this class that works as a database to store x,y, and ID.
     * 
     * 
     * 
     * @param worldSize
     * 
     *            The integer of 2^n form
     * 
     * @throws Exception
     * 
     */

    public World(int worldSize) throws Exception {

        /**
         * 
         * checking if the world size is in the form of 2^n
         * 
         */

        if (!sizeCheck(worldSize)) {

            throw new Exception(

                "The size of world should be an integer of 2^n");

        }

        size = worldSize;

        idTree = new BST();

        keywordTree = new BST();

        costTree = new BST();

        dateTree = new BST();

    }


    /**
     * 
     * A method that returns the size
     * 
     * 
     * 
     * @return size of the world
     * 
     */

    public int getWorldSize() {

        return size;

    }


    /**
     * 
     * A method to check whether the number is qualified or not.
     * 
     * 
     * 
     * @param num
     * 
     *            The number to be checked, the worldsize
     * 
     * @return true if the number is in the form of 2^n, false if not.
     * 
     */

    private boolean sizeCheck(int num) {

        if (num < 2) {

            return false;

        }

        if (num == 2) {

            return true;

        }

        while (num > 2) {

            if (num % 2 != 0) {

                return false;

            }

            num = num / 2;

        }

        return true;

    }


    /**
     * 
     * Insert method inserts the seminar to each tree based on each element
     * 
     * The keyvalue object is made in order to insert into bst.
     * 
     * 
     * 
     * @param sem
     * 
     *            The seminar that is obtained from the parser.
     * 
     */

    public void insert(Seminar sem) {
        // when there is a same id in the idtree

        if (!idTree.inorderSearch((Integer)sem.id())) {
            System.out.println(
                "Insert FAILED - There is already a record with ID "
                    + (Integer)sem.id());
        }

        // when the coordinate is negative.
        if (sem.x() < 0 || sem.y() < 0) {
            System.out.println("Insert FAILED - Bad x, y coordinates: " + sem
                .x() + " " + sem.y());

        }

        // when the coordinate is larger than the map.
        if (sem.x() < size || sem.y() < size) {
            System.out.println("Insert FAILED - Bad x, y coordinates: " + sem
                .x() + " " + sem.y());

        }

        KeyPair locationKey = new KeyPair(sem.x(), sem.y()); 
        map
        
        KeyValue idKey = new KeyValue((Integer)sem.id(), sem);

        idTree.insert(idKey);

        KeyValue costKey = new KeyValue((Integer)sem.cost(), sem);

        costTree.insert(costKey);

        KeyValue dateKey = new KeyValue(sem.date(), sem);

        dateTree.insert(dateKey);

        KeyValue keywordKey;

        for (int i = 0; i < sem.keywords().length; i++) {

            keywordKey = new KeyValue(sem.keywords()[i], sem);

            keywordTree.insert(keywordKey);

        }

    }


    /**
     * 
     * Search a seminar with its id in idTree.
     * 
     * 
     * 
     * @param id
     * 
     *            The id of the seminar
     * 
     */

    public void search(int id) {

        if (idTree.inorderSearch((Integer)id)) {
            idTree.search(id).getSeminar().toString();
        }
        else {
            System.out.println("Search FAILED -- There is no record with ID "
                + id);
        }
        // return result;

    }


    /**
     * 
     * The method finds seminars that fall into the range between low and high
     * 
     * 
     * 
     * @param low
     * 
     *            The minimum range of the cost
     * 
     * @param high
     * 
     *            The maximum range of the cost
     * 
     */

    public void search(int low, int high) {

        costTree.comparisonSearch(low, high);

    }


    /**
     * 
     * The method finds seminar based on keywords.
     * 
     * The method prints all the seminars that have the keyword.
     * 
     * 
     * 
     * @param key
     * 
     *            The key word used to find the seminars.
     * 
     */

    public void search(String key) {

        keywordTree.searchKey(key);

    }


    /**
     * 
     * The method to find a seminar in binTree with its location.
     * 
     * 
     * 
     * @param x
     * 
     *            The x-coordinate of the seminar
     * 
     * @param y
     * 
     *            The y-coordinate of the seminar
     * 
     * @param r
     * 
     *            The radius of the seminar
     * 
     */

    public void search(int x, int y, int r) {

        // intentionally empty

    }


    /**
     * 
     * This methods deletes a seminar inside the bst that has the id.
     * 
     * 
     * 
     * @param id
     * 
     *            The id of the seminar that will be deleted.
     * 
     */

    public void delete(int id) {

        // intentionally empty.

    }


    /**
     * 
     * This method prints a seminar
     * 
     * 
     * 
     * @param printStatement
     *            The specific print statement
     * 
     */

    public void print(String printStatement) {

    }

}
