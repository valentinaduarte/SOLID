package ejercicio4;

public class DataService {
    private DataStorage dataStorage;

    public DataService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void saveData(String data) {
        this.dataStorage.save(data);
    }
}
