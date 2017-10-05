package com.thoughtworks.game_of_life.core;

public interface Cell {
    CellStatus getStatus();
    CellStatus nextStatus(int numberOfAliveNeighbours);
}
