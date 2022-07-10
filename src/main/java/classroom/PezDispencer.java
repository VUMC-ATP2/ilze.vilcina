package classroom;

public class PezDispencer {
    String name;
    int capacity;
    int currentCandyCount;

    public PezDispencer(String name) {
        this.name = name;
        capacity = 20;
        currentCandyCount = 20;
    }

    public void eat() {
        if (currentCandyCount<=0) {
            System.out.println("I can't eat, please load me!");
        } else {
            currentCandyCount--;
            System.out.println("I ate one pez!");
        }

}}
