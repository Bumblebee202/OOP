package carshop.interfaces;

import carshop.cars.Color;

public interface ICustomer 
{
    double[] GetCarsPrice();
    Color[] GetCarColors();
    double GetCarPrice(int id);
    Color GetCarColor(int id);
    void PurchaseCar(int id);
}