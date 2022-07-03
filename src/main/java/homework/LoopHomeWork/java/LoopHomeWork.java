package homework.LoopHomeWork.java;

import java.util.Scanner;

public class LoopHomeWork {
    public static <totalAttempts> void main(String[] args) {

        // 1. uzdevums
        int i = 0;
        while (i < 101) {
            System.out.println(i);
            i++;
        }
        System.out.println("Gatavs!");

        // 2. uzdevums

        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        scan.close();
        int n = 2;
        while (n <= number / 2) {
            if (number % n == 0) {
                isPrime = false;
                break;
            }
            n++;
        }

        if (isPrime)
            System.out.println(number + " is Prime number!");
        else
            System.out.println(number + " is not Prime number!");

        // 3. uzdevums

        // while
       int p = 0;
       while (p >= 3) {
           System.out.println(p);
           p++;
       }
        p = 10;
        while (p>=1) {
            System.out.println(p);
            p--;
        }

        // do while
        n = 0;
        do {
            if (n % 3 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n <=12);

        // for loop
        String[] city = new String[]{"Rīga", "Ogre", "Jelgava", "Sigulda", "Daugavpils", "Ludza", "Rēzekne", "Liepāja"};
        for (int j = 0; j < 3; j++) {
            System.out.println(city[j]);
        }

        // for each
       System.out.println("Latvijas pilsētas: ");
        for (String LvCity : city) {
            System.out.println(LvCity);
        }


        // 4. uzdevums

        number = 0;
        System.out.println("Pāra skaitļi:");
        while (number <= 101) {
            if (number % 2 == 0) {

                System.out.print(number + "," );
            }
            number++;
        }

        // 5. uzdevums

        int f, fact = 1;
        int numb = 4;
        for(f=1; f<=numb; f++) {
            fact=fact*f;
        }
        System.out.println("\nFactorial of " + numb + " is:" + fact);


        // 6. uzdevums

        final int password = 7007;
        System.out.println("Lūdzu ieraksti PIN kodu: ");
        int enterPass = 1;
        int tryTimes = 1;
        Scanner pass = new Scanner(System.in);

        while (enterPass != password && tryTimes < 3) {
            enterPass = pass.nextInt();
            System.out.println("Nepareizs PIN mēģiniet vēlreiz.");
            tryTimes++;
        }
        if (enterPass == password && tryTimes >=3) {
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ.");
        } else {
            System.out.println("Atvainojiet, bet Jūs esat bloķēts.");
        }


    }
}
