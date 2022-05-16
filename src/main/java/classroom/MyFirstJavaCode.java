package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
      // one line comment

        /*
        My team :)
        Write any comment.
        Multi line comment.
         */

        // byte datatype
        byte flourCount = 7;
        System.out.println("My house has " + flourCount + " flours");
        System.out.printf("My house has %d flours\n", flourCount);
        // %s - test/string
        // %d - numbers
        // %b - boolean

        short salaryInEur = 1000;
                System.out.println(salaryInEur);
                System.out.println(1000);

                System.out.printf("Average salary for Junior QA Engineer is: %d\n", salaryInEur);

                int chinaPopulation = 17498860;
                long currentWorldPopulation = 897468587;
                System.out.printf("Current world population: %d. In meanwhile china population: %d", currentWorldPopulation, chinaPopulation);

                //Floating numbers
        float myCurrentWeight = 53.5f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.985757;
        System.out.println(gasPriceInEur);

        //Primitive text (char)
        char firstLetterOfMyName = 'I';

        //Non-primitive String
        String myName = "Ilze";
        System.out.println(myName);

        String mySentence = "Hello, my name is Ilze. I am 28 years old.";
        String mySecondSentence = "I live in Riga.";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + "" + mySecondSentence);
        System.out.printf("%s %s\n", mySentence, mySecondSentence);

        //boolean
        // is / has
        // isSummer , hasItems
        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if(isSummer) {
            System.out.println("Yes, it is summer.");
        } else {
            System.out.println("No, it is not summer");
        }

        //Arithmetic operators + - / *
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b+  15;
        System.out.println(x);

        System.out.println(7 + 7); // 14
        System.out.println("7" + 7); // 77
        System.out.println("7" + "7"); // 77

        boolean isAGreaterThanB = a > b; // 10 > 20
        boolean isASmallerThanB = a < b; // 10 > 20

        boolean isTrue = a !=b;
        System.out.println(isTrue);

    }
}
