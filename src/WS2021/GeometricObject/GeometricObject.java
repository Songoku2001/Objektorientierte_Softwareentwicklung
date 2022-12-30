package WS2021.GeometricObject;

public class GeometricObject {
    Vertex corner;
    double width;
    double height;
    Vertex velocity;

    GeometricObject(Vertex corner, double width, double height, Vertex velocity) {
        this.corner = corner;
        this.width = width;
        this.height = height;
        this.velocity = velocity;
    }

    double size(){
       return this.width * this.height;
    }

    boolean isLargerThan(GeometricObject that){
        return (this.size() > that.size());
    }

    boolean isAbove(GeometricObject that){
        return (this.corner.y + this.height) < that.corner.y;
    }

    boolean isUnderneath(GeometricObject that){
        return that.isAbove(this);
    }

    boolean isLeftOf(GeometricObject that){
        return (this.corner.x + this.width) < that.corner.x;
    }

    boolean isRightOf(GeometricObject that){
        return that.isLeftOf(this);
    }

    boolean touches(GeometricObject that){
        return !this.isAbove(that) && !this.isUnderneath(that) && !this.isLeftOf(that) && !this.isRightOf(that);
    }

}

