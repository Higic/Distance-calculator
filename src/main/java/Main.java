public class Main {

    public static void main (String[] args) {

        // point 1
        double x1 = 1.0;
        double y1 = 1.0;

        // point 2
        double x2 = 2.0;
        double y2 = 2.0;


        DistanceCalculator distanceCalculator = new DistanceCalculator(x1, y1, x2, y2);

        double distance = distanceCalculator.calculate();

        System.out.println("Distance calculated between the points: " + distance);
    }
}
