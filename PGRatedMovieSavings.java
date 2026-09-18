public class PGRatedMovieSavings implements MovieSavings {
    private String name;
    private int age;
    private final double savings = 4.00;

    public PGRatedMovieSavings(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displaySavings() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Savings: $%.2f" + savings + " off of a PG-Rated Movie\n");
    }
}
