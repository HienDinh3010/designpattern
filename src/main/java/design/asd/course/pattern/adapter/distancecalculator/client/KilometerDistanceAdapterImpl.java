package design.asd.course.pattern.adapter.distancecalculator.client;

import design.asd.course.pattern.adapter.distancecalculator.library.DistanceCalculator;

public class KilometerDistanceAdapterImpl implements DistanceAdapter {

    private DistanceCalculator distanceCalculator;

    @Override
    public double computeDistance(String origin, String destination) {
        double inMiles = distanceCalculator.computeDistance(origin, destination);
        double kilometers = inMiles / 1000;
        return kilometers;
    }

    @Override
    public void setDistanceCalculator(DistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }
}
