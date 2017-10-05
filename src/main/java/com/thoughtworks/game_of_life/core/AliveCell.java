package com.thoughtworks.game_of_life.core;

import static com.thoughtworks.game_of_life.core.CellStatus.ALIVE;

public class AliveCell implements Cell{

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public boolean willBeAlive(int numberOfAliveNeighbours) {
        return numberOfAliveNeighbours == 2 || numberOfAliveNeighbours == 3;
    }

    @Override
    public CellStatus getStatus() {
        return ALIVE;
    }
}
