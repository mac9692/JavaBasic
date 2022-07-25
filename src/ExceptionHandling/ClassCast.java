package ExceptionHandling;

class Board {
}

class PBoard extends Board {
}

public class ClassCast {
    public static void main(String[] args) {
        Board pboard1 = new PBoard();
        PBoard pBoard2 = (PBoard) pboard1;

        System.out.println("-----");

        Board board1 = new Board();
        PBoard board2 = (PBoard) board1;
    }
}
