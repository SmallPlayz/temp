import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        new ChessGame();
    }
}

class ChessGame {
    JFrame frame;
    JLabel chessBoard;
    private static int[][] chessArr;

    private static HashMap<String, String> moveBoard;
    ChessGame() {
        frame = new JFrame("Chess");
        frame.setSize(694, 717);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        chessBoard = new JLabel();
        chessBoard.setBounds(0, 0, 680, 680);
        chessBoard.setIcon(new ImageIcon("src/chessBoard.png"));
        frame.add(chessBoard);

        chessArr = new int[8][8];

        moveBoard = new HashMap<>();

        fillMoveBoard();

        printBoard();

        fillBoard();

        printBoard();

        frame.setVisible(true);
    }

    private void fillMoveBoard() {
        moveBoard.put("a1", "X,Y");
        moveBoard.put("a2", "X,Y");
        moveBoard.put("a3", "X,Y");
        moveBoard.put("a4", "X,Y");
        moveBoard.put("a5", "X,Y");
        moveBoard.put("a6", "X,Y");
        moveBoard.put("a7", "X,Y");
        moveBoard.put("a8", "X,Y");

        moveBoard.put("b1", "X,Y");
        moveBoard.put("b2", "X,Y");
        moveBoard.put("b3", "X,Y");
        moveBoard.put("b4", "X,Y");
        moveBoard.put("b5", "X,Y");
        moveBoard.put("b6", "X,Y");
        moveBoard.put("b7", "X,Y");
        moveBoard.put("b8", "X,Y");

        moveBoard.put("c1", "X,Y");
        moveBoard.put("c2", "X,Y");
        moveBoard.put("c3", "X,Y");
        moveBoard.put("c4", "X,Y");
        moveBoard.put("c5", "X,Y");
        moveBoard.put("c6", "X,Y");
        moveBoard.put("c7", "X,Y");
        moveBoard.put("c8", "X,Y");

        moveBoard.put("d1", "X,Y");
        moveBoard.put("d2", "X,Y");
        moveBoard.put("d3", "X,Y");
        moveBoard.put("d4", "X,Y");
        moveBoard.put("d5", "X,Y");
        moveBoard.put("d6", "X,Y");
        moveBoard.put("d7", "X,Y");
        moveBoard.put("d8", "X,Y");

        moveBoard.put("e1", "X,Y");
        moveBoard.put("e2", "X,Y");
        moveBoard.put("e3", "X,Y");
        moveBoard.put("e4", "X,Y");
        moveBoard.put("e5", "X,Y");
        moveBoard.put("e6", "X,Y");
        moveBoard.put("e7", "X,Y");
        moveBoard.put("e8", "X,Y");

        moveBoard.put("f1", "X,Y");
        moveBoard.put("f2", "X,Y");
        moveBoard.put("f3", "X,Y");
        moveBoard.put("f4", "X,Y");
        moveBoard.put("f5", "X,Y");
        moveBoard.put("f6", "X,Y");
        moveBoard.put("f7", "X,Y");
        moveBoard.put("f8", "X,Y");

        moveBoard.put("g1", "X,Y");
        moveBoard.put("g2", "X,Y");
        moveBoard.put("g3", "X,Y");
        moveBoard.put("g4", "X,Y");
        moveBoard.put("g5", "X,Y");
        moveBoard.put("g6", "X,Y");
        moveBoard.put("g7", "X,Y");
        moveBoard.put("g8", "X,Y");

        moveBoard.put("h1", "X,Y");
        moveBoard.put("h2", "X,Y");
        moveBoard.put("h3", "X,Y");
        moveBoard.put("h4", "X,Y");
        moveBoard.put("h5", "X,Y");
        moveBoard.put("h6", "X,Y");
        moveBoard.put("h7", "X,Y");
        moveBoard.put("h8", "X,Y");
    }

    private void fillBoard() {
        for(int i = 0; i<8; i++) {
            chessArr[1][i] = 1;
            chessArr[6][i] = -1;
        }
        chessArr[0][2] = 4;
        chessArr[7][2] = 4;
        chessArr[0][3] = 5;
        chessArr[7][3] = 5;
        chessArr[0][4] = 6;
        chessArr[7][4] = 6;
    }

    public void printBoard(){
        for(int[] i : chessArr) {
            for (int j : i)
                System.out.print(j + "\t");
            System.out.println();
        }
        System.out.println();
    }
}