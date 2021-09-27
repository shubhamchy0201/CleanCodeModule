public class Square extends Rectangle{
    //Violating Liskov-substitution principle
    @Override
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }
    public void getDetailsOfSquare(Square sqrt) {
        System.out.println("length:"+sqrt.getLength());
        System.out.println("width:"+sqrt.getBreadth());
        System.out.println("Area of Square:"+sqrt.getBreadth()*sqrt.getLength());
    }
}
