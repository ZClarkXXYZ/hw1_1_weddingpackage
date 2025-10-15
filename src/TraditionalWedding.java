public class TraditionalWedding extends WeddingPackage{
    //Traditional Wedding base package
    private Venue venue = new Venue(); //Church and Event Center (Programmer note: as someone who has been to at least 3 weddings, this is normally what I see)
    private Catering catering = new Catering(); //Classic Buffet
    private Decorations decorations = new Decorations(); //Traditional Flowers
    private Photography photography = new Photography(); //Local Photography


    //Default package for Traditional Wedding, constructor
    public TraditionalWedding() {
        venue.setVenue("Church and Event Center");
        catering.setCatering("Classical Buffet");
        decorations.setDecorations("Traditional Flowers");
        photography.setPhotography("Local Photography");
    }

    //Required for abstract
    //Print all the wedding package information
    @Override
    public void printWeddingInfo() {
        System.out.println("Package: Traditional Wedding");
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
