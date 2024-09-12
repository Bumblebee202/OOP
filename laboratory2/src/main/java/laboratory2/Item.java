package laboratory2;

public class Item 
{
    private String _name;
    private float _price;

    public Item(String name, float price)
    {
        _name = name;
        _price = price < 0f
            ? 0f
            : price;
    }

    public void SetName(String value)
    {
        _name = value;
    }

    public String GetName()
    {
        return _name;
    }

    public void IncreasePrice(float percent)
    {
        _price += GetPercent(percent);
    }

    public void DecreasePrice(float percent)
    {
        if (percent >= 100f) 
        {
            _price = 0;
            return;
        }

        _price -= GetPercent(percent);

        if (_price < 0f) 
        {
            _price = 0f;
        }
    }

    public float GetPrice()
    {
        return _price;
    }

    private float GetPercent(float percent)
    {
       return _price / 100f * percent;
    }
}
