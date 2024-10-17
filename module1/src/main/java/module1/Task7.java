package module1;


//7. Написати програму, яка пропонує користувачеві ввести номер дня тижня, 
//та у відповідь показує назву цього дня (наприклад, 6 – це субота). Вирішити з використанням if та switch. 
public class Task7 extends BaseTask
{

    @Override
    public void Action() 
    {
        ShowTaskNumber(7);

        var dayOfweekStr = "";
        do
        {
            System.out.println("Enter the day of the week number (from 1 to 7)");
            var userInput = _scanner.nextInt();
            if (userInput < 1 || userInput > 7) 
            {
                continue;
            }

            var dayOfWeek = DayOfWeek.values()[userInput - 1];

            switch (dayOfWeek) {
                case Monday: 
                    dayOfweekStr = "Monday";
                    break;
                case Tuesday:
                    dayOfweekStr = "Tuesday";
                    break;
                case Wednesday:
                    dayOfweekStr = "Wednesday";
                    break;
                case Thursday:
                    dayOfweekStr = "Thursday";
                    break;
                case Friday:
                    dayOfweekStr = "Friday";
                    break;
                case Saturday:
                    dayOfweekStr = "Saturday";
                    break;
                case Sunday:
                    dayOfweekStr = "Sunday";
                    break;
            
                default: continue;
            }

            System.out.println(dayOfweekStr);
            break;
        }
        while(true);

        ShowSeparator();
    }

    private enum DayOfWeek
    {
        Monday(1),
        Tuesday(2),
        Wednesday(3),
        Thursday(4),
        Friday(5),
        Saturday(6),
        Sunday(7);

        private final int _value;

        private DayOfWeek(int value) 
        {
            _value = value;
        }

        public int getValue() 
        {
            return _value;
        }
    }
}
