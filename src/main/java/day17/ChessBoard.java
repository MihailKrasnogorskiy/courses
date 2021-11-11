package day17;

import java.util.zip.DataFormatException;

public class ChessBoard {
    private ChessPiece[][] chessPosition;

    public ChessBoard(ChessPiece[][] chessPosition) {
        this.chessPosition = chessPosition;
    }

    public void print() {
        for (int i = 0; i < chessPosition.length; i++) {
            for (int j = 0; j < chessPosition.length; j++) {
                System.out.print(this.chessPosition[i][j]);
            }
            System.out.println();
        }
    }
}
