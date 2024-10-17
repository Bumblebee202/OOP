package module1;

public class Main 
{
    public static void main(String[] args) 
    {
        var tasks = new BaseTask[]
        {
            new Task1(),
            new Task2(),
            new Task3(),
            new Task4(),
            new Task5(),
            new Task6(),
            new Task7(),
            new Task8(),
            new Task9(),
            new Task10(),
            new Task15()
        };

        //some tasks were skipped because I didn't have a time for them
        //or I didn't want to do them

        for (var task : tasks) 
        {
            task.Action();
        }
    }
}