package game.entities.sportsman;
import game.competition.Competitor;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;
import utilities.Point;

public abstract class WinterSportsman extends Sportsman implements Competitor {
    private Discipline discipline;
    public WinterSportsman(double age, String name, Gender gender,Discipline discipline,double MaxSpeed,double acc){
        super(name,age,gender,MaxSpeed,acc+League.calcAccelerationBonus(age));
        this.discipline=discipline;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
    public void initRace(){
        super.setLocation(new Point(0,0));
        super.setSpeed(0);
    }
}
