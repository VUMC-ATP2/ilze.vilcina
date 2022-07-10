package homework;

public class FirstClass {
    public static void main(String[] args) {
        String countryName = "Latvia";
        System.out.println(countryName);

        int populationInLatvia = 1907675;
        System.out.println("In Latvia live " + populationInLatvia + " people");

        double sizeOfLatvia = 64.589;
        System.out.println("Size of Latvia is " + sizeOfLatvia + "km2");

        String capitalCity = "Riga";
        String lvLanguage = "latvian";
        System.out.println(capitalCity + " is the capital of Latvia and official language is " + lvLanguage);

        boolean isEuCountry = true;
        boolean isNotEuCountry = false;
        System.out.println(isEuCountry);
        System.out.println(isNotEuCountry);

        if(isEuCountry) {
            System.out.println("Yes, Latvia is EU country.");
        } else {
            System.out.println("No, Lativa is not EU country");
        }

        String currencyInLatvia = "€";
        System.out.println("Currency in Latvia is " + currencyInLatvia);

        String firstSentence = "I like to travel.";
        String secondSentence = "Last trip was to mountains.";
        String thirdSentence = "I love mountaions!";
        System.out.println(firstSentence);
        System.out.println(firstSentence + secondSentence);
        System.out.println(firstSentence + secondSentence + thirdSentence);

        int a = 10;
        int b = 15;
        int c = b + a;
        System.out.println(c);
        int d = 7;
        int e = 1;
        int i = d + e;
        int u = b + d;
        System.out.println(i);
        System.out.println(u);
        System.out.println(u + 9);

        int p = b - a;
        int o = d - e;
        int l = e - d;
        System.out.println(p);
        System.out.println(o);
        System.out.println(l);
        System.out.println(10 - l);

        int y = d * e;
        int t = a * d;
        int v = b * e;
        System.out.println(y);
        System.out.println(t);
        System.out.println(v);
        System.out.println(a * b);

        int k = d / e;
        int g = a / d;
        int f = e / b;
        System.out.println(k);
        System.out.println(g);
        System.out.println(f);
        System.out.println(a / 2);
        System.out.println((a / 2) * 7);
        System.out.println((a / 2) * 7 + 100);






    }
}
