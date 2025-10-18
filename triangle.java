import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
