package com.thoughtworks.game_of_life.core;

import static com.thoughtworks.game_of_life.core.CellStatus.ZOMBIE;

public class ZombieCell implements Cell {
    @Override
    public CellStatus getStatus() {
        return ZOMBIE;
    }

    @Override
    public CellStatus nextStatus(int numberOfAliveNeighbours) {
        return ZOMBIE;
    }
}
