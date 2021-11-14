package com.codegym.games.minesweeper;

import com.codegym.engine.cell.*;

public class MinesweeperGame extends Game {

    private final static int SIDE = 9;

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE,SIDE);
    }
}
