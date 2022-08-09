package com.cornelisdemooij.chessapi.chess;

import com.cornelisdemooij.chessapi.ddd.ValueObject;

public class Position extends ValueObject {
    Integer row;
    Integer column;

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    @Override
    protected Object[] GetAtomicValues() {
        return new Integer[]{row, column};
    }
}
