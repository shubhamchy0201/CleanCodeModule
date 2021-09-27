public class Cuboid implements Shape3D{
    private int length;
    private int breadth;
    private int height;

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
//Follow Interface Segregation
    @Override
    public void calculateVolume() {
        System.out.println("Volume of cuboid is: "+(length*breadth*height));
    }
}
