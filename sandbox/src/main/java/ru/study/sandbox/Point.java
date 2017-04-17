package ru.study.sandbox;

/**
 * Created by nadis on 13/04/2017.
 * А(хА; уА) и В(хВ; уВ), выполняется по формуле d = √((хА – хВ)2 + (уА – уВ)2)
 */
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point a){
        return Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2));
    }

}
