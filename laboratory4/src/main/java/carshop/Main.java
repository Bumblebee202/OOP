package carshop;

import carshop.implementations.MyOwnAutoShop;
import carshop.interfaces.IAdmin;
import carshop.interfaces.ICustomer;

public class Main 
{
    public static void main(String[] args) 
    {
        var shop = new MyOwnAutoShop();

        ShowIncome(shop);

        ShowCarInfo(0, shop);
        ShowCarInfo(1, shop);

        shop.PurchaseCar(1);

        ShowIncome(shop);
    }

    private static void ShowCarInfo(int id, ICustomer customer)
    {
        System.out.println(customer.GetCarPrice(id));
        System.out.println(customer.GetCarColor(id) + "\n");
    }

    private static void ShowIncome(IAdmin admin)
    {
        System.out.println("Income:" + admin.GetIncome() + "\n");
    }
}