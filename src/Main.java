//MAIN, Testing
public class Main {
    public static void main(String[] args) {
        //Tests:
        //1. test making multiple wedding planners
        //2. test each wedding package: traditional, luxury, destination
        //3. test building on a wedding package

        //Console will tell when a new instance of WeddingPlanner is made
        WeddingPlanner planner1 = WeddingPlanner.getInstance();
        WeddingPlanner planner2 = WeddingPlanner.getInstance(); //This will not print it creates new instance


        //Plan 3 weddings, print out info
        WeddingPackage weddingTrad1 = planner1.planWedding("Traditional");
        System.out.println(""); //spacing
        WeddingPackage weddingLux1 = planner1.planWedding("Luxury");
        System.out.println(""); //spacing
        WeddingPackage weddingDest1 = planner1.planWedding("Destination");
        System.out.println(""); //spacing


        //Builder a custom wedding, using Luxury as a base.
        WeddingPackage customWedding1 = planner2.planWedding("Luxury", true);

    }
}