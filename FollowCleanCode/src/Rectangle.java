public class Rectangle  implements Shape2D{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is: "+length*breadth);
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Circumference of rectangle is :"+(2*length*breadth));
    }
}
