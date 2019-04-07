package game.entities.sportsman;

import game.enums.Discipline;
import game.enums.Gender;

public class Snowboarder extends WinterSportsman {
    public Snowboarder(String name, double age, Gender gender, double acc, double maxspeed, Discipline discipline){
        super(age,name,gender,discipline,maxspeed,acc);
    }
    public String toString(){
        return "SnowBoarder "+super.getName();
    }
}
