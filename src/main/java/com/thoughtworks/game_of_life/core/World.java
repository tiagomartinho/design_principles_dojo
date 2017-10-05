package com.thoughtworks.game_of_life.core;

import java.util.HashMap;
import java.util.Map;

import static com.thoughtworks.game_of_life.core.CellStatus.*;
import static com.thoughtworks.game_of_life.core.CellStatus.ALIVE;
import static com.thoughtworks.game_of_life.core.Location.allWorldLocations;

public class World {

    public static final int DEFAULT_WIDTH = 10;
    public static final int DEFAULT_HEIGHT = 10;


    Map<Location, Cell> cells;

    public World() {
        cells = initCells();
    }

    public void advance() {
        Map<Location, Cell> newCells = initCells();

        for (Location location : allWorldLocations(DEFAULT_WIDTH, DEFAULT_HEIGHT)) {
            switch (cells.get(location).nextStatus(numberOfAliveNeighbours(location))) {
                case ALIVE:
                    newCells.put(location, new AliveCell());
                    break;
                case DEAD:
                    newCells.put(location, new DeadCell());
                    break;
                default:
                    break;
            }
        }
        cells = newCells;
    }

    public boolean isEmpty() {
        for (Cell cell : cells.values()) {
            if (cell.getStatus() == ALIVE) {
                return false;
            }
        }
        return true;
    }

    public void setLiving(Location location) {
        cells.put(location, new AliveCell());
    }

    public boolean isAlive(Location location) {
        return cells.get(location).getStatus() == ALIVE;
    }

    private Map<Location, Cell> initCells() {
        Map<Location, Cell> cells = new HashMap<Location, Cell>();
        for (Location location : allWorldLocations(DEFAULT_WIDTH, DEFAULT_HEIGHT)) {
            cells.put(location, new DeadCell());
        }
        return cells;
    }

    public int numberOfAliveNeighbours(Location l) {
        int aliveNeighbours = 0;

        for (Location location : l.allNeighbours(DEFAULT_WIDTH, DEFAULT_HEIGHT)) {
            if (cells.get(location).getStatus() == ALIVE) {
                aliveNeighbours++;
            }
        }
        return aliveNeighbours;
    }

    public boolean isZombie(Location location) {
        return cells.get(location).getStatus() == ZOMBIE;
    }
}
