import java.util.ArrayList;
import java.util.Scanner;

public class MovieSavingsDriver {

    public static int validAge(String ageStr) throws AgeException {
        if (ageStr.length() < 1 || ageStr.length() > 2) {
            throw new AgeException("Age must be 1 or 2 digits.");
        }

        int age;
        try {
            age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e) {
            throw new AgeException("Age must be a number.");
        }

        if (age < 5 || age > 17) {
            throw new AgeException("Age must be between 5 and 17.");
        }

        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GRatedMovieSavings> gMovieList = new ArrayList<>();
        ArrayList<PGRatedMovieSavings> pgMovieList = new ArrayList<>();

        boolean moreUsers = true;

        while (moreUsers) {
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            String ageStr = scanner.nextLine();

            try {
                int age = validAge(ageStr);
                System.out.println("User is of valid age to get a discount");

                if (age >= 5 && age <= 12) {
                    gMovieList.add(new GRatedMovieSavings(name, age));
                    System.out.println(name + " is eligible for savings on a G-Rated movie");
                } else {
                    pgMovieList.add(new PGRatedMovieSavings(name, age));
                    System.out.println(name + " is eligible for savings on a PG-Rated movie");
                }
            } catch (AgeException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Would you like to enter another name? (Y/N): ");
            String response = scanner.nextLine().toUpperCase();
            moreUsers = response.equals("Y");
        }

        System.out.println("\n--- G-Rated Movie Savings Users ---");
        for (GRatedMovieSavings user : gMovieList) {
            user.displaySavings();
        }

        System.out.println("--- PG-Rated Movie Savings Users ---");
        for (PGRatedMovieSavings user : pgMovieList) {
            user.displaySavings();
        }

        scanner.close();
    }
}
