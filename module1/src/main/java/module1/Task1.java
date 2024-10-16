package module1;

//1. З клавіатури вводиться ціла кількість будь-якої розрядності. Визначити кількість цифр у ньому та їх суму. 
public class Task1 extends BaseTask
{
    @Override
    public void Action() 
    {
        ShowTaskNumber(1);
        System.out.println("Enter a number: ");
        var number = _scanner.nextInt();

        var count = CountOfDigits(number);

        System.out.println(String.format("Count of digits: %s", count));

        var sum = SumOfDigits(number);

        System.out.println(String.format("Sum of digits: %s", sum));

        ShowSeparator();
    }

    private int CountOfDigits(int value)
    {
        var count = 0;

        do 
        { 
            count++;
            value /=  10;
        } while (value != 0);

        return count;
    }

    private int SumOfDigits(int value)
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
