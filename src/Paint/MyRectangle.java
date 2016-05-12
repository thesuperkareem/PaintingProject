/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author BCC
 */
public class MyRectangle extends Rectangle2D.Double implements MyShape { 

    private double X1, X2, Y1, Y2;
    private Color color;
    //private Color fill;
    private final String type;
    private boolean filled = false;

    public MyRectangle(double X1, double Y1, double X2, double Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
        color = Color.BLACK;
        //fill = Color.BLACK;
        type = "Rectangle";
    }

    

    @Override
    public double getX1() {
        return X1;
    }

    @Override
    public void setX1(double X1) {
        this.X1 = X1;
    }

    @Override
    public double getY1() {
        return Y1;
    }

    @Override
    public void setY1(double Y1) {
        this.Y1 = Y1;
    }

    @Override
    public double getX2() {
        return X2;
    }

    @Override
    public void setX2(double X2) {
        this.X2 = X2;
    }

    @Override
    public double getY2() {
        return Y2;
    }

    @Override
    public void setY2(double Y2) {
        this.Y2 = Y2;
    }

    @Override
    public void setFill() {
        filled = true;
    }

    @Override
    public boolean getFill() {
        return filled;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color x) {
        this.color = x;
    }

    @Override
    public String getType() {
        return type;
    }

} 

