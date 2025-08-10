package Udemy.Code.MedidasTriangulo;

public class ClasseTriangulo {
    private double sideA, sideB, sideC;

    public ClasseTriangulo(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    } 

    public double calculateAreaOfTriangle(){
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        double areaTriangle = Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        return areaTriangle;

    }

}
