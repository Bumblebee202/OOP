package module1;

import java.io.Closeable;
import java.util.Scanner;
import java.util.Random;

public abstract class BaseTask implements Closeable
{
    protected Scanner _scanner;
    protected Random _random;

    public BaseTask()
    {
        _scanner = new Scanner(System.in);
        _random = new Random();
    }

    public abstract void Action();

    public void close()
    {
        _scanner.close();
    }

    //all protected methods I've reused into child types
    //or I've just decided left them here
    protected void ShowTaskNumber(int number)
    {
        var str = String.format("Task number: %s", number);
        System.out.println(str);
    }

    protected void ShowSeparator()
    {
        System.out.println("\n\n");
    }

    protected int GenerateRandomValue(int bottom, int top, boolean hasInclusive)
    {
        var inclusive = hasInclusive
            ? 1
            : 0;

        return _random.nextInt(top - bottom) + (bottom + inclusive);
    }

    protected void FillIntegerArrayRandomly(Integer[] arr, int bottom, int top, boolean hasInclusive)
    {
        for (var i = 0; i < arr.length; i++)
        {
            arr[i] = GenerateRandomValue(bottom, top, hasInclusive);
        }
    }

    protected void FillIntArrayRandomly(int[] arr, int bottom, int top, boolean hasInclusive)
    {
        for (var i = 0; i < arr.length; i++)
        {
            arr[i] = GenerateRandomValue(bottom, top, hasInclusive);
        }
    }

    protected int SumOfDigits(int value)
    {
        var sum = 0;

        while (value != 0) 
        {
            sum += value % 10;
            value /= 10;
        }

        return sum;
    }
}
