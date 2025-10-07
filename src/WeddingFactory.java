public class WeddingFactory {

    //WeddingPlanner calls from WeddingFactory for a WeddingPackage based on input
    public WeddingPackage createWedding(String weddingType) {
        if (weddingType.equals("Traditional")){
            return(new TraditionalWedding());
        }
        else if (weddingType.equals("Luxury")) {
            return (new LuxuryWedding());
        }
        else if (weddingType.equals("Destination")) {
            return(new DestinationWedding());
        }
        return(new TraditionalWedding()); //Returning Traditional by default as a failsafe
    }
}
