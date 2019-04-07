package game.competition;
import game.arena.WinterArena;
import game.entities.sportsman.WinterSportsman;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public abstract class WinterCompetition extends Competition {
    private Discipline discipline;
    private League league;
    private Gender gender;
    public WinterCompetition(WinterArena arena,int maxCompetitors, Discipline discipline, League league, Gender gender){
        super(arena,maxCompetitors);
        this.discipline=discipline;
        this.league=league;
        this.gender=gender;
    }
    public abstract boolean isValidCompetitor(Competitor competitor);

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
