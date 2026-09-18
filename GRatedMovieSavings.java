public class GRatedMovieSavings implements MovieSavings {
    private final String name;
    private final int age;
    private final double savings = 5.00;

    public GRatedMovieSavings(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displaySavings() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Savings: $%.2f" + savings + " off of a G-Rated Movie\n");
    }
}
