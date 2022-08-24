package objectClass;

public class Rectangle implements Cloneable{
    private Point upperLeft; //좌측 상단 좌표
    private Point lowerRight; //우측 상단 좌표

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle copy = (Rectangle) super.clone();

        copy.upperLeft = (Point) upperLeft.clone();
        copy.lowerRight = (Point) lowerRight.clone();

        return copy;
    }

    public void showPosition() {
        System.out.print("좌측 상단 좌표 : ");
        upperLeft.showPosition();

        System.out.print("우측 하단 좌표 : ");
        lowerRight.showPosition();
        System.out.println();
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }
}
