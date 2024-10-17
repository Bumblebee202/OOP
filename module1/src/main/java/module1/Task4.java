package module1;

import java.util.Random;

//4. Написати гру «Вгадай число». Користувач подумки загадує 
//число від 0 до 1000 комп'ютер відгадує його за мінімальну кількість спроб. 
public class Task4 extends BaseTask
{
    private char _yes = 'y';
    private char _no = 'n';
    private int _bottom = 0;
    private int _top = 1000;

    @Override
    public void Action() 
    {
        ShowTaskNumber(4);
        
        var gues = 0;

        var count = 1;
        var tries = 5;

        var hasInclusive = true;
        do
        {
            gues = GenerateRandomValue(_bottom, _top, hasInclusive);

            if (IsWin(gues, count)) 
            {
                ShowSeparator();
                return;
            }

            //I could use binary search instead of generate new random number..
            //but ye.. with rnadom it's a bit funnier
            if (IsLess(gues)) 
            {
                _top = gues;
                hasInclusive = false;
            }
            else
            {
                _bottom = gues;
                hasInclusive = true;
            }

            count++;
            tries--;

            if (tries == 0) 
            {
                System.out.println("I lose");
                ShowSeparator();
                return;
            }
        }
        while(true);
    }

    private boolean IsWin(int gues, int tries)
    {
        System.out.println(String.format("Your number is: %s, yes?", gues));
        var answer = GetUserAnswer();
        if (answer == _yes) 
        {
            var congrats = String.format("Wow, I win. I succeeded on the %s try", tries);
            System.out.println(congrats);

            return true;
        }

        return false;
    }

    private boolean IsLess(int gues)
    {
        System.out.println(String.format("Is your number less than %s, yes?", gues));
        return GetUserAnswer() == _yes;
    }

    private char GetUserAnswer()
    {
        var answer = "";
        do
        {
            System.out.println("print 'y' or 'n'");
            answer = _scanner.nextLine();

            var symbol = answer.charAt(0);
            if (symbol == _yes || symbol == _no) 
            {
                return symbol;
            }
        }
        while(true);
    }
}
