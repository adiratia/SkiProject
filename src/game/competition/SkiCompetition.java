package game.competition;

import game.arena.WinterArena;
import game.entities.sportsman.Skier;
import game.entities.sportsman.WinterSportsman;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class SkiCompetition extends WinterCompetition {

    public SkiCompetition(WinterArena arena, int maxCompetitors, Discipline discipline, League league, Gender gender){
        super(arena,maxCompetitors,discipline,league,gender);
    }

    public boolean isValidCompetitor(Competitor competitor) {
        if (competitor instanceof Skier){
            if (super.getLeague().isInLeague(((WinterSportsman) competitor).getAge())){
                if (super.getGender()==((WinterSportsman) competitor).getGender()){
                    if(super.getDiscipline()==((WinterSportsman) competitor).getDiscipline()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

