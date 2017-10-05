package com.thoughtworks.game_of_life.core;

import static com.thoughtworks.game_of_life.core.CellStatus.*;

public class DeadCell implements Cell{

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean willBeAlive(int numberOfAliveNeighbours) {
        return numberOfAliveNeighbours == 3;
    }

    @Override
    public CellStatus getStatus() {
        return DEAD;
    }
}
