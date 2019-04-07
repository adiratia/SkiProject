package game.entities;
import utilities.Point;
import utilities.ValidationUtils;

public abstract class Entity {
    private Point location;
    public Entity(){
        location=new Point(0,0);
    }
    public Entity(Point locat){
        location=new Point(locat);
    }

    public void setLocation(Point location) throws IllegalArgumentException {
        ValidationUtils.assertNotNull(location);
        this.location = location;
    }
    public Point getLocation() {
        return location;
    }
}
