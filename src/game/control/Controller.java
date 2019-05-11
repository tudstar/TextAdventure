package game.control;

import game.model.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    public TextArea textAreaGameOutput;
    public TextField textfieldCommand;

    private Game game;
    private  Player player;
    public void initialize() {
        System.out.println("test");
        game = new Game(10);
        Key key = new Key();
        Door door = new Door(key);
        Player player = new Player();

        game.placeOnBoar(key,2,3);
        game.placeOnBoar(door,1,5);
        game.placeOnBoar(player,5,5);
        player.setPosition(5,5);

        System.out.print(  game.displayBoard());
        textAreaGameOutput.appendText(game.displayBoard());

        game.removeFromBoard(2,3);
        System.out.println(game.displayBoard());
        textAreaGameOutput.appendText(game.displayBoard());

        game.placeOnBoar(key,2,3);
        System.out.println(game.displayBoard());
        textAreaGameOutput.appendText(game.displayBoard());
        game.movePlayer(player,1,5);
        System.out.println(game.displayBoard());
        textAreaGameOutput.appendText(game.displayBoard());
    }


    public void processCommand(KeyEvent keyEvent) {
        if(keyEvent.getCode().equals(KeyCode.ENTER)) {
            GameStrategy.processCommand(textfieldCommand.getText(), game, player);
            textfieldCommand.clear();
            textAreaGameOutput.appendText(game.displayBoard()+ "\n");
        }
    }
}
