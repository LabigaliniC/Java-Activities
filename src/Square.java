public class Square extends Rectangle {
    public double side;

    public Square() {
        double side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length) {

        super(color, filled, width, length);

        setLength(getLength());
        setWidth(getWidth());
    }

    public double earnings() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
