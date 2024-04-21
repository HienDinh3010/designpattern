package design.asd.course.pattern.adapter.distancecalculator.client;

import design.asd.course.pattern.adapter.distancecalculator.library.DistanceCalculator;

/**
 * Problem: We have a library which provides distance calculation only for mile.
 * Now we have a Client want to calculate distance in kilometer.
 * Client will use the library and translate the implementation from miles to kilometers.
 * Disadvantages:
 * 1. The translation of implementation is not reusable.
 * 2. Client does multiple things: its own logic and the distance calculation
 */
public class Client {
    public static void main(String[] args) {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double inMiles = distanceCalculator.computeDistance("Fairfield", "Des Moise");
        System.out.println("Distance in miles:" + inMiles);

        DistanceAdapter distanceAdapter = new KilometerDistanceAdapterImpl();
        distanceAdapter.setDistanceCalculator(distanceCalculator);
        double inKilometers = distanceAdapter.computeDistance("Fairfield", "Des Moise");
        System.out.printf("Distance in kilometers:" + inKilometers);
    }
}
