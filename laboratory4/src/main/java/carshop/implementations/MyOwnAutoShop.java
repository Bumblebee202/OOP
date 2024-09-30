package carshop.implementations;

import java.util.ArrayList;

import carshop.cars.Car;
import carshop.cars.Color;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.interfaces.IAdmin;
import carshop.interfaces.ICustomer;

public class MyOwnAutoShop implements IAdmin, ICustomer
{
    private Car[] _cars;

    public MyOwnAutoShop()
    {
        _cars = new Car[]
        {
            new Sedan(1000, Color.White, 15),
            new Sedan(1500, Color.Blue, 21),
            new Ford(3000, Color.Black, 2015, 0),
            new Ford(3500, Color.Blue, 2014, 200),
            new Truck(5000, Color.Black, 1500),
            new Truck(6000, Color.Black, 2500),
        };
    }

    @Override
    public double[] GetCarsPrice() 
    {
        var unsoldCars = GetUnsoldCars();
        return unsoldCars.stream()
                         .mapToDouble(Car::GetSalePrice)
                         .toArray();
    }

    @Override
    public Color[] GetCarColors() 
    {
        var unsoldCars = GetUnsoldCars();
        
        var colors = new Color[unsoldCars.size()];

        for (var i = 0; i < unsoldCars.size(); i++)
        {
            colors[i] = unsoldCars.get(i)
                                  .GetColor();
        }

        return colors;
    }

    @Override
    public double GetCarPrice(int id) 
    {
        var car = GetUnsoldCars().get(id);
        return car.GetSalePrice();
    }

    @Override
    public Color GetCarColor(int id) 
    {
        var car = GetUnsoldCars().get(id);
        return car.GetColor();
    }

    @Override
    public void PurchaseCar(int id) 
    {
        var car = GetUnsoldCars().get(id);
        car.SetIsSellOut(true);
    }

    @Override
    public double GetIncome() 
    {
        var soldCars = GetSoldCars();
        return soldCars.stream()
                       .mapToDouble(Car::GetSalePrice)
                       .sum();
    }

    private ArrayList<Car> GetSoldCars()
    {
        var soldCars = new ArrayList<Car>();

        for (var car : _cars) 
        {
            if (car.IsSellOut()) 
            {
                soldCars.add(car);
            }
        }

        return soldCars;
    }

    private ArrayList<Car> GetUnsoldCars()
    {
        var unsoldCars = new ArrayList<Car>();

        for (var car : _cars) 
        {
            if (!car.IsSellOut()) 
            {
                unsoldCars.add(car);
            }
        }

        return unsoldCars;
    }
}