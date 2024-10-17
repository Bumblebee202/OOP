package module1;

//15. Для введеного користувачем з клавіатури натурального 
//числа порахуйте суму всіх його цифр (заздалегідь не відомо скільки цифр буде в числі). 
public class Task15 extends BaseTask
{
    @Override
    public void Action() 
    {
        ShowTaskNumber(1);
        System.out.println("Enter a number: ");
        var number = _scanner.nextInt();

        var sum = SumOfDigits(number);

        System.out.println(String.format("Sum of digits: %s", sum));

        ShowSeparator();
    }

}
