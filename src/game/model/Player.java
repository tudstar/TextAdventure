package game.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    /**
     * Items that the player can collect
     */
   private List<CollectibleItem> artifacts;

    /**
     * Create a player that has a list of collected items
     */
    public Player()
    {
        artifacts = new ArrayList<>();

    }
public void collect(CollectibleItem item) {
        artifacts.add(item);
}

}


