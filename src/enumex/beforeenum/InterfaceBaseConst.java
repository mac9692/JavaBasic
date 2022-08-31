package enumex.beforeenum;

public class InterfaceBaseConst {
    public static void main(String[] args) {
        int sc = Scale.DO;

        switch (sc) {
            case Scale.DO:
                System.out.println("음 이름 : 도");
                break;
            case Scale.RE:
                System.out.println("음 이름 : 레");
                break;
            case Scale.MI:
                System.out.println("음 이름 : 미");
                break;
            case Scale.FA:
                System.out.println("음 이름 : 파");
                break;
            default:
                System.out.println("음 이름 : 솔, 라, 시");
        }
    }
}
