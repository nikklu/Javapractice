public class Product {
    private String model;
    private String manufacture;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacture) {
        this.model = model;
        this.manufacture = manufacture;
    }
}

    class Monitor extends Product
    {

        private int size;
        private String resolution;

        public Monitor(String model, String manufacture, int size, String resolution) {
            super(model, manufacture);
            this.size = size;
            this.resolution = resolution;
        }

        public Monitor(String model, String manufacture) {
            super(model, manufacture);
        }
        public void drawPixel(int x,int y,String color)
        {
            System.out.println(String.format("Drawing pixel at %d,%d in color %s",x,y,color));
        }
    }
    class MotherBoard extends Product
    {
        public MotherBoard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
            super(model, manufacture);
            this.ramSlots = ramSlots;
            this.cardSlots = cardSlots;
            this.bios = bios;
        }

        private int ramSlots;
        private int cardSlots;
        private  String bios;
        public MotherBoard(String model, String manufacture) {
            super(model, manufacture);
        }


        public void loadProgram(String str)
        {
            System.out.println("Program "+str+" is now loading");
        }
    }
    class Computer extends Product
    {
        private String powerSupply;

        public Computer(String model, String manufacture, String powerSupply) {
            super(model, manufacture);
            this.powerSupply = powerSupply;
        }

        public Computer(String model, String manufacture) {
            super(model, manufacture);
        }
        public void PushPowerButton()
        {
            System.out.println("Power button pushed");
        }




}
