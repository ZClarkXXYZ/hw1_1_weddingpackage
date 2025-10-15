public class WeddingFactory {

    //WeddingPlanner calls from WeddingFactory for a WeddingPackage based on input
    public WeddingPackage createWedding(String weddingType) {
        if (weddingType.equals("Traditional")){
            System.out.println("Planning Traditional Wedding...");
            return(new TraditionalWedding());
        }
        else if (weddingType.equals("Luxury")) {
            System.out.println("Planning Luxury Wedding...");
            return (new LuxuryWedding());
        }
        else if (weddingType.equals("Destination")) {
            System.out.println("Planning Destination Wedding...");
            return(new DestinationWedding());
        }
        System.out.println("Error: invalid input. Planning Traditional Wedding...");
        return(new TraditionalWedding()); //Returning Traditional by default as a failsafe
    }
}
