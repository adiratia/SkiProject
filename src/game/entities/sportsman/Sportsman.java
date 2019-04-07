package game.entities.sportsman;

import game.entities.MobileEntity;
import game.enums.Gender;
import utilities.ValidationUtils;

public abstract class Sportsman extends MobileEntity {
    private final String name;
    private final double age;
    private final Gender gender;
    public Sportsman(String name,double age ,Gender gender,double Maxspeed,double acc){
        super(Maxspeed,acc);
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Gender getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
