package module1;

import java.io.Closeable;
import java.util.Scanner;

public abstract class BaseTask implements Closeable
{
    protected Scanner _scanner;

    public BaseTask()
    {
        _scanner = new Scanner(System.in);
    }

    public void close()
    {
        _scanner.close();
    }

    protected void ShowTaskNumber(int number)
    {
        var str = String.format("Task number: %s", number);
        System.out.println(str);
    }

    protected void ShowSeparator()
    {
        System.out.println("\n\n");
    }

    public abstract void Action();
}
