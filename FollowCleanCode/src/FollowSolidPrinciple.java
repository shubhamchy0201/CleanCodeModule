
public class FollowSolidPrinciple {
    public static void main(String[] args) {
        //Single Responsibility Principle
        System.out.println("Follow Single Responsibility principle: ");
        Rectangle rectangle1=new Rectangle();
        rectangle1.setLength(15);
        rectangle1.setBreadth(10);
        PrintDetails printDetails=new PrintDetails();
        printDetails.printDetails(rectangle1);
        //Open-Closed principle
        System.out.println("Follow Open-Closed principle: ");
        Square square1=new Square();
        square1.setSide(20);
        printDetails.printDetails(square1);
        // Liskov Substitution principle
        System.out.println("Follow Liskov Substitution principle: ");


        //Interface segregation principle
        System.out.println("Follow Interface Segregation principle: ");
        Cuboid cuboid=new Cuboid();
        cuboid.setLength(5);
        cuboid.setBreadth(6);
        cuboid.setHeight(7);
        cuboid.calculateVolume();

        //Dependency Inversion principle
        System.out.println("Follow Dependency Inversion principle: ");
        PrintDetails printDetails1=new PrintDetails();
        Rectangle rectangle2=new Rectangle();
        rectangle2.setLength(5);
        rectangle2.setBreadth(6);
        printDetails1.printDetails(rectangle2);
        Square square2=new Square();
        square2.setSide(30);
        printDetails1.printDetails(square2);
    }
}
