package sg.edu.nus.iss;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // CollectionSortExample cse = new CollectionSortExample();
        // cse.example02();

        // HashMapExample hme = new HashMapExample();
        // hme.example();
        ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        chme.example();
        }
}
