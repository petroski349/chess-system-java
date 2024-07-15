package chass.pieces;

import boardGame.Board;
import chass.ChessPiece;
import chass.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return  "K";
    }
}
