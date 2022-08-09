package com.cornelisdemooij.chessapi.chess;

public interface Piece {
    public boolean isMoveValid(Position targetPosition);
    public void move(Position targetPosition);
    public Color getColor();
    public Position getCurrentPosition();
}
