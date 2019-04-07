package game.arena;
import game.entities.IMobileEntity;
import game.enums.*;

public class WinterArena implements IArena {
    double lenght;
    SnowSurface surface;
    WeatherCondition condition;
    public  WinterArena(double lenght,SnowSurface surface,WeatherCondition condition){
        this.lenght=lenght;
        this.surface=surface;
        this.condition=condition;
    }
    public double getFriction(){
        return getSurface().getFriction();
    }
    public boolean isFinished(IMobileEntity me){
        if (me.getLocation().getX()>this.lenght){
            return true;
        }
        return false;
    }

    public SnowSurface getSurface() {
        return surface;
    }

    public void setSurface(SnowSurface surface) {
        this.surface = surface;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public WeatherCondition getCondition() {
        return condition;
    }

    public void setCondition(WeatherCondition condition) {
        this.condition = condition;
    }

}
