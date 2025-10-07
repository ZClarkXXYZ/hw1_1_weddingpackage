public class Photography {
    private String photographyString;

    //Set the photography
    public void setPhotography(String photography) {
        this.photographyString = photography;
    }

    //print photography type
    public void photographyInfo() {
        System.out.println("Photography: " + photographyString);
    }
}
