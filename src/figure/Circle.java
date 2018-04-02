package figure;

class Circle {

    private int x1 = 2;
    private int x2 = 5;
    private int y1 = 1;
    private int y2 = 2;

    private double pi = 3.14159;

    private double r = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

    private double P = 2 * pi * r;
    private double S = pi * (r * r);

    protected double getP() {
        return P;
    }

    protected double getS() {
        return S;
    }


}
