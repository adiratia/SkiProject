package game.arena;
import game.entities.*;

public interface IArena {
    public double getFriction();
    public boolean isFinished(IMobileEntity me);

}
