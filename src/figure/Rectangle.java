package figure;

class Rectangle {

    private int x1 = 3;
    private int x2 = 6;
    private int x3 = 4;
    private int x4 = 1;
    private int y1 = 1;
    private int y2 = 4;
    private int y3 = 6;
    private int y4 = 3;

    private double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    private double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    private double c = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
    private double d = Math.sqrt((x4 - x1) * (x4 - x1) + (y4 - y1) * (y4 - y1));

    private double P = a + b + c + d;
    private double perRect2 = (a + b) * 2; // по идее если прямоугольник этого достаточно
    private double S = a * b;

    public void getP() {
        System.out.println("Периметр прямоуголника " + P);
    }

    public void getS() {
        System.out.println("Площадь прямоугольника " + S);
    }
}
