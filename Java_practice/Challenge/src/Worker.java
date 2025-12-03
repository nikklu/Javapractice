public class Worker {
    private String name;
    private  String birthdate;
    protected String EndDate;

    public Worker(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    public Worker()
    {

    }
    public int getAge()
    {
        int currentYear=2025;
        int Dob=Integer.parseInt(birthdate.substring(6));
        return currentYear-Dob;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }

    public void terminate(String EndDate)
    {
        this.EndDate=EndDate;
    }
  public double collectPay()
  {
      return 0;
  }
}
