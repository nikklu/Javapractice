public class SalriedEmployee extends Employee{
   double anualSalary;



    boolean isRetired;

    public SalriedEmployee(String name, String birthDate, String hireDate, double anualSalary) {
        super(name, birthDate, hireDate);
        this.anualSalary = anualSalary;
    }

    @Override
    public double collectPay() {
        double a=anualSalary/26;
        double b=(isRetired)?a*0.9:a;
        return (int)b;
    }
    public void Retired()
    {
        terminate("12/12/2022");
        isRetired=true;
    }

}
