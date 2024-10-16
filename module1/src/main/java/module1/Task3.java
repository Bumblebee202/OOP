package module1;

//3. З клавіатури вводиться ціле число. 
//Вивести на екран усі числа, на які введене число 
//ділиться без залишку. Наприклад, для 60 такими числами стануть 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60. 
public class Task3 extends BaseTask
{
    @Override
    public void Action() 
    {
        ShowTaskNumber(3);

        System.out.println("Enter a number: ");
        var number = _scanner.nextInt();

        for (var i = 1; i <= number; i++)
        {
            if (number % i == 0) 
            {
                System.out.println(i);
            }
        }

        ShowSeparator();
    }

}
