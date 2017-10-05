package com.thoughtworks.game_of_life.core;

import static com.thoughtworks.game_of_life.core.CellStatus.*;

public class DeadCell implements Cell {

    @Override
    public CellStatus getStatus() {
        return DEAD;
    }

    @Override
    public CellStatus nextStatus(int numberOfAliveNeighbours) {
        if (numberOfAliveNeighbours >= 4) {
            return ZOMBIE;
        }

        if (numberOfAliveNeighbours == 3) {
            return ALIVE;
        } else {
            return DEAD;
        }
    }
}
