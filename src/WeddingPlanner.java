public class WeddingPlanner {

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
        return(weddingFactory.createWedding(chosenPackage));
    }

    //From input from main/testing, get the wedding package from the wedding factory
    //From input from main/testing, use wedding package builder to modify the wedding package
    public WeddingPackage planWedding(String chosenPackage, boolean modifyPackage) {
        WeddingPackage weddingPackage = planWedding(chosenPackage);
        if (modifyPackage) {
            //Build the wedding
            weddingPackage = weddingBuilder.buildWedding(weddingPackage);
        }
        return weddingPackage;
    }
}
