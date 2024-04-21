package design.asd.course.pattern.adapter.distancecalculator.library;

import java.util.Random;

public class DistanceCalculator {
    public double computeDistance(String origin, String destination) {
        return (new Random()).nextDouble();
    }
}
