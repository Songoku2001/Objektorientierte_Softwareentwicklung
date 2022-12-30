package WS2021.Vererbung_equals;

import java.util.LinkedList;

public class Polygon extends LinkedList<Vertex>{
    void add(double x,double y){
        add(new Vertex(x,y));
    }

    int[] getXs(){
        int[] xs = new int[size()];
        int i=0;
        for (Vertex v:this)xs[i++]=(int)Math.round(v.x);
        return xs;
    }
    int[] getYs(){
        int[] ys = new int[size()];
        int i=0;
        for (Vertex v:this)ys[i++]=(int)Math.round(v.y);
        return ys;
    }
}