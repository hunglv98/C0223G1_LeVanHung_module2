package ss6_inheritance.ex.point;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2.3f, 4.5f, 4, 7);
        System.out.println(movablePoint.move());
    }
}
