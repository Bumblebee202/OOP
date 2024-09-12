package laboratory2;

public class Cart 
{
    private int _count;
    private Item[] _items;

    public Cart(int capacity)
    {
        capacity = capacity < 4
            ? 4
            : capacity;

        _items = new Item[capacity];
    }

    public int GetCapacity()
    {
        return _items.length;
    }

    public int GetCount()
    {
        return _count;
    }
    
    public boolean IsEmpty()
    {
        return _count == 0;
    }

    public void Clear()
    {
        for (var i = 0; i < _count; i++)
        {
            _items[i] = null;
        }

        _count = 0;
    }
    
    /**
     * Pushes an item to the top of the stack.
     * @param item
     */
    public void AddItem(Item item)
    {
        var count = _count + 1;

        if (count > _items.length) 
        {
            var len = _items.length * 2;
            var newArray = new Item[len];

            System.arraycopy(_items, 0, newArray, 0, _items.length);
            
            _items = newArray;
        }

        _items[_count] = item;
        _count = count;
    }
    
    /**
     * Removes and returns the object at the top of the stack.
     * @return
     */
    public Item RemoveLastItem()
    {
        if (IsEmpty()) 
        {
            throw new RuntimeException("Cart is empty");
        }

        --_count;

        var item = _items[_count];

        _items[_count] = null;

        return item;
    }

    public float GetTotalPrice()
    {
        var price = 0f;

        for (var i = 0; i < _count; i++) 
        {
            var item = _items[i];
            price += item.GetPrice();    
        }

        return price;
    }

    public void IncreasePrice(float percent)
    {
        for (var item : _items) 
        {
            item.IncreasePrice(percent);    
        }
    }

    public void DecreasePrice(float percent)
    {
        for (var item : _items) 
        {
            item.DecreasePrice(percent);    
        }
    }
}