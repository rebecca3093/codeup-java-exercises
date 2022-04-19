package shapes;

public class Square extends Quadrilateral {

    public Square (int side){
        super(side, side);

    }

    /*@Override
    public int getPerimeter(){
        return this.length * 4;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(this.length,2);
    }*/

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(this.length,2);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }
}