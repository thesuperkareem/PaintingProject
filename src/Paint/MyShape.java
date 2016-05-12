package Paint;

import java.awt.Color;
import java.awt.Shape;

public interface MyShape extends Shape {

    public abstract double getX1();

    public abstract void setX1(double X1);

    public abstract double getX2();

    public abstract void setX2(double X2);

    public abstract double getY1();

    public abstract void setY1(double Y1);

    public abstract double getY2();

    public abstract void setY2(double Y2);

    public abstract void setFill();

    public abstract boolean getFill();

    public abstract Color getColor();

    public abstract void setColor(Color x);

    public abstract String getType();
}
