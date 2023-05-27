package org.example.chess;

public abstract class Actor {
    public String name;
    public char shortenedName;
    public Side side;
    public Cell currentCell;

    public Actor(String name, char shortenedName, Side side) {
        this.name = name;
        this.shortenedName = shortenedName;
        this.side = side;
    }

    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }

    public String toString() {
        return String.valueOf(shortenedName);
    }
}
