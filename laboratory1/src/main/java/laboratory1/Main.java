package laboratory1;

public class Main 
{
    public static void main(String[] args) 
    {
        //Laboratory1
        var numbers = new int[] { 10, 10, 30, 40, 50, 50, 60, 80, 90 };
        // var numbers = new int[] { 10, 30, 20, 30 };
        System.out.println(IsSequence(numbers));
        System.out.println("\n");
    }

    public static boolean IsSequence(int[] numbers)
    {
        if (numbers.length < 2) 
        {
            return false;
        }

        var prevValue = numbers[0];
        for (var i = 1; i < numbers.length; i++)
        {
            var value = numbers[i];
            if (prevValue > value) 
            {
                return false;
            }

            prevValue = value;
        }

        return true;
    }
}