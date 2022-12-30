package WS2021.Bewegung;

import java.util.List;

public interface GeoGame {
    List<GeometricObject> getGeos();
    int getWidth();
    int getHeight();
    void move();
    void collisionCheck();
}
