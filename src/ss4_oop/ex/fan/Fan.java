package ss4_oop.ex.fan;

public class Fan {
    public int LOW, MEDIUM, FAST, speed;
    public boolean on;
    public double radius;
    public String color;

    public int getLOW() {
        return LOW;
    }

    public void setLOW(int LOW) {
        this.LOW = LOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.LOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }

    public int getSpeed(int n) {
        return this.speed = n;
    }

    public boolean getOn(boolean on) {
        return this.on = on;
    }

    public double getRadius(double n) {
        return this.radius = n;
    }

    public String getColor(String a) {
        return this.color = a;
    }

    public String toString() {
        if (this.on) {
            return "Speed bằng " + this.speed + " color " + this.color + " bán kính bằng " + this.radius + " fan is on";
        } else {
            return " color " + this.color + " bán kính bằng " + this.radius + " fan is off";
        }
    }


}
