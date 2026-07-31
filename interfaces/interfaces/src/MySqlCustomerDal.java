public class MySqlCustomerDal implements ICustomerDal, IRepository{
//   classlar birden fazla interface i implements edebilir

    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }
}
