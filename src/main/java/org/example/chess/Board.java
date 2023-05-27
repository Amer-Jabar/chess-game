package org.example.chess;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.chess.ActorPositions.ACTOR_POSITIONS;

public class Board {

    private static final int NUMBER_OF_ROWS = 8;
    private static final int NUMBER_OF_COLUMNS = 8;
    private static final int NUMBER_OF_CELLS = NUMBER_OF_ROWS * NUMBER_OF_COLUMNS;

    private final Cell[] boardCells;

    public Board() {
        boardCells = new Cell[NUMBER_OF_CELLS];
        for (int x = 0; x < NUMBER_OF_CELLS; x++)
            boardCells[x] = new Cell(x % NUMBER_OF_ROWS, x / NUMBER_OF_ROWS);
        ACTOR_POSITIONS.forEach(actorPosition -> {
            boardCells[actorPosition.coordinate.positionY * NUMBER_OF_ROWS
                + actorPosition.coordinate.positionX % NUMBER_OF_COLUMNS].actor = actorPosition.actor;
            boardCells[0].isEmpty = false;
        });
    }

    public List<List<String>> getBoardCellPositions() {
        ArrayList<ArrayList<String>> mappedBoardCells = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < NUMBER_OF_ROWS; i++) {
            mappedBoardCells.add(new ArrayList<String>());
            for (int j = 0; j < NUMBER_OF_COLUMNS; j++) {
                mappedBoardCells.get(i).add(String.format("(%s::%s)", boardCells[i * NUMBER_OF_ROWS + j].positionX, boardCells[i * NUMBER_OF_ROWS + j].positionY));
            }
        }
        return mappedBoardCells.stream().map(strings -> strings.stream().toList()).toList();
    }

    public List<List<String>> getBoardCellActors() {
        ArrayList<ArrayList<String>> mappedBoardCells = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < NUMBER_OF_ROWS; i++) {
            mappedBoardCells.add(new ArrayList<String>());
            for (int j = 0; j < NUMBER_OF_COLUMNS; j++) {
                mappedBoardCells.get(i).add(boardCells[i * NUMBER_OF_ROWS + j].actor == null ? "-" : String.format("%s", boardCells[i * NUMBER_OF_ROWS + j].actor.shortenedName));
            }
        }
        return mappedBoardCells.stream().map(strings -> strings.stream().toList()).toList();
    }

    public void play() {
        int previousCellIndex = 51;
        int nextCellIndex = 35;
        Actor currentActor = boardCells[previousCellIndex].actor;

        boardCells[previousCellIndex].removeActor();
        boardCells[previousCellIndex].isEmpty = true;

        boardCells[nextCellIndex].actor = currentActor;
        boardCells[nextCellIndex].actor.currentCell = boardCells[nextCellIndex];
        boardCells[nextCellIndex].isEmpty = false;
    }
}