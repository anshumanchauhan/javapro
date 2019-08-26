import java.util.Random;
import java.util.Scanner;


public class Mineswee{

    Random rand = new Random();
    int[][] mine;


    public void initialiseGame(int x) {

          mine = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*" + "   ");

            }
			System.out.print("\n");
        }
    }


    public void placeBombs(int y) {
        int count = 0;
        int xPoint;
        int yPoint;
        while (count < y) {
            xPoint = rand.nextInt(9);
            yPoint = rand.nextInt(9);
            if (mine[xPoint][yPoint] != -1) {
                mine[xPoint][yPoint] = -1;  // -1 represents bomb
                count++;
            }
			
        }
    }

     public void placeNum(int x) {

         for (int i = 0; i < x; i++) {
             for (int j = 0; j < x; j++) {
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

     }
     public void printing(){
        for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(mine[i][j] + "   ");
        }
        System.out.print("\n");
    }
}
public void checkMines(int x,int y)
{
    if(mine[x][y]== -1)
    {
        System.out.println("game over");
		printing();
    }
	else {
		printing();
		System.out.println("continue playing");
		Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int j = in.nextInt();
        checkMines(i,j);
		
	}
	
     

}

}




