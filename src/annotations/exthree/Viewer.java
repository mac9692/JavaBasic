package annotations.exthree;

public class Viewer implements Viewable{
    @Override
    @SuppressWarnings("deprecation")
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println('[' + str + ']');
    }
}
