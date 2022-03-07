import java.util.*;
public class CircleWithException {
    private double radius;
    final static double pi=3.14159265359;

    public CircleWithException(){
    }

    //getters
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return pi*(this.radius*this.radius);
    }
    public double getDiameter(){
        return 2*this.radius;
    }

    //setters
    public void setRadius(double radius){
        this.radius=radius;
    }

    public static void main(String[] args) {
        CircleWithException c = new CircleWithException();
        Scanner sc = new Scanner(System.in);
        double inputRadius=0;
        double area=0;
        double diameter=0;
        String again="y";

        while(again.equalsIgnoreCase("y")) {
            try {
                System.out.print("Input radius in double: ");
                inputRadius = sc.nextDouble();
                again="f";
                if (inputRadius < 0) {
                    throw new IllegalArgumentException("Radius cannot be Negative");
                }
            } catch (IllegalArgumentException i) {
                i.printStackTrace();
                System.out.println("Input again? y/n");
                again=sc.next();
            }
        }

        c.setRadius(inputRadius);
        try{
            area=c.getArea();
            if(area>1000){
                throw new Exception("Area cannot be larger than 1000");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (area<1000) {
                System.out.printf("Area is: %.2f\n", area);
                System.out.println("Diameter is: " + c.getDiameter());
            }
        }

    }

}
