public class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0) {
            this.length = length;
        }
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if(breadth>0) {
            this.breadth = breadth;
        }
    }
    public void getArea()
    {
        System.out.println("Area of rectanlge:"+(length*breadth));
    }
}
