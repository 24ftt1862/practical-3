public class ComputeArea{
    public static void main(String[] args) {
        double base = 4.0;
        double height = 6.0;
        final double pi = 3.14;
        double radius = 8.0;

        Double AreaSquare = base * base;
        Double AreaTriangle = 0.5 * base * height;
        Double AreaCircle = pi * radius * radius; 

        System.out.printf("The area of square is "+AreaSquare + "\nThe area of triangle is "+AreaTriangle + "\nThe area of circle is "+AreaCircle );
  
    }
}