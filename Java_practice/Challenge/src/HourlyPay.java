public class HourlyPay extends Employee{
private double HourlyRate;

    public HourlyPay(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate, hireDate);
        HourlyRate = hourlyRate;
    }

    @Override
    public double collectPay() {
        return HourlyRate*40;
    }
    public double getDoublePay()
    {
        return collectPay()*2;
    }
}
