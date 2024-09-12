package laboratory2;

public class Main {
    public static void main(String[] args) 
    {
        var cart = new Cart(4);

        var banana = new Item("Banana", 20f);
        var orange = new Item("Orange", 32.5f);
        var lemon = new Item("Lemon", 45.75f);
        var apple = new Item("Apple", 10.2f);
        var pineapple = new Item("Pineapple", 100f);

        cart.AddItem(banana);
        cart.AddItem(orange);
        cart.AddItem(lemon);
        cart.AddItem(apple);
        cart.AddItem(pineapple);

        ShowTotalPrice(cart);

        cart.IncreasePrice(15f);
        ShowTotalPrice(cart);

        cart.DecreasePrice(30f);
        ShowTotalPrice(cart);
        // cart.Clear();
        // var removedItem = cart.RemoveLastItem();
    }

    private static void ShowTotalPrice(Cart cart)
    {
        var totalPrice = cart.GetTotalPrice();
        System.out.println(String.format("Total price: %s\n", totalPrice));
    }
}