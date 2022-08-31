package annotations.exthree;

public class AtSuppressWarnings {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Viewable viewable = new Viewer();
        viewable.showIt("Hello Annotations");
        viewable.brShowIt("Hello Annotations");
    }
}
