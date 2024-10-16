package module1;

//2. З клавіатури вводиться ціле число будь-якої розрядності. 
//Потрібно перевернути це число, тобто. цифри повинні розташовуватися у зворотному порядку 
//(наприклад, вводимо число 1234 – у результаті буде 4321). 
public class Task2 extends BaseTask
{

    @Override
    public void Action() 
    {
        ShowTaskNumber(2);

        System.out.println("Enter a number: ");
        var number = Integer.valueOf(_scanner.nextInt());

        var builder = new StringBuilder(number.toString());
        var reversedNumber = builder.reverse()
                                    .toString();

        System.out.println(String.format("Reversed number: %s", reversedNumber));

        ShowSeparator();
    }

}
