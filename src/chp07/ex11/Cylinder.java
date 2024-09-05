package chp07.ex11;

public class Cylinder {
    int radius;
    int height;

    double getVolume() {
        return Math.pow(radius, 2)*Math.PI*height;
    }

    double getSurfaceArea() {
        double circleArea = Math.PI*radius*radius;
        double rectanglArea = height * 2 * Math.PI *radius;

        return 2 * circleArea + rectanglArea;

    }
}
