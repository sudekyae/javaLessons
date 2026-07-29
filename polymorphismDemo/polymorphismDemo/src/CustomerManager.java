
public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");
        //bağımlı sistem:
        // DatabaseLogger logger = new DatabaseLogger();
        // logger.Log("Log mesajı");
    }
}
