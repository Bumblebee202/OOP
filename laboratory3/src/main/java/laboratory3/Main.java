package laboratory3;

public class Main 
{
    public static void main(String[] args) 
    {
        var str = "tired";
        // str = "Hello world";
        System.out.println(EndsWithEd(str));
        System.out.println();

        str = "Look, if you had 1 shot or 1 opportunity. To seize everything you ever wanted in one moment. Would you capture it or just let it slip?";
        // str = "string without any numbers"
        System.out.println(SumNumbersInString(str));
        System.out.println();

        str = "aaaaaBCSAAA";
        System.out.println(GetLongestBlockOfSymbol(str));
        System.out.println();

        str = "Look, if you had one shot or one opportunity.";
        Split(str);
        System.out.println();

        System.out.println(CreateSequence("abc", "ABCDEF"));
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
    //коли слово стоїть на початку або наприкінці).
    private static void Split(String str)
    {
        var words = str.split("[ ]");

        for (String word : words) 
        {
            System.out.println(word);
        }
    }

    //5. Реалізуйте спосіб, який приймає на вхід два рядки (А і Б)
    //і повертає рядок, який складається по черзі з i-их знаків кожного з рядків.
    //Наприклад, спочатку перший символ першого рядка, потім перший символ другого рядка,
    //потім другий символ першого рядка, потім другий символ другого рядка і т.д.
    //Якщо символи в одному з рядків закінчаться, символи іншого рядка, що залишилися, дописуються в кінець.
    private static String CreateSequence(String source1, String source2)
    {
        var capacity = source1.length() + source2.length(); 
        var builder = new StringBuilder(capacity);

        var maxLen = Math.max(source1.length(), source2.length());

        for (var i = 0; i < maxLen; i++)
        {
            TryAddSymbol(i, source1, builder);
            TryAddSymbol(i, source2, builder);
        }

        return builder.toString();
    }

    private static void TryAddSymbol(int index, String source, StringBuilder builder)
    {
        if (index >= source.length()) 
        {
            return;
        }

        var symbol = source.charAt(index);
        builder.append(symbol);    
    }
}