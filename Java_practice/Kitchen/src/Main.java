
public class Main {
    public static void main(String[] args) {
         SmartKitchen kitchen=new SmartKitchen();
//        kitchen.getDishWasher().setHasWork(true);
//        kitchen.getIceBox().setHasWork(true);
//        kitchen.getBreakMaster().setHasWork(true);
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBreakMaster().brewCoffe();
        kitchen.SetKitchen(true,false,true);
        kitchen.doKitchen();
    }
}