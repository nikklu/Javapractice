//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee nik=new Employee("Nikhil","23/10/2003","20/09/2025");
        System.out.println(nik);
        System.out.println("Age :"+nik.getAge());
        System.out.println("Pay:"+nik.collectPay());
        SalriedEmployee nithin=new SalriedEmployee("Nithin","20/09/2004","22/09/2025",35000);
        System.out.println("Anual salary:"+nithin.collectPay());
        nithin.Retired();
        System.out.println("Anual salary:"+nithin.collectPay());
        HourlyPay marry=new HourlyPay("Mary","5/05/1970","03/03/2021",15);
        System.out.println("Advance:"+marry.collectPay());
        System.out.println("Salary :"+marry.getDoublePay());
    }
}