package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        // 1.uzdevums
        int x = 6;
        System.out.println(x>0); // true
        System.out.println(x<0); // false
        System.out.println(x>5); // true
        System.out.println(x<=10); // true
        System.out.println(x>=5); //true
        System.out.println(x<10); // true
        System.out.println(x==0); // false
        System.out.println(x==10); // false
        System.out.println((x*x)>10); // true

        // 2.uzdevums

        System.out.println("Please write a month number (1-12)");
        Scanner scanner = new Scanner(System.in);
        int inputResult = scanner.nextInt();
        switch (inputResult) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not selected month");
        }

        // 3.uzdevums

        double y1 = -5, y2 = 5, y3 = 10;
        if(y1>=y2) {
            if (y1 >= y3)
                System.out.println(y1 + " is the largest number.");
            else System.out.println(y3 + " is the largest number.");
        } else {
            if (y2 >= y3)
                System.out.println(y2 + " is the largest number.");
            else
                System.out.println(y3 + " is the largest number.");
        }

        // 4.uzdevums
        String color1 = "Green";
        String color2 = "Yellow";
        String color3 = "Red";
            System.out.print(color1.equals("Green"));
            System.out.print("You can cross the street!");
            System.out.print(color1.equals("Red"));
            System.out.print("Stop! Do not cross the street!");
            System.out.print(color1.equals("Yellow"));
            System.out.print("Get ready to3 cross the street!");
            System.out.print(color1.equals("Yellow"));
            System.out.print(color1.equals("Red"));
            System.out.print("Look to the right and to the left, if there is no car you can cross the street!");


    }
}
