package chass.pieces;

import boardGame.Board;
import chass.ChessPiece;
import chass.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}