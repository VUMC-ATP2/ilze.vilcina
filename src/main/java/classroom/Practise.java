package classroom;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        //Uzrakstīt programmu, kas saņem veselu skaitli no
        // lietotāja un izvada vai tas ir lielākas par 0

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please write a number:");
//        int inputResult = scanner.nextInt();
//        if(inputResult > 0) {
//            System.out.println("Number is > 0 which is:" + inputResult);
//
//        }
//
//        //Uzrakstīt programmu, kas paprasa lietotāja vecumu
//        //un tad izvada uz ekrāna vai lietotājs drīkst
//        //piedalīties vēlēšanās vai nedrīkst
//        //18 >= if - else
//
//       Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Please write your age");
//        int age = scanner2.nextInt();
//        if (age >= 18) {
//            System.out.println("Congrats");
//
//        } else {
//            System.out.println("Too bad");
//        }

        //uzrakstīt programmu, kura pieņem no 1-7
        //un tad izvada ar vārdiem kāda nedēļas diena ir
        //if else - if
        // switch case

//        System.out.println("Please write a day number (1-7)");
//        int inputResult = scanner.nextInt();
//        switch (inputResult) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thurdsay");
//                break;
//            case 5:
//                System.out.println("Monday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Not incorrect day of the week");
//        }

        //Lietotājs ievada skaitli
        // Programma nosaka un izvada vai skaitlis ir
        //pāra vai nepāra

//        boolean result = 6 % 2 == 0;
//        System.out.println(result);
        System.out.println("Please write a number");
        int inputResult = scanner.nextInt();
        if (inputResult <0) {
            System.out.println("Incorrect number");
        } else if(inputResult % 2 == 0) {
            System.out.println("Pāra");
        } else {
            System.out.println("Nepāra");
        }

        }

//        if (inputResult % 2 == 0) {
//            System.out.println("Pāra");
//        }else {
//            System.out.println("Nepāra");
//       }
//    }
}
