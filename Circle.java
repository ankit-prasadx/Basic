import java.util.Scanner;

class CircleDemo{
    private double Radius;
    private double Area;
    private double PI = 3.14159265359;

    CircleDemo(){
        this.Radius = 0.0;
    }

    CircleDemo(double radius){
        this.Radius = radius;
    }

    void SetData(double radius){
        this.Radius = radius;
    }

    void CalculateArea(){
        Area = Radius * Radius * PI;

        System.out.println("Area of Circle with Radius : "+this.Radius+" is = "+this.Area);
    }

}

class Circle{
    public static void main(String[] args) {
        double radius;
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        radius = sObj.nextDouble();

        CircleDemo c1 = new CircleDemo();
        c1.SetData(radius);
        c1.CalculateArea();

    }
}