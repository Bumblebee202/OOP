package laboratory5;

public class Main 
{
    public static void main(String[] args) 
    {
        var student1 = (Person) new Student("Alex", "Popov", 20, "AD-11111", 1);
        var student2 = (Person) new Student("Vlad", "Kim", 19, "AD-11111", 2);

        var lecturer1 = (Person) new Lecturer("Elena", "Serbova", 38, "126", 3000d);
        var lecturer2 = (Person) new Lecturer("Dmitry", "Barabash", 45, "126", 5000d);

        var people = new Person[5];

        people[0] = new Person("Someone", "Unknown", 21);
        people[1] = student1;
        people[2] = student2;
        people[3] = lecturer1;
        people[4] = lecturer2;

        for (var person : people) 
        {
            System.out.println(person.PrintInfo());
        }
    }
}