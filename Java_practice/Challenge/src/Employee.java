public class Employee extends Worker{
    private long EmployeId;
    private String hireDate;
    private static int employeeid=1;
    public Employee(String name,String birthDate,String hireDate)
    {
        super(name,birthDate);
        this.EmployeId=Employee.employeeid++;
        this.hireDate=hireDate;
    }
    @Override
    public String toString()
    {
        return "Emplyee Id:"+EmployeId+" HireDate:"+hireDate+" "+super.toString();
    }
}
