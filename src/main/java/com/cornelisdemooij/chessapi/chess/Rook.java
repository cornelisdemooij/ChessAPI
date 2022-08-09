package com.cornelisdemooij.chessapi.chess;

import com.cornelisdemooij.chessapi.ddd.Entity;

import java.util.Objects;

public class Rook extends Entity<Integer> implements Piece {
    Position position;
    Color color;

    private Rook(Integer pieceId) {
        super(pieceId);
    }

    public Rook(Integer pieceId, Position initialPosition, Color color) {
        this(pieceId);
        position = initialPosition;
        this.color = color;
    }

    @Override
    public boolean isMoveValid(Position targetPosition) {
        return Objects.equals(targetPosition.row, position.row)
            || Objects.equals(targetPosition.column, position.column);
    }

    @Override
    public void move(Position targetPosition) {
        this.position = targetPosition;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Position getCurrentPosition() {
        return position;
    }
}
