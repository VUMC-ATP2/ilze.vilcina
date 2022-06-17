package homeworkTwo;

public class Methods {
    public static void main(String[] args) {
        printBusinessCard("Lauris", "Tauris", "+37124789043", 1994);
        String name = "Lauris";
        String surname = "Tauris";
        String phone = "+37124789043";
        int birthYear = 1994;
        printBusinessCard(name, surname, phone, birthYear);
        printBusinessCard(name, surname, phone, birthYear);

        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1978);
        printBusinessCardTwo("Juris", "Vītols", "+371 12345678", 1990);

        System.out.println(SumOfTowNumbers(4, 10));
        int summa = SumOfTowNumbers(20, 40);
        System.out.println(summa);

        System.out.println(averageNumber(10, 2, 4));
    }

    public static void printBusinessCard(String name, String surname, String phone, int birthYear) {
        System.out.println("Vizītkarte");
        System.out.println("###########");
        System.out.printf("Vārds: %s\n", name);
        System.out.printf("Uzvārds: %s\n", surname);
        System.out.printf("Telefona numurs: %s\n", phone);
        System.out.printf("Dzimšanas gads: %d\n", birthYear);

    }

    // 6. uzdevums

    public static void printBusinessCardTwo(String name, String surname, String phone, int birthYear) {
        System.out.println("Vizītkarte");
        System.out.println("###########");
        System.out.printf("Vārds: %s\n", name);
        System.out.printf("Uzvārds: %s\n", surname);
        System.out.printf("Telefona numurs: %s\n", phone);
        System.out.printf("Dzimšanas gads: %d\n", birthYear);

    }

    // 7. uzdevums
    public static int SumOfTowNumbers(int x, int y) {
        return x + y;
    }

    // 8.uzdevums
    public static double averageNumber(double a,double b, double c) {
        return (a+b+c)/3;
    }



}
