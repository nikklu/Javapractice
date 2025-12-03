public class PersonalComputer extends Product{

    private Computer computer;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacture, Computer computer, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacture);
        this.computer = computer;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    private  void  drawLogo()
    {
        monitor.drawPixel(1200,50,"Yellow");
    }
    public void powerUp()
    {
        computer.PushPowerButton();
        drawLogo();
    }
//    public Computer getComputer() {
//        return computer;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }

}
