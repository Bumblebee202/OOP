package laboratory3;

public class Main 
{
    public static void main(String[] args) 
    {
        var str = "tired";
        // str = "Hello world";
        System.out.println(EndsWithEd(str));

    }

    //1. Реалізуйте метод, який приймає на вхід рядок та повертає true,
    //якщо рядок закінчується на «ed» і false у противному випадку;
    private static boolean EndsWithEd(String str)
    {
        return str.endsWith("ed");
    }
}