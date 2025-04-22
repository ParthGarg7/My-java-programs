// Interface
interface EventHandler {
    void handleEvent();
}

// Main class
public class Exp3 {

    // Method demonstrating local inner class
    public void registerEvent() {
        // Local inner class inside method
        class LocalEventHandler implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }

        EventHandler handler = new LocalEventHandler();
        handler.handleEvent();
    }

    // Main method
    public static void main(String[] args) {
        Exp3 exp = new Exp3();

        // Call method that uses local inner class
        exp.registerEvent();

        // Anonymous inner class
        EventHandler anonymousHandler = new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };

        // Call the method
        anonymousHandler.handleEvent();
    }
}
