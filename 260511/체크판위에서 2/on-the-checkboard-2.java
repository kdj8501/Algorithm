import java.util.Scanner;
public class Main {
    static int result = 0, R, C;
    static char[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        dfs(0, 0, 0);
        System.out.println(result);
    }
    public static void dfs(int x, int y, int jump) {
        if (x == R - 1 && y == C - 1 && jump == 3) {
            result++;
            return;
        }
        for (int i = x + 1; i < R; i++) {
            for (int j = y + 1; j < C; j++) {
                if (grid[x][y] != grid[i][j]) {
                    dfs(i, j, jump + 1);
                }
            }
        }
    }
}