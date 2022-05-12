public class DataBase {
    private static DataBase dataBase;
    
    private DataBase() {
        dataBase = null;
    }

    public String getResponse() {
        return "An example response";
    }

    public static DataBase getDataBase() {
        if(dataBase == null) {
            dataBase = new DataBase();
        }
        return dataBase;
    }
}