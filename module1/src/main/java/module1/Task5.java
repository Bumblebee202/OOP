package module1;

import java.util.ArrayList;

//5. Показати номери та загальну кількість усіх щасливих трамвайних квитків із шестизначними номерами. 
public class Task5 extends BaseTask
{

    @Override
    public void Action() 
    {
        ShowTaskNumber(5);

        var min = 100000;
        var max = 999999;

        var tickets = new ArrayList<Integer>();

        for (var i = min; i <= max; i++)
        {
            if (IsLuckyTicket(i)) 
            {
                tickets.add(i);
            }
        }

        System.out.println(String.format("Tickets count: %s", tickets.size()));

        for (var ticket : tickets) 
        {
            System.out.println(ticket);
        }

        ShowSeparator();
    }

    private boolean IsLuckyTicket(Integer value)
    {
        var strValue = value.toString();

        var sumOfFirstPart = GetSum(strValue, 0, 3);
        var sumOfSecondPart = GetSum(strValue, 3, 6);

        return sumOfFirstPart == sumOfSecondPart;
    }

    private int GetSum(String str, int startIndex, int endIndex)
    {
        var sum = 0;

        for (var i = startIndex; i < endIndex; i++)
        {
            var symbol = str.charAt(i);
            var number = Character.getNumericValue(symbol);
            sum += number;
        }

        return sum;
    }

}
