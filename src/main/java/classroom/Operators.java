package classroom;

public class Operators {
    public static void main(String[] args) {
        //Equal to ==
        int a = 10;
        int b = 5;
        System.out.println(a==b); // false

        // Not equal to
        int c = 5;
        int d = 4;
        System.out.println(c!=d); // true

        a = 10;
        double e = 10.00;
        System.out.println(a == e);

        // Less than
        a = 30;
        b = 20;
        System.out.println(a < b); //false

        // Grather than
        c = 40;
        d = 50;
        System.out.println(c > d); // false

        boolean result = 40 < 20;
        System.out.println(result); //false

        // Less then or equal to
        a = 100;
        b = 100;
        System.out.println(a <= b); //true

        // Greater or equal to
        a = 20;
        b = 100;
        System.out.println(b >= a); //false

        // String comparison
        String name = "Ilze";
        String name2 = "Ilze";
        System.out.println(name == name2);  //true
        name.equals(name.equals(name2));

        // System.out.println(name == new String(original:"Ilze")); //false

        // Logical operators

        int x = 10;
        result = x < 5 && x < 10;  // && - and
        // 10 < 5 (false)
        // 10 < 10 (false)
        System.out.println(result); // false

        result = 3 < 5 && 4 < 5;
        System.out.println(result); // true

        result = 3 < 5 || 4 < 5; // || - or
        System.out.println(result); // true

        a = 10;
        b = 20;
        result = !(a > b); // true  ! - no


    }
}
