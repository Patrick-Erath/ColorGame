// Write a program that generates a random point inside a circle.
// The circle is centered at (0, 0) with a radius 5. Display the point and its distance to the center.
import java.util.Random;

public class RandomPoint {
    public static void main(String[] args) {
        makePoint();
    }

    static void makePoint(){
        int radius = 5;
        Random rand = new Random();
        double a = 2*Math.PI*rand.nextDouble();
        double randRadius = (double)radius*rand.nextDouble();
        double x = randRadius*Math.cos(a);
        double y = randRadius*Math.sin(a);
        System.out.println("The point is ("+x+" , "+y+")");
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("The distance is: "+distance);
    }
}

