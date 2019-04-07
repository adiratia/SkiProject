package game.competition;

import game.arena.IArena;
import game.arena.WinterArena;
import utilities.ValidationUtils;

import java.util.ArrayList;
import java.lang.RuntimeException;

public abstract class Competition {
    private IArena arena;
    private int MaxCompitetors;
    private ArrayList<Competitor> activeCompetitors;
    private ArrayList<Competitor> finishedCompetitors;

    public Competition(IArena arena,int maxCompetitors){
        this.arena=arena;
        this.MaxCompitetors=maxCompetitors;
        this.activeCompetitors=new ArrayList<Competitor>();
        this.finishedCompetitors=new ArrayList<Competitor>();
    }
    public abstract boolean isValidCompetitor(Competitor competitor);
    public void addCompetitor(Competitor competitor){
        ValidationUtils.assertNotNull(competitor);
            competitor.initRace();
            if (this.activeCompetitors.size() == this.MaxCompitetors) {
                throw new IllegalStateException(" WinterArena is full max =" + getMaxCompitetors());
            }
            if (!(isValidCompetitor(competitor))) {
                throw new IllegalArgumentException("Invalid competitor " + competitor);
            }
            this.activeCompetitors.add(competitor);
            competitor.initRace();
        }
    public void playTurn(){
        ArrayList<Competitor> temp=new ArrayList<Competitor>();

        for (int i=0;i<activeCompetitors.size();i++){
            temp.add(activeCompetitors.get(i));
        }
        if(hasActiveCompetitors()) {
            for (int i = 0; i < activeCompetitors.size(); i++) {
                activeCompetitors.get(i).Move(this.arena.getFriction());
                if (this.arena.isFinished(activeCompetitors.get(i))) {
                    finishedCompetitors.add(activeCompetitors.get(i));
                    temp.remove(i);
                }
            }
            activeCompetitors.clear();
            for(int i=0;i<temp.size();i++){
                activeCompetitors.add(temp.get(i));
            }
        }
        }

    public boolean hasActiveCompetitors(){
        if (this.activeCompetitors.isEmpty())
            return  false;
        return true;
    }

    public IArena getArena() {
        return arena;
    }

    public void setArena(IArena arena) {
        this.arena = arena;
    }

    public int getMaxCompitetors() {
        return MaxCompitetors;
    }

    public void setMaxCompitetors(int maxCompitetors) {
        MaxCompitetors = maxCompitetors;
    }

    public ArrayList<Competitor> getActiveCompetitors() {
        return activeCompetitors;
    }

    public void setActiveCompetitors(ArrayList<Competitor> activeCompetitors) {
        this.activeCompetitors = activeCompetitors;
    }

    public ArrayList<Competitor> getFinishedCompetitors() {
        return finishedCompetitors;
    }

    public void setFinishedCompetitors(ArrayList<Competitor> finishedCompetitors) {
        this.finishedCompetitors = finishedCompetitors;
    }
}
