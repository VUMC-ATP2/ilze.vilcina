package homework.classHomework;

public class Main {
    public static void main(String[] args) {
   //Triangle one
        Triangle triangleOne = new Triangle();
        triangleOne.newTriangle();
        triangleOne.edge1 = 9;
        triangleOne.edge2 = 9;
        triangleOne.edge3 = 9;
        triangleOne.triangleArea();
        triangleOne.trangleShape();
// Triangle two
        Triangle triangleTwo = new Triangle();
        triangleTwo.newTriangle();
        triangleTwo.edge1 = 8;
        triangleTwo.edge2 = 8;
        triangleTwo.edge3 = 9;
        triangleTwo.triangleArea();
        triangleTwo.trangleShape();

    }
}
