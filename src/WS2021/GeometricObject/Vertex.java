package WS2021.GeometricObject;

public class Vertex {
    double x;
    double y;

    Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(Vertex v){
        x += v.x;
        y += v.y;
    }
    void moveTo(Vertex v){
        x = v.x;
        y = v.y;
    }
    public String toString() {
        return "("+x+", "+y+")";
    }
}
