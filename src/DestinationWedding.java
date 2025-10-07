public class DestinationWedding extends WeddingPackage{
    //Destination Wedding base package
    private Venue venue = new Venue(); //Beach Resort
    private Catering catering = new Catering(); //Classic Buffet
    private Decorations decorations = new Decorations(); //None
    private Photography photography = new Photography(); //Professional Photography


    //Default package for Destination Wedding, constructor
    public DestinationWedding() {
        venue.setVenue("Beach Resort");
        catering.setCatering("Classical Buffet");
        decorations.setDecorations("None");
        photography.setPhotography("Professional Photography");
    }

    //Required for abstract
    //Print all the wedding package information
    @Override
    public void printWeddingInfo() {
        System.out.println("Destination Wedding Package:");
        venue.venueInfo();
        catering.cateringInfo();
        decorations.decorationInfo();
        photography.photographyInfo();
    }

    //Required for abstract
    //Set venue, catering, decorations, photography
    @Override
    public void setWeddingVenue(String newVenue) {venue.setVenue(newVenue);};
    @Override
    public void setWeddingCatering(String newCatering){catering.setCatering(newCatering);};
    @Override
    public void setWeddingDecorations(String newDecorations) {decorations.setDecorations(newDecorations);};
    @Override
    public void setWeddingPhotography(String newPhotography) {photography.setPhotography(newPhotography);};
}
