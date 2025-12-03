//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computer Case=new Computer("22008","Dell","240");
        Monitor monitor=new Monitor("27 inches","Aceer",27,"2540 X 1440");
        MotherBoard motherBoard=new MotherBoard("BJ-200","Asus",4,6,"v2.44");
        PersonalComputer pc=new PersonalComputer("2208","Dell",Case,monitor,motherBoard);
//        pc.getMonitor().drawPixel(10,10,"red");
//        pc.getMotherBoard().loadProgram("Windows Os");
//        pc.getComputer().PushPowerButton();
        pc.powerUp();
    }
}