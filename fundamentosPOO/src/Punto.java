
/**
 *
 * @author Nappe
 */
public class Punto {

    double x;
    double y;
    String label;

    public Punto(double X, double Y, String label) {

        this.x = X;
        this.y = Y;
        this.label = label;

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String getLabel() {
        return this.label;
    }

    public void setX(double nX) {
        this.x = nX;
    }

    public void setY(double nY) {
        this.y = nY;
    }

    public void setLabel(String nLabel) {
        this.label = nLabel;
    }

    @Override
    public String toString() {
        return (this.label + " (" + this.x + ", " + this.y + ")");
    }
}
