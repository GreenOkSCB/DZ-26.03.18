package figure;

class Triangle {

    private int x1 = 2;
    private int x2 = 5;
    private int x3 = 3;
    private int y1 = 2;
    private int y2 = 4;
    private int y3 = 5;

    private double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    private double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    private double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

    private double P = a + b + c;
    private double halfPer = P / 2;
    private double S = Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));

    protected void getP() {
        System.out.println("Периметр треугольника " + P);
    }

    protected void getS() {
        System.out.println("Площадь треугольника " + S);
    }
}

