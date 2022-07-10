package classroom.TaskBook;

import java.util.Scanner;

public class Triangle {
        public static void main (String [] args) {
        int edge1, edge2, edge3;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter three numbers for triangle sides:");
        edge1 = scanner.nextInt();
        edge2 = scanner.nextInt();
        edge3 = scanner.nextInt();
        int semiperimeter = (edge1+edge2+edge3)/2;
        double area = Math.sqrt(semiperimeter*(semiperimeter-edge1)*(semiperimeter-edge2)*(semiperimeter-edge3));
System.out.println("Triangle area is: " + area);
    if (edge1 == edge2 && edge2 == edge3)
       System.out.println("Equilateral Triangle");

    else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3)
        System.out.println("Isosceles Triangle");

    else
        System.out.println("Multifaceted Triangle");
    }
}
