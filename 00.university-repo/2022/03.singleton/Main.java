public class Main {
    public static void main(String[] args) {
        DataBase dataBase = DataBase.getDataBase();
        System.out.println(dataBase.getResponse());

        API api = new API();
        System.out.println(api.getResponse());
    }
}
