package laboratory3;

public class Main 
{
    public static void main(String[] args) 
    {
        var str = "tired";
        // str = "Hello world";
        System.out.println(EndsWithEd(str));

        str = "Look, if you had 1 shot or 1 opportunity. To seize everything you ever wanted in one moment. Would you capture it or just let it slip?";
        // str = "string without any numbers"
        System.out.println(SumNumbersInString(str));
    }

    //1. Реалізуйте метод, який приймає на вхід рядок та повертає true,
    //якщо рядок закінчується на «ed» і false у противному випадку;
    private static boolean EndsWithEd(String str)
    {
        return str.endsWith("ed");
    }

    //2. Реалізуйте метод, який приймає на вхід рядок та повертає суму цифр,
    //які були знайдені у цьому рядку (якщо цифр немає – повертається 0);
    private static int SumNumbersInString(String str)
    {
        var sum = 0;

        //Java doesn't support foreach loop...
        for (var i = 0; i < str.length(); i++)
        {
            var symbol = str.charAt(i);
            if (Character.isDigit(symbol)) 
            {
                sum += Character.getNumericValue(symbol);
            }
        }

        return sum;
    }
}