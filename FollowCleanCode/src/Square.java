public class Square implements Shape2D{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Square is: "+side*side);
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Circumference of Square is: "+(4*side*side));
    }
}
