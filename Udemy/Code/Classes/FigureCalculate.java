package Udemy.Code.Classes;

public class FigureCalculate {
    private double width;
    private double height;

    public FigureCalculate(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.sqrt(this.width * this.width + this.height * this.height);
    }

    @Override
    public String toString() {
        return "FigureCalculate: " +
                "width: " + this.width +
                ", height: " + this.height +
                "\nAREA: " + area() +
                "\nPERIMETER: " + perimeter() +
                "\nDIAGONAL: " + diagonal();
}
}