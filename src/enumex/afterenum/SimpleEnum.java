package enumex.afterenum;

public class SimpleEnum {
    public static void main(String[] args) {
        Scale scale = Scale.DO;
        System.out.println(scale);

        switch (scale) {
            case DO:
                System.out.println("음 이름 : 도");
                break;
            case RE:
                System.out.println("음 이름 : 레");
                break;
            case MI:
                System.out.println("음 이름 : 미");
                break;
            case FA:
                System.out.println("음 이름 : 파");
                break;
            default:
                System.out.println("음 이름 : 솔, 라, 시");
        }
    }
}
