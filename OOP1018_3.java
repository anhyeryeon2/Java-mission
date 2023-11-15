import java.util.*;

class Point {
    protected int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double dist(Point q) {
        return Math.sqrt((this.x - q.x) * (this.x - q.x) + (this.y - q.y) * (this.y - q.y));
    }
}

class Polygon extends Point {
    private Point[] points;

    public Polygon(Point[] points) {
        super();
        this.points = points;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++) {
            perimeter += points[i].dist(points[(i + 1) % points.length]);
        }
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        for (int i = 0; i < points.length; i++) {
            area += points[i].x * points[(i + 1) % points.length].y - points[(i + 1) % points.length].x * points[i].y;
        }
        return Math.abs(area) / 2.0;
    }
}

public class OOP1018_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        scanner.close();

        Polygon polygon = new Polygon(points);
        System.out.printf("%.2f\n", polygon.getPerimeter());
        System.out.printf("%.2f\n", polygon.getArea());
    }
}
