//MAIN, Testing
public class Main {
    public static void main(String[] args) {
        //Tests:
        //1. test making multiple wedding planners
        //2. test each wedding package: traditional, luxury, destination
        //3. test building on a wedding package

        //Console will tell when a new instance of WeddingPlanner is made
        WeddingPlanner planner1 = WeddingPlanner.getInstance();
        WeddingPlanner planner2 = WeddingPlanner.getInstance();


        //Plan 3 weddings, print out info
        WeddingPackage weddingTrad1 = planner1.planWedding("Traditional");
        WeddingPackage weddingLux1 = planner1.planWedding("Luxury");
        WeddingPackage weddingDest1 = planner1.planWedding("Destination");

        weddingTrad1.printWeddingInfo();
        System.out.println(""); //Spacing for test
        weddingLux1.printWeddingInfo();
        System.out.println(""); //Spacing for test
        weddingDest1.printWeddingInfo();
        System.out.println(""); //Spacing for test


        //Builder a custom wedding, using Luxury as a base. Using planner2 since it should still work as same instance
        WeddingPackage customWedding1 = planner2.planWedding("Luxury", true);
        customWedding1.printWeddingInfo();
    }
}