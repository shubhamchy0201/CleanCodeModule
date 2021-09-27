public class Rectangle implements PrintArea{
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
    //This method violating single responsibility principle and also Dependency Inversion
    public void getDetailsOfRectangle(Rectangle rect) {
        System.out.println("length:"+rect.length);
        System.out.println("width:"+rect.breadth);
        System.out.println("Area of Rectangle:"+rect.length*rect.breadth);
    }

    //Violating Interface segregation
    @Override
    public void area() {
        System.out.println("Calculating area of rectangle");
    }

    @Override
    public void volume() {
        System.out.println("No need of Volume method in rectangle");
    }
}
