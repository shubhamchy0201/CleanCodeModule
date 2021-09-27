public class PrintDetails implements Shape{

    public void printDetails(Shape2D shape2d)
    {
        shape2d.calculateArea();
        shape2d.calculateCircumference();
    }
    public void printDetails(Shape3D shape3d)
    {
        shape3d.calculateVolume();
    }
}
