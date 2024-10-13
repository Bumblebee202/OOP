package laboratory5;

public final class Student extends Person
{
    private String _group;
    private int _studentIdNumber;

    public Student(String firstName, 
                   String lastName,
                   int age,
                   String group,
                   int number) 
    {
        super(firstName, lastName, age);

        SetGroup(group);
        SetStudentIdNumber(number);
    }

    @Override
    public String PrintInfo()
    {
        return String.format("Student of group %1$s %2$s %3$s, age: %4$s. Student Id number: %5$s", 
                             _group,
                             _lastName,
                             _firstName,
                             _age,
                             _studentIdNumber);
    }

    public void SetGroup(String value)
    {
        if (IsStringNullOrEmty(value)) 
        {
            throw new IllegalArgumentException("Group can't be null or empty");
        }

        _group = value;
    }

    public void SetStudentIdNumber(int value)
    {
        if (value < 1) 
        {
            throw new IllegalArgumentException("Number can't equals or less than 0");
        }

        _studentIdNumber = value;
    }

    public String GetGroup()
    {
        return _group;
    }

    public int GetStudentIdNumber()
    {
        return _studentIdNumber;
    }
}
