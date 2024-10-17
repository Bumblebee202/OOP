package module1;

import java.util.ArrayList;

//6. Показати на екран усі восьмизначні числа, цифри у яких не повторюються. 
//Ці числа повинні ділитися на 12 345 без залишку. Показати загальну кількість знайдених чисел. 
public class Task6 extends BaseTask
{
    @Override
    public void Action() 
    {
        var min = 10000000;
        var max = 99999999;

        var numbers = new ArrayList<Integer>();

        for (var i = min; i <= max; i++)
        {
            var number = Integer.valueOf(i);
            if (i % 12345 == 0 && HasUniqueDigits(number)) 
            {
                numbers.add(number);
            }
        }

        System.out.println(String.format("Numbers count: %s", numbers.size()));

        for (var number : numbers) 
        {
            System.out.println(number);
        }

        ShowSeparator();
    }

    private boolean HasUniqueDigits(Integer number)
    {
        var str = number.toString();

        for (var i = 0; i < str.length() - 1; i++)
        {
            var symbol = str.charAt(i);
            if (Contains(str, symbol, i + 1)) 
            {
                return false;
            }
        }

        return true;
    }

    private boolean Contains(String str, char symbol, int index)
    {
        for (var i = index; i < str.length(); i++)
        {
            var currentSymbol = str.charAt(i);

            if (symbol == currentSymbol) 
            {
                return true;
            }
        }

        return false;
    }
}
