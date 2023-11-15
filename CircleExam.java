public class CircleExam {
    int radius;
    String name;
    public CircleExam(){
        radius =1;
        name="";
    }
    public CircleExam(int r, String n){
        radius=r;
        name=n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        CircleExam pizza = new CircleExam(10,"자바피자");

        double area =pizza.getArea();
        System.out.println(pizza.name +":"+area);

        CircleExam donut = new CircleExam();
        donut.name="도넛피자";
        area=donut.getArea();
        System.out.println(donut.name+area);
    }
}
