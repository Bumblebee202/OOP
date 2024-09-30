package carshop.cars;

public final class Ford extends Car
{
    private int _year;
    private int _manufacturerDiscount;

    public Ford(double regularPrice, Color color, int year, int manufacturerDiscount)  
    {
        super(regularPrice, color);

        _year = year;
        _manufacturerDiscount = manufacturerDiscount;
    }

    public Ford(double regularPrice, Color color, boolean isSellOut, int year, int manufacturerDiscount)  
    {
        super(regularPrice, color, isSellOut);

        _year = year;
        _manufacturerDiscount = manufacturerDiscount;
    }

    public int GetYear()
    {
        return _year;
    }

    @Override
    public double GetSalePrice()
    {
        return _regularPrice - _manufacturerDiscount;
    }
}