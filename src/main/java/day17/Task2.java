package day17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        ChessPiece[][] chessPosition = {{ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
//                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
//                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
//                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
//                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}};
        System.out.println("Введите количество ячеек в строке");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ChessPiece[][] chessPosition = generateChessPosition(a);
        scanner.close();
        ChessBoard chessBoard = new ChessBoard(chessPosition);
        chessBoard.print();

    }

    public static ChessPiece[][] generateChessPosition(int length) {
        ChessPiece[][] chessPosition = new ChessPiece[length][length];
        figurePosition(ChessPiece.PAWN_WHITE, chessPosition);
        figurePosition(ChessPiece.PAWN_BLACK, chessPosition);
        figurePosition(ChessPiece.KING_WHITE, chessPosition);
        figurePosition(ChessPiece.KING_BLACK, chessPosition);
        figurePosition(ChessPiece.KNIGHT_BLACK, chessPosition);
        figurePosition(ChessPiece.KNIGHT_WHITE, chessPosition);
        figurePosition(ChessPiece.BISHOP_BLACK, chessPosition);
        figurePosition(ChessPiece.BISHOP_WHITE, chessPosition);
        figurePosition(ChessPiece.QUEEN_BLACK, chessPosition);
        figurePosition(ChessPiece.QUEEN_WHITE, chessPosition);
        figurePosition(ChessPiece.ROOK_BLACK, chessPosition);
        figurePosition(ChessPiece.ROOK_WHITE, chessPosition);

        for (int i = 0; i < chessPosition.length; i++) {
            for (int j = 0; j < chessPosition.length; j++) {
                if (chessPosition[i][j] == null) {
                    chessPosition[i][j] = ChessPiece.EMPTY;
                }
            }
        }
        return chessPosition;
    }

    public static ChessPiece[][] figurePosition(ChessPiece chessPiece, ChessPiece[][] chessPosition) {
        System.out.println("Введите положения " + chessPiece + " в формате 'номер строки' : 'номер столбца' пробел  'номер строки' : 'номер столбца' и т.д.");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.equals("")) return chessPosition;
        String[] splitLine = line.split(" ");
        for (String x : splitLine) {
            String position[] = x.split(":");
            int a = Integer.parseInt(position[0]);
            int b = Integer.parseInt(position[1]);
            chessPosition[a][b] = chessPiece;
        }
        return chessPosition;

    }
}
