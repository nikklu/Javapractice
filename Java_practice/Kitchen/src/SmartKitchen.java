public class SmartKitchen {
    private CoffeMaker breakMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen()
    {
        this.breakMaster=new CoffeMaker();
        this.iceBox=new Refrigerator();
        this.dishWasher=new DishWasher();
    }

    public CoffeMaker getBreakMaster() {
        return breakMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
    public void SetKitchen(boolean coffeFlag,boolean Iceflag,boolean Dishflag)

    {
        breakMaster.setHasWork(coffeFlag);
        iceBox.setHasWork(Iceflag);
        dishWasher.setHasWork(Dishflag);
    }

    public void doKitchen()
    {
        breakMaster.brewCoffe();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}
class CoffeMaker
{
   private boolean hasWork;
   public void setHasWork(boolean hasWork)
   {
       this.hasWork=hasWork;
   }
   public void brewCoffe()
   {
       if(hasWork)
       {
           System.out.println("Brewing Coffe");
           hasWork=false;
       }
   }
}
class Refrigerator
{
    private boolean hasWork;
    public void setHasWork(boolean hasWork)
    {
        this.hasWork=hasWork;
    }
    public void orderFood()
    {
        if(hasWork)
        {
            System.out.println("Order food");
            hasWork=false;
        }
    }
}
class DishWasher
{
    private boolean hasWork;
    public void setHasWork(boolean hasWork)
    {
        this.hasWork=hasWork;
    }
    public void doDishes()
    {
        if(hasWork)
        {
            System.out.println("Washing Dishes");
            hasWork=false;
        }
    }
}
