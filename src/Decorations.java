public class Decorations {
    private String decorationString;

    public void setDecorations(String newDecorations) {
        this.decorationString = newDecorations;
    }

    //print decoration type
    public void decorationInfo() {
        System.out.println("Selected Decorations: " + decorationString);
    }
}
