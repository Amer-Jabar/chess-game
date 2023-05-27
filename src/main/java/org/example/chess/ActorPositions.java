package org.example.chess;

import java.util.List;

public class ActorPositions {
    public static final List<ActorPosition> ACTOR_POSITIONS = List.of(
        new ActorPosition(new Rook(Side.BLACK), new Coordinate(0, 0)),
        new ActorPosition(new Knight(Side.BLACK), new Coordinate(1, 0)),
        new ActorPosition(new Bishop(Side.BLACK), new Coordinate(2, 0)),
        new ActorPosition(new Queen(Side.BLACK), new Coordinate(3, 0)),
        new ActorPosition(new King(Side.BLACK), new Coordinate(4, 0)),
        new ActorPosition(new Bishop(Side.BLACK), new Coordinate(5, 0)),
        new ActorPosition(new Knight(Side.BLACK), new Coordinate(6, 0)),
        new ActorPosition(new Rook(Side.BLACK), new Coordinate(7, 0)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(0, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(1, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(2, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(3, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(4, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(5, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(6, 1)),
        new ActorPosition(new Soldier(Side.BLACK), new Coordinate(7, 1)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(0, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(1, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(2, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(3, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(4, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(5, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(6, 6)),
        new ActorPosition(new Soldier(Side.WHITE), new Coordinate(7, 6)),
        new ActorPosition(new Rook(Side.WHITE), new Coordinate(0, 7)),
        new ActorPosition(new Knight(Side.WHITE), new Coordinate(1, 7)),
        new ActorPosition(new Bishop(Side.WHITE), new Coordinate(2, 7)),
        new ActorPosition(new Queen(Side.WHITE), new Coordinate(3, 7)),
        new ActorPosition(new King(Side.WHITE), new Coordinate(4, 7)),
        new ActorPosition(new Bishop(Side.WHITE), new Coordinate(5, 7)),
        new ActorPosition(new Knight(Side.WHITE), new Coordinate(6, 7)),
        new ActorPosition(new Rook(Side.WHITE), new Coordinate(7, 7))
    );

    static class ActorPosition {
        public Actor actor;
        public Coordinate coordinate;

        public ActorPosition(Actor actor, Coordinate coordinate) {
            this.actor = actor;
            this.coordinate = coordinate;
        }
    }
}