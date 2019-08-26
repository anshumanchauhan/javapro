import java.util.Random;

public class minesweep {
    public static void main(String[] args) {


        Random rand = new Random();

        int[][] mine = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                mine[i][j] = 0;
            }
        }

        int count = 0;
        int xPoint;
        int yPoint;
        while (count <= 10) {
            xPoint = rand.nextInt(9);
            yPoint = rand.nextInt(9);
            if (mine[xPoint][yPoint] != -1) {
                mine[xPoint][yPoint] = -1;  // -1 represents bomb
                count++;
            }
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mine[i][j] == -1) {
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                         
                            try {
                                if (mine[i + k][j + l] != -1) {
                                    mine[i + k][j + l] += 1;
                                }
                            } catch (Exception e) {
                                
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mine[i][j] + "   ");
            }
			System.out.print("\n");
        }
    }
}



