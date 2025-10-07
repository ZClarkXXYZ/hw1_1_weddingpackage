public abstract class WeddingPackage {

    //Print all the information of the wedding created
    abstract void printWeddingInfo();

    //Require each package to be able to set the different properties
    abstract void setWeddingVenue(String newVenue);
    abstract void setWeddingCatering(String newCatering);
    abstract void setWeddingDecorations(String newDecorations);
    abstract void setWeddingPhotography(String newPhotography);
}
