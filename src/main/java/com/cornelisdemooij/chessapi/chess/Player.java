package com.cornelisdemooij.chessapi.chess;

import com.cornelisdemooij.chessapi.ddd.Entity;

public class Player extends Entity<String> {

    public Player(String username) {
        super(username);
    }
}
