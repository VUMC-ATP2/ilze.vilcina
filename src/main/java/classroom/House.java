package classroom;

import java.time.Year;

public class House {
   // 2 usages
    int houseNumber = 69; //lauks
    // 2 usages
    String propertyType = "flat";
    // 2 usages
    byte stories = 3;
    // 1 usage
    int bedrooms = 4;
    // 2 usages
    double marketValue = 150.000d;

    // 3 usages
    public void printInformation() {
        System.out.println("House number: " + houseNumber);
        System.out.println("Propery type: " + propertyType);
        System.out.println("Stories: " + stories);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Marketi Value: " + marketValue);
    }

   /* public boolean isHouseOld() {
        boolean isOld;
        if (Year < 2000) {
            System.out.println("House is old");
            isOld = true;
        } else {
            System.out.println("Pretty new!");
            isOld = false;
        }*/

}
