package com.thoughtworks.game_of_life.core;

import static com.thoughtworks.game_of_life.core.CellStatus.ALIVE;
import static com.thoughtworks.game_of_life.core.CellStatus.DEAD;

public class AliveCell implements Cell{

    @Override
    public CellStatus getStatus() {
        return ALIVE;
    }

    @Override
    public CellStatus nextStatus(int numberOfAliveNeighbours) {
        if(numberOfAliveNeighbours == 2 || numberOfAliveNeighbours == 3) {
            return ALIVE;
        } else {
            return DEAD;
        }
    }
}
