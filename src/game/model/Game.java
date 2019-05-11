package game.model;

public class Game {
    private Object[][] gameBoard;

    /**
     * @param gameBoardSize
     */


    public Game(int gameBoardSize) {
        gameBoard = new Object[gameBoardSize][gameBoardSize];
    }

    /**
     * This method will add an object to the board in the given position
     *
     * @param obj        to place
     * @param vertical   position
     * @param horizontal position
     * @return true if the object can be placed; false if there is already an object
     * or throw ArrayIndexOutOfBoundsException is the position are outside the limits
     * the board
     */


    public boolean placeOnBoar(Object obj, int vertical, int horizontal) {
        if(vertical >= gameBoard.length || horizontal >= gameBoard.length) {
            throw new IllegalArgumentException("Should be smaller than" + gameBoard.length);
        }
        if(gameBoard[horizontal][vertical] !=null) {
            return false;
        } else{
            gameBoard[horizontal][vertical] = obj;
        }
        return true;
    }

    /**
     * Removes an object from the board
     *
     * @param vertical   position
     * @param horizontal position
     * @return the object to remove, null is the cell is empty;
     */

    public Object removeFromBoard(Object obj, int vertical, int horizontal) {

        return null;
    }
    /* door key player
            tree
            a cell is maximum 10 spaces size. we put an artifact in the midle of the cell
     */
private final int CELL_DISPLAY_SIZE = 10;

private String generateSpaces(int number){
    String spaces = "";
    for (int i=0; i < number; i++){
        spaces+= " ";
    }
    return spaces;
}
private  String centerCell(String input){
    String output =" ";
    output += generateSpaces((CELL_DISPLAY_SIZE - input.length())/2)+
            input +
            generateSpaces((CELL_DISPLAY_SIZE - input.length())/2);
    return output;
}

    public String displayBoard() {
        String toReturn = "";
        for (int i = 0; i < gameBoard.length; i++) {
            toReturn += centerCell( (i+1)+"");
            for (int j = 0; j < gameBoard.length; j++) {
                if (gameBoard[i][j] == null) {
                    toReturn += generateSpaces(CELL_DISPLAY_SIZE);
                } else {
                    toReturn += centerCell(gameBoard[i][j].getClass().getSimpleName());
                }
            }
            toReturn += "\n";
        }
        return toReturn;
    }
}