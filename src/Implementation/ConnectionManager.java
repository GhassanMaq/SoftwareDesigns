public class ConnectionManager {
    private FakeDB db;

    public ConnectionManager() {
        db = FakeDB.getInstance();
        db.connect();
    }

    @Override
    protected void finalize() throws Throwable {
        db.disconnect();
        super.finalize();
    }
}
