public class Venue {
    private String venueString;

    public void setVenue(String newVenue) {
        this.venueString = newVenue;
    }

    //print the venue
    public void venueInfo() {
        System.out.println("Wedding Venue: " + venueString);
    }

}
