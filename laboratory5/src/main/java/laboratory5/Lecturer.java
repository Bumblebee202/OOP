package laboratory5;

public final class Lecturer extends Person
{
    private String _department;
    private double _salary;

    public Lecturer(String firstName,
                    String lastName,
                    int age,
                    String department,
                    double salary)
    {
        super(firstName, lastName, age);

        SetDepartment(department);
        SetSalary(salary);
    }

    @Override
    public String PrintInfo()
    {
        return String.format("Lecturer of department %1$s %2$s %3$s, age: %4$s. Salary: %5$s",
                             _department,
                             _lastName,
                             _firstName,
                             _age,
                             _salary);
    }

    public void SetDepartment(String value)
    {
        if (IsStringNullOrEmty(value)) 
        {
            throw new IllegalArgumentException("Department can't be null or empty");
        }

        _department = value;
    }

    public void SetSalary(double value)
    {
        if (value < 1) 
        {
            throw new IllegalArgumentException("Salary can't equals or less than 0");
        }

        _salary = value;
    }

    public String GetDepartment()
    {
        return _department;
    }

    public double GetSalary()
    {
        return _salary;
    }
}
