package com.cornelisdemooij.chessapi.chess;

import com.cornelisdemooij.chessapi.chess.Color;
import com.cornelisdemooij.chessapi.chess.Piece;
import com.cornelisdemooij.chessapi.chess.Position;
import com.cornelisdemooij.chessapi.chess.Rook;
import com.cornelisdemooij.chessapi.ddd.Entity;

import java.util.ArrayList;
import java.util.List;

public class Board extends Entity<Integer> {
    List<Piece> pieces;

    public Board(Integer boardStateId) {
        super(boardStateId);
        pieces = new ArrayList<>();
        pieces.add(new Rook(0, new Position(0, 0), Color.WHITE));
        pieces.add(new Rook(0, new Position(0, 7), Color.WHITE));
        pieces.add(new Rook(0, new Position(7, 0), Color.BLACK));
        pieces.add(new Rook(0, new Position(7, 7), Color.BLACK));
    }

    public boolean isMoveValid(Color currentColor, Position currentPosition, Position targetPosition) {
        boolean pieceFound = false;
        Piece foundPiece = null;
        for (Piece piece : pieces) {
            if (piece.getColor() == currentColor && piece.getCurrentPosition() == currentPosition) {
                pieceFound = true;
                foundPiece = piece;
            }
        }

        if (foundPiece == null) {
            return false;
        } else {
            return foundPiece.isMoveValid(targetPosition);
        }
    }
}
