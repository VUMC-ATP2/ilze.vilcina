package classroom;

public class Classes {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.printInformation();

        System.out.println("========");

        myHouse.houseNumber = 2;
        myHouse.marketValue = 170.000d;
        myHouse.printInformation();

        System.out.println("=======");

        House summerHouse = new House();
        summerHouse.propertyType = "summerhouse";
        summerHouse.stories = 1;
        summerHouse.printInformation();

        //car
        //Car bmw = new Car();

        //1 usage
    }

}
