public class ViolateSolidPrinciple {
    public static void main(String[] args) {
        //Single Responsibility Principle
        System.out.println("Violating Single Responsibility principle: ");
        Rectangle rectangle1=new Rectangle();
        rectangle1.setBreadth(15);
        rectangle1.setLength(10);
        rectangle1.getDetailsOfRectangle(rectangle1);
        //Open-Closed principle
        System.out.println("Violating Open-Closed principle: ");
        AreaCalculator areaCalculator=new AreaCalculator();
        Rectangle rectangle2=new Rectangle();
        rectangle2.setBreadth(5);
        rectangle2.setLength(10);
        System.out.println("Area of rectangle: "+areaCalculator.calculateRectangleArea(rectangle2));
        Square square1=new Square();
        square1.setBreadth(10);
        square1.setLength(10);
        System.out.println("Area of Square: "+areaCalculator.calculateSquareArea(square1));
        //Violating Liskov Substitution principle
        System.out.println("Violating Liskov Substitution principle: ");
        Rectangle rectangle3=new Rectangle();
        rectangle3.setBreadth(5);
        rectangle3.setLength(10);
        rectangle3.getDetailsOfRectangle(rectangle3);
        Square square2=new Square();
        square2.setBreadth(5);
        square2.setLength(10);
       square2.getDetailsOfSquare(square2);
       //Violating Interface segregation principle
        System.out.println("Violating Interface Segregation principle: ");
        Rectangle rectangle4=new Rectangle();
        rectangle4.area();
        rectangle4.volume();

        //Violating Dependency Inversion principle
        System.out.println("Violating Dependency Inversion principle: ");

    }
}
