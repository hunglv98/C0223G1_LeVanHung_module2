package ss4_oop.ex.fan;

public class ManageFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.getSpeed(fan1.FAST);
        fan1.getRadius(10);
        fan1.getColor("Yellow");
        fan1.getOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.getSpeed(fan2.MEDIUM);
        fan2.getRadius(5);
        System.out.println(fan2.toString());
    }
}
