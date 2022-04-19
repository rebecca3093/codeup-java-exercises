package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

   /* protected int length;
    protected int width;

    public Rectangle(int lengthToSet, int widthToSet) {
        this.length = lengthToSet;
        this.width = widthToSet;

    }

    public int getPerimeter (){
        return (this.length * 2) + (this.width * 2);

    }

    public int getArea(){
        return this.length * this.width;

    }*/
   public Rectangle(double length, double width) {
       super(length, width);
   }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }



}
