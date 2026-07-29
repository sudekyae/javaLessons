public class CustomerManager {

    BaseDatabaseManager databaseManager;
//    hangi veritabanını verirsek onun getdatasını çağırmış olacağız.

    public void getCustomers(){
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        bu şekilde yazarsak bağımlı oluruz!
        databaseManager.getData();
    }
}
