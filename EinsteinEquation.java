import java.util.Scanner;

/**
* The EinsteinEquation program takes in the mass of an
* object and calculates its energy using E = mc^2.
*
* @author Layla Michel
* @version 1.0
* @since 2022-02-24
*/

final class EinsteinEquation {
    /**
    * Creating private constructor due to public/default constructor error.
    *
    * @throws IllegalStateException if there is an issue
    */
    private EinsteinEquation() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Displays text to terminal.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        final Scanner myObj = new Scanner(System.in);
        while (true) {
            // Get mass of object from user
            System.out.print("Enter the mass of the object(kg): ");
            final String massObj = myObj.nextLine();
            // Try to convert from string to double
            try {
                final double massObjDouble = Double.parseDouble(massObj);

                // Check if input is not negative
                if (massObjDouble < 0) {
                    // Display error message if input is negative
                    System.out.println(massObj
                        + " is not a valid input, try again.\n");
                } else {
                    // Create speed of light constant
                    final double lightSpeed = 2.998 * (Math.pow(10, 8));
                    // Calculate amount of energy released (e=mc^2)
                    final double energy = massObjDouble
                        * (Math.pow(lightSpeed, 2));
                    System.out.println("\n" + energy
                        + " joules of energy were released.");
                    break;
                }

            // Display error message if unable to convert
            } catch (NumberFormatException ex) {
                System.out.println(massObj
                    + " is not a valid input, try again.\n");
            }
        }
        myObj.close();
    }
}
