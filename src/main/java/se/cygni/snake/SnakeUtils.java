package se.cygni.snake;

import java.awt.*;

public class SnakeUtils {

    static public double calculateAverageDistance(Point focosPoint, Point[] positions){
        double positionSum = 0;
        for (Point p: positions) {
            double deltaX = Math.abs(p.getX()-focosPoint.getX());
            double deltaY = Math.abs(p.getY()-focosPoint.getY());
            positionSum += deltaX + deltaY;
        }
        double averageDistance = positionSum/(double) positions.length;
        return  averageDistance;
    }
}
