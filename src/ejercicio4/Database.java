package ejercicio4;

public class Database implements DataStorage {
    public Database() {
    }

    public void save(String data) {
        System.out.println("Saving data to database: " + data);
    }
}
