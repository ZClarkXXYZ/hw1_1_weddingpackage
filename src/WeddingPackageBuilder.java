import java.util.Scanner;
public class WeddingPackageBuilder {
    private WeddingPackage weddingPackage;
    private String input;
    private Scanner scnr = new Scanner(System.in);

    //Builder, change venue, catering, decorations, photography step based on input
    public WeddingPackage buildWedding(WeddingPackage basePackage) {
        //There is either having any input, or having select choices.
        //Any input was chosen for this, but select choices would likely be better
        // if there is "sets" of ways to modify a wedding package, which would use an interface and builder classes

        weddingPackage = basePackage;
        System.out.println("Current Package");
        basePackage.printWeddingInfo();

        //Venue
        System.out.println("Enter new venue (or 'none' to keep the same)");
        input = scnr.nextLine();
        if (!(input.equals("none") && !(input.equals("None")))) {
            weddingPackage.setWeddingVenue(input);
        }

        //Catering
        System.out.println("Enter new catering (or 'none' to keep the same)");
        input = scnr.nextLine();
        if (!(input.equals("none") && !(input.equals("None")))) {
            weddingPackage.setWeddingCatering(input);
        }

        //Decorations
        System.out.println("Enter new decoration selection (or 'none' to keep the same)");
        input = scnr.nextLine();
        if (!(input.equals("none") && !(input.equals("None")))) {
            weddingPackage.setWeddingDecorations(input);
        }


        //Photography
        System.out.println("Enter new photography selection (or 'none' to keep the same)");
        input = scnr.nextLine();
        if (!(input.equals("none") && !(input.equals("None")))) {
            weddingPackage.setWeddingPhotography(input);
        }

        //Return the Wedding Package modified step by step
        return weddingPackage;
    }
}
