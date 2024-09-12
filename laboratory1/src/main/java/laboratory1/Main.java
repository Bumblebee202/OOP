package laboratory1;

public class Main 
{
    public static void main(String[] args) 
    {
        //Laboratory1
        var numbers = new int[] { 10, 10, 30, 40, 50, 50, 60, 80, 90 };
        // var numbers = new int[] { 10, 30, 20, 30 };
        System.out.println(IsSequence(numbers));
        System.out.println("\n");
        
        //Laboratory 2
        FizzBuzz();
        System.out.println("\n");
        
        //Laboratory 3
        numbers = new int[] { 1, 1, 1, 2, 1 };
        // numbers = new int[] { 2, 1, 1, 2, 1 };
        // numbers = new int[] { 10, 10 };
        System.out.println(CanSplit(numbers));
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

    public static void FizzBuzz()
    {
        for (var i = 1; i <= 100; i++)
        {
            var isFizz = i % 3 == 0;
            var isBuzz = i % 5 == 0;

            if (isFizz && isBuzz) 
            {
                System.out.println("FizzBuzz");
            }
            else if (isFizz) 
            {
                System.out.println("Fizz");
            }
            else if (isBuzz) 
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    
    public static boolean CanSplit(int[] numbers)
    {
        if (numbers.length < 2) 
        {
            return false;
        }

        var totalSum = Sum(numbers, 0, numbers.length);
        if (totalSum % 2 != 0) 
        {
            return false;
        }

        var firstArrayLen = numbers.length / 2;
        var secondArrayLen = numbers.length - firstArrayLen;

        var sumOfFirstPart = Sum(numbers, 0, firstArrayLen);
        var sumOfSecondPart = Sum(numbers, firstArrayLen, secondArrayLen);

        if (sumOfFirstPart == sumOfSecondPart) 
        {
            return true;
        }

        sumOfFirstPart = Sum(numbers, 0, secondArrayLen);
        sumOfSecondPart = Sum(numbers, secondArrayLen, firstArrayLen);

        return sumOfFirstPart == sumOfSecondPart;
    }

    private static int Sum(int[] numbers, int startIndex, int count)
    {
        var len = startIndex + count;
        if (len > numbers.length) 
        {
            throw new IllegalArgumentException();
        }

        var sum = 0;
        for (var i = startIndex; i < len; i++)
        {
            sum += numbers[i];
        }

        return sum;
    }
}