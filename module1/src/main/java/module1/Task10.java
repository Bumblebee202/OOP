package module1;
//10. Створіть масив із 4 випадкових цілих чисел із відрізка [10;99], виведіть його на екран у рядок. 
//Визначити і вивести на екран повідомлення про те, чи є масив послідовністю, що строго зростає. 
public class Task10 extends BaseTask
{
    private int _bottom = 10;
    private int _top = 100;

    @Override
    public void Action() 
    {
        var size = 4;
        var numbers = new int[size];

        FillIntArrayRandomly(numbers, _bottom, _top, false);

        for (var number : numbers) 
        {
            System.out.print(number);
            System.out.print(' ');    
        }

        var answer = IsSequence(numbers)
            ? "Each element is larger than previous one"
            : "Oops..";

        System.out.println(answer);

        ShowSeparator();
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
