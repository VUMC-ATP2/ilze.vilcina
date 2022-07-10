package classroom;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Before check");

        // Will exicute 10 line if contitions is true
        if(20>18) {
            System.out.println("Yes, 20 > 18");
        }
        System.out.println("After check");

        //
        int age = 18;

        if(age >= 18) {
            System.out.println("You can vote!");
        }
        System.out.println("You can go home!");

        int currenHours = 19;
        if (currenHours < 18) {  //false
            System.out.println("Good Day");  //Labdien
        } else {
            System.out.println("Good evening");  //Labvakar

        }

        // il-else
        int i = 20;
        if(i < 15) {
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greater than 15");
        }
        System.out.println("Outside if-else block");

        String vumc = "LU";
        if (vumc == "LU") {
            System.out.println("VUMC is the same as LU");
        } else {
            System.out.println("VUMC is not the same as LU");
        }

        // int - primitive type
        // Integer - non-primitive
        // char - Char
        // double - Dougle
        // float - Float

        // if-esle-if

        int number = 2;
        if(number > 0) {
            System.out.println("Number is greather than 0");
        } else if (number == 0) {
            System.out.println("Number is equal to 0");
        } else {
            System.out.println("Number is less then 2 and not equal to 0");
        }

        String animal = "Cat";

        switch (animal) {
            case "Dog":
                System.out.println("You have a dog!");
                break;
            case "Cat":
                System.out.println("You have a cat!");
                break;
            default:
                System.out.println("I don't know what animal you have" + animal);  // if animal you not is not included.
        }

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurdsay");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not incorrect day of the week");


        }
        // var - data type
        String month = "June";
        var result  = switch (month) {
            case "December", "January", "February" -> "winter";
            case "June", "July", "August" -> "summer";
            default -> "Don't know";
                    };
        System.out.printf("%s this is %s", month, result);
    }
}
