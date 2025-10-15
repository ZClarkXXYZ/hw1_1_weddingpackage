public class WeddingPlanner {
    WeddingPackage wedding;

    //Wedding package, Wedding package builder
    private WeddingFactory weddingFactory = new WeddingFactory();
    private WeddingPackageBuilder weddingBuilder = new WeddingPackageBuilder();

    //Singleton
    private static WeddingPlanner planner = null;

    //private constructor
    private WeddingPlanner() {
        System.out.println("WeddingPlanner instance made");
    }

    //Get wedding planner instance, have there be only one instance, Thread unsafe
    public static WeddingPlanner getInstance() {
        if (planner == null) {
            try {
            Thread.sleep(100);
            }
            catch (InterruptedException e) {
                //do nothing
            }
            planner = new WeddingPlanner();
        }
        return planner;
    }


    //From input from main/testing, get the wedding package from the wedding factory
    public WeddingPackage planWedding(String chosenPackage) {
        System.out.println("Planning "+ chosenPackage + " Wedding:"); //changed, prints out the planning
        wedding = weddingFactory.createWedding(chosenPackage); //Changed: wedding is stored
        wedding.printWeddingInfo();
        return(wedding);
    }

    //from input, plan wedding, then build it with hardcoded parameters
    public WeddingPackage planWedding(String chosenPackage, boolean modifyPackage) {
        System.out.println("Planning "+ chosenPackage + " Wedding:");
        wedding = weddingFactory.createWedding(chosenPackage);
        if (modifyPackage) {
            //Build the wedding
            System.out.println("Building custom  "+ chosenPackage + " Wedding:");
            wedding = weddingBuilder.buildWedding(wedding, "Beach","Gourmet buffet","No flowers","Local photography");
            wedding.printWeddingInfo();
        }
        return wedding;
    }
}
