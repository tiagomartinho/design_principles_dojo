package com.thoughtworks.game_of_life.core;

public interface Cell {
    boolean willBeAlive(int numberOfAliveNeighbours);
    CellStatus getStatus();
    CellStatus nextStatus(int numberOfAliveNeighbours);
}
