package org.example;

import org.example.chess.Board;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.getBoardCellActors()
            .forEach(System.out::println);
        board.play();
        board.getBoardCellActors()
            .forEach(System.out::println);
    }
}