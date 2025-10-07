public class LuxuryWedding extends WeddingPackage{
    //Luxury Wedding base package
    private Venue venue = new Venue(); //Mansion
    private Catering catering = new Catering(); //Gourmet Buffet
    private Decorations decorations = new Decorations(); //Elegant Flowers
    private Photography photography = new Photography(); //Professional Photography



    //Default package for Luxury Wedding, constructor
    public LuxuryWedding() {
        venue.setVenue("Mansion");
        catering.setCatering("Gourmet Buffet");
        decorations.setDecorations("Elegant Flowers");
        photography.setPhotography("Professional Photography");
    }

    //Required for abstract
    //Print all the wedding package information
    @Override
    public void printWeddingInfo() {
        System.out.println("Luxury Wedding Package:");
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
