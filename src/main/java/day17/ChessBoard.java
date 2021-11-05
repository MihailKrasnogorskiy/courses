package day17;

import java.util.zip.DataFormatException;

public class ChessBoard {
    private ChessPiece[][] chessPosition;
    static final int NUMBER_OF_FIELDS = 8;

    public ChessBoard(ChessPiece[][] chessPosition) {
        try {
            if (chessPosition.length != NUMBER_OF_FIELDS) throw new DataFormatException();
            for (int i = 0; i < NUMBER_OF_FIELDS; i++) {
                if (chessPosition[i].length != NUMBER_OF_FIELDS) throw new DataFormatException();
            }
            this.chessPosition = chessPosition;
        } catch (DataFormatException e) {
            System.out.println("Шахматная доска должна быть 8 х 8 клеток");
        }
    }

    public void print() {
        try {
            if (this.chessPosition == null) throw new NullPointerException();
            for (int i = 0; i < NUMBER_OF_FIELDS; i++) {
                for (int j = 0; j < NUMBER_OF_FIELDS; j++) {
                    System.out.print(this.chessPosition[i][j]);
                }
                System.out.println();
            }
        } catch (NullPointerException e) {
            System.out.println("Положение фигур не задано, доска должна быть 8 х 8 клеток");
        }
    }
}
