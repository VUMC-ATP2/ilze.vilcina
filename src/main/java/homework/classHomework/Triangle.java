package homework.classHomework;

public class Triangle {

    int edge1;
    int edge2;
    int edge3;
    double area;

    public void newTriangle() {
        System.out.println("We are building new Triangle!");
    }

    public void triangleArea() {
        double sp;
        sp = (edge1+edge2+edge3)/2;
        area = Math.sqrt(sp*(sp-edge1)*(sp-edge2)*(sp-edge3));
        System.out.println("Triangle area is: " + area);
    }
    public void trangleShape() {
        if (edge1 == edge2 && edge2 == edge3)
            System.out.println("Equilateral Triangle");

        else if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3)
            System.out.println("Isosceles Triangle");

        else
            System.out.println("Multifaceted Triangle");
    }

}









