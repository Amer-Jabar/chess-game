package org.example.chess;

public class Cell {
    final int positionX;
    final int positionY;
    Actor actor;
    boolean isEmpty;

    public Cell(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void removeActor() {
        this.actor = null;
    }

    public int[] getPositions() {
        return new int[]{positionX, positionY};
    }
}
