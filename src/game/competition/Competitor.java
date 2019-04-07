package game.competition;

import game.entities.IMobileEntity;
import game.entities.MobileEntity;
import game.entities.sportsman.Skier;
import game.entities.sportsman.WinterSportsman;
import game.enums.Discipline;
import game.enums.Gender;
import utilities.Point;

public interface Competitor extends IMobileEntity{
    public void initRace();
}
