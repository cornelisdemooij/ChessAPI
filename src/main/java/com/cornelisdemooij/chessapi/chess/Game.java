package com.cornelisdemooij.chessapi.chess;

import com.cornelisdemooij.chessapi.ddd.Entity;

public class Game extends Entity<Integer> { // Aggregate, root entity


    public Game(int gameId) {
        super(gameId);
    }
}
