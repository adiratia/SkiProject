package game.entities;

import utilities.Point;
import utilities.ValidationUtils;

public class MobileEntity extends Entity implements IMobileEntity {
    private final double MaxSpeed;
    private final double acceleration;
    private double speed;
    public MobileEntity(double maxspeed,double acceleration){
        super();
        this.acceleration=acceleration;
        this.MaxSpeed=maxspeed;
        this.speed=0;
    }
    public void Move( double friction){
        double newspeed=(getSpeed()+(1-friction)*getAcceleration());
        setSpeed(newspeed);
        if(this.speed < this.MaxSpeed){
                super.setLocation(getLocation().offset(getSpeed(),0));
            }
        else{
                setSpeed(getMaxSpeed());
                super.setLocation(getLocation().offset(getSpeed(),0));
            }
        }

    public Point getLocation(){
        return  super.getLocation();
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getMaxSpeed() {
        return MaxSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed=speed;
    }
}