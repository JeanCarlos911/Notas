public class DataBase {
    private static final DataBase dataBase = new DataBase();
    
    private DataBase() {}

    public String getResponse() {
        return "An example response";
    }

    public static DataBase getDataBase() {
        return dataBase;
    }
}
