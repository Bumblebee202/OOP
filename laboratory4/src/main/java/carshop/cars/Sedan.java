package carshop.cars;

public final class Sedan extends Car
{
    private int _length;

    public Sedan(double regularPrice, Color color, int length)  
    {
        super(regularPrice, color);

        _length = length;
    }

    public Sedan(double regularPrice, Color color, boolean isSellOut, int length)  
    {
        super(regularPrice, color, isSellOut);

        _length = length;
    }

    public int GetLength()
    {
        return _length;
    }

    @Override
    public double GetSalePrice()
    {
        if (_length > 20) 
        {
            return _regularPrice - GetPercent(5d);
            
        }
        
        return super.GetSalePrice();
    }

    private double GetPercent(double percent)
    {
       return _regularPrice / 100d * percent;
    }
}