package Pratice3.src;

public class Cylinder {
    public static double baseArea(double radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
    public static double perimeter(double radius) {
        double basePerimeter = Math.PI * 2*radius;
        return basePerimeter;
    }
    public static double volume(double radius, double height) {
        double baseVolume = baseArea(radius)* height ;
        return baseVolume;
    }
}
