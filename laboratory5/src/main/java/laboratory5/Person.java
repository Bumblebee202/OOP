package laboratory5;

public class Person 
{
    protected String _firstName;
    protected String _lastName;
    protected int _age;

    public Person(String firstName, String lastName, int age)
    {
        SetFirstName(firstName);
        SetLastName(lastName);
        SetAge(age);
    }

    public String PrintInfo()
    {
        return String.format("Person %1$s %2$s, age: %3$s", _lastName, _firstName, _age);
    }

    public void SetFirstName(String value)
    {
        if (IsStringNullOrEmty(value)) 
        {
            throw new IllegalArgumentException("FirstName can't be null or empty");
        }

        _firstName = value;
    }

    public void SetLastName(String value)
    {
        if (IsStringNullOrEmty(value)) 
        {
            throw new IllegalArgumentException("LastName can't be null or empty");
        }

        _lastName = value;
    }

    public void SetAge(int age)
    {
        if (age < 0 || age > 100) 
        {
            throw new IllegalArgumentException("Age has incorrect value");
        }

        _age = age;
    }

    public String GetFirstName()
    {
        return _firstName;
    }

    public String GetLastName()
    {
        return _lastName;
    }

    public int GetAge()
    {
        return _age;
    }

    protected Boolean IsStringNullOrEmty(String str)
    {
        return str == null || str.trim().isEmpty();
    }
}
