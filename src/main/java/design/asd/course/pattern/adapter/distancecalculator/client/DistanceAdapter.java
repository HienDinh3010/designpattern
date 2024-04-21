package design.asd.course.pattern.adapter.distancecalculator.client;

import design.asd.course.pattern.adapter.distancecalculator.library.DistanceCalculator;

public interface DistanceAdapter {
    double computeDistance(String origin, String destination);
    void setDistanceCalculator(DistanceCalculator distanceCalculator);
}
