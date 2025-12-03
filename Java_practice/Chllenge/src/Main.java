import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
//      Car a=new Car("Fearai 2022 blue 296 GTS");
//      RunRace(a);
      Car car=new GasPoweredCar("Fearai 2022 blue 296 GTS",15.4,6);
      RunRace(car);
//      Car t=new ElectricCar("2022  Red Tesla Model 3",568,75);
//      RunRace(t);
//      Car h=new HybridCar("2022 Black Ferrari SF90",26,8,8);
//      RunRace(h);
    }
    public static void RunRace(Car a)
    {
        a.startEngine();
        a.drive();
    }

}