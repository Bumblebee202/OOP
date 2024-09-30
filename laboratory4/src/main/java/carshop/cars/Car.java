package carshop.cars;

public abstract class Car 
{
    protected boolean _isSellOut;
    protected double _regularPrice;
    protected Color _color;

    public Car(double regularPrice, Color color)
    {
        this(regularPrice, color, false);
    }

    public Car(double regularPrice, Color color, boolean isSellOut)
    {
        _isSellOut = isSellOut;
        _regularPrice = regularPrice;
        _color = color;
    }

    public void SetIsSellOut(boolean value)
    {
        _isSellOut = value;
    }

    public boolean IsSellOut()
    {
        return _isSellOut;
    }

    public double GetSalePrice()
    {
        return _regularPrice;
    }

    public Color GetColor()
    {
        return _color;
    }
}