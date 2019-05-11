package game.control;

import game.model.Door;
import game.model.Game;
import game.model.Key;
import game.model.Player;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextArea textAreaGameOutput;
    public TextField testfieldCommand;

    private Game game;
    public  void initialize() {
        System.out.println("test");
        game = new Game(10);
        Key key = new Key();
        Door door = new Door(key);
        Player player= new Player();

        game.placeOnBoar(key, 2, 3);
        game.placeOnBoar(door, 1,5);
        game.placeOnBoar(player, 5,5);

        System.out.println(game.displayBoard());
    }


}
