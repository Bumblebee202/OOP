package module1;

//8. Ввести з клавіатури шестизначний номер трамвайного (тролейбусного) квитка, 
//і визначити, чи він щасливий (збігаються суми трьох перших і трьох останніх цифр квитка). 
public class Task8 extends BaseTask
{
    private int _min = 100000;
    private int _max = 999999;

    @Override
    public void Action() 
    {
        var ticketNumber = GetUserValue();

        var answer = IsLuckyTicket(ticketNumber)
            ? "Your ticket is lucky"
            : "Your ticket is unlucky";

        System.out.println(answer);

        ShowSeparator();
    }

    private int GetUserValue()
    {
        var answer = 0;
        do
        {
            System.out.println("Enter you ticket number:");
            answer = _scanner.nextInt();

            if (answer >= _min && answer <= _max) 
            {
                return answer;
            }
        }
        while(true);
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
