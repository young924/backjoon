import java.util.Scanner;

public class p20057 {
    public static int N;
    public static int[][] board;
    public static int dir;
    public static int r, c;
    public static int outSum;

    public static int[][] wX = {
            { -1, 1, -2, 2, -1, 1, -1, 1, 0 }, // Left
            { -1, -1, 0, 0, 0, 0, 1, 1, 2 }, // Down
            { -1, 1, -2, 2, -1, 1, -1, 1, 0 }, // Right
            { 1, 1, 0, 0, 0, 0, -1, -1, -2 }, // Up
    };
    public static int[][] wY = {
            { 1, 1, 0, 0, 0, 0, -1, -1, -2 }, // Left
            { 1, -1, 2, -2, 1, -1, 1, -1, 0 }, // Down
            { -1, -1, 0, 0, 0, 0, 1, 1, 2 }, // Right
            { 1, -1, 2, -2, 1, -1, 1, -1, 0 }, // Up
    };
    public static int[] percent = { 1, 1, 2, 2, 7, 7, 10, 10, 5 };

    public static int[] dX = { 0, 1, 0, -1 };
    public static int[] dY = { -1, 0, 1, 0 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];

        r = N/2;
        c = N/2;
        dir = 0;
        outSum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        simulation();
        System.out.println(outSum);
    }

    public static void simulation() {
        for (int i = 1; i < N; i++) {
            move(i);
            dir = (dir + 1) % 4;
            move(i);
            dir = (dir + 1) % 4;
        }
        move(N-1);
    }

    public static void move(int distance) {
        for (int i = 1; i <= distance; i++) {

            // spread

            r += dX[dir];
            c += dY[dir];

        }
    }
}
