package figure;

class Triangle {

    private double a = getSide(2, 5, 2, 4);
    private double b = getSide(5, 3, 4, 5);
    private double c = getSide(2, 3, 2, 5);

    private double P = a + b + c;
    private double halfPer = P / 2;
    private double S = Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));

    protected double getP() {
        return P;
    }

    protected double getS() {
        return S;
    }

    private double getSide(int x1, int x2, int y1, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}

