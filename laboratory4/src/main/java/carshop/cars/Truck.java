package carshop.cars;

public final class Truck extends Car
{
    private int _weight;

    public Truck(double regularPrice, Color color, int weight)  
    {
        super(regularPrice, color);

        _weight = weight;
    }

    public Truck(double regularPrice, Color color, boolean isSellOut, int weight)  
    {
        super(regularPrice, color, isSellOut);

        _weight = weight;
    }
    
    @Override
    public double GetSalePrice()
    {
        if (_weight > 2000) 
        {
            return _regularPrice - GetPercent(10d);
            
        }
        
        return super.GetSalePrice();
    }

    private double GetPercent(double percent)
    {
       return _regularPrice / 100d * percent;
    }
}