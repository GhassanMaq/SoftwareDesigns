public class FakeDB {
    private static FakeDB instance;
    private static boolean isConnected = false;

    private FakeDB() {
    }

    public static FakeDB getInstance() {
        if (instance == null) {
            instance = new FakeDB();
        }
        return instance;
    }

    public void connect() {
        if (!isConnected) {
            System.out.println("Connected to Fake DB.");
            isConnected = true;
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnected from Fake DB.");
            isConnected = false;
        }
    }
}
