package figure;

class Rectangle {

    private double a = getSide(3, 6, 1, 4);
    private double b = getSide(6, 4, 4, 6);
    private double c = getSide(4, 1, 6, 3);
    private double d = getSide(3, 1, 1, 3);

    private double P = a + b + c + d;
    private double S = a * b;

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
