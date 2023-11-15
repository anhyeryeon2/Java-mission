// import java.util.*;

// class Shape {
//     protected String name;
//     protected double area;

//     public void getArea() {
//         System.out.printf("%s의 넓이: %.2f\n", name, area);
//     }
// }

// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius) {
//         super.name = "Circle";
//         this.radius = radius;
//     }

//     @Override
//     public void getArea() {
//         area = 3.14 * radius * radius;
//         super.getArea();
//     }
// }

// class Rectangle extends Shape {
//     private double length, width;

//     public Rectangle(double length, double width) {
//         super.name = "Rectangle";
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     public void getArea() {
//         area = length * width;
//         super.getArea();
//     }
// }

// public class OOP1018_2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         for (int i = 0; i < 3; i++) {
//             String shapename = scanner.next();

//             if (shapename.equals("Circle")) {
//                 double radius = scanner.nextDouble();
//                 Circle circle = new Circle(radius);
//                 circle.getArea();
//             } else if (shapename.equals("Rectangle")) {
//                 double length = scanner.nextDouble();
//                 double width = scanner.nextDouble();
//                 Rectangle rectangle = new Rectangle(length, width);
//                 rectangle.getArea();
//             }
//         }

//         scanner.close();
//     }
// }


// 모든값을 입력받고 한꺼번에 출력되게는 어떻게해?수정해줘


import java.util.*;

class Shape {
    protected String name;
    protected double area;

    public void getArea() {
        System.out.printf("%s의 넓이: %.2f\n", name, area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super.name = "Circle";
        this.radius = radius;
    }

    @Override
    public void getArea() {
        area = 3.14 * radius * radius;
        super.getArea();
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        super.name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        area = length * width;
        super.getArea();
    }
}

public class OOP1018_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[3];

        for (int i = 0; i < 3; i++) {
            String shapename = scanner.next();

            if (shapename.equals("Circle")) {
                double radius = scanner.nextDouble();
                if (radius >= 0) {
                    Circle circle = new Circle(radius);
                    shapes[i] = circle;
                } else {
                    System.out.println("잘못된 입력이다.");
                    i--;  
                }
            } else if (shapename.equals("Rectangle")) {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();

                if (length >= 0 && width >= 0) {  
                    Rectangle rectangle = new Rectangle(length, width);
                    shapes[i] = rectangle;
                } else {
                    System.out.println("잘못된 입력이다.");
                    i--;  
                }
            }
        }

        scanner.close();

        for (Shape shape : shapes) {
            shape.getArea();
        }
    }
}
