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

        str = "aaaaaBCSAAA";
        System.out.println(GetLongestBlockOfSymbol(str));

        str = "Look, if you had one shot or one opportunity.";
        Split(str);
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

    //3. Реалізуйте метод, який приймає на вхід рядок і
    //повертає довжину найдовшого «блоку» символів у цьому рядку («блок» - безліч 
    //однакових символів, що йдуть поспіль, наприклад, 
    //у рядку «aaBCS» - найдовший блок «аа» довжиною 2 символу );
    private static int GetLongestBlockOfSymbol(String str)
    {
        var size = 0;

        var strLen = str.length();

        for (var i = 0; i < strLen; i++)
        {
            var firstBlockSymbol = str.charAt(i);

            var blockSize = 1;

            for (var j = i + 1; j < strLen; j++)
            {
                var nextSymbol = str.charAt(j);
                i = j - 1;
                if (firstBlockSymbol != nextSymbol) 
                {
                    break;
                }

                ++blockSize;
            }

            if (size < blockSize) 
            {
                size = blockSize;    
            }
        }

        return size;
    }

    //4. Реалізуйте метод, який приймає на вхід рядок і виводить у консоль
    //знайдені слова у цьому рядку (слова відокремлюються пробілами, крім випадків,
    // коли слово стоїть на початку або наприкінці).
    private static void Split(String str)
    {
        var words = str.split("[ ]");

        for (String word : words) 
        {
            System.out.println(word);
        }
    }
}