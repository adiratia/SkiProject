package game.entities;
import utilities.Point;

public interface IMobileEntity {
    public void Move( double friction);
    Point getLocation();
}
