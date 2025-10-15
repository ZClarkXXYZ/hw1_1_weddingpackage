import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class WeddingPackageBuilder {
    private WeddingPackage weddingPackage;

    //Builder, change venue, catering, decorations, photography step based on input
    public WeddingPackage buildWedding(WeddingPackage basePackage, String venue, String catering, String decorations, String photography) {
        weddingPackage = basePackage;

        //Venue
        weddingPackage.setWeddingVenue(venue);


        //Catering
        weddingPackage.setWeddingCatering(catering);


        //Decorations
        weddingPackage.setWeddingDecorations(decorations);



        //Photography
        weddingPackage.setWeddingPhotography(photography);


        //Return the Wedding Package modified step by step
        return weddingPackage;
    }
}
