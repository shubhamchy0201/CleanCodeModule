public class AreaCalculator {
    //Violating open-Closed principle
    public double calculateRectangleArea(Rectangle rectangle)
    {
        return rectangle.getBreadth() *rectangle.getLength();
    }
    public double calculateSquareArea(Square square)
    {
        return square.getLength()*square.getBreadth();
    }
}
