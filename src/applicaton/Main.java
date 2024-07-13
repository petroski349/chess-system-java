package applicaton;

import boardGame.Board;
import boardGame.Position;
import chass.ChessMatch;

public class Main {
    public static void main(String[] args) {


        ChessMatch chessMatch =  new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}