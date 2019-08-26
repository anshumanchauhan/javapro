public class Mines {
    public static void main (String args[])
    {
        Mineswee ms =new Mineswee();
        ms.initialiseGame(9);
        ms.placeBombs(10);
        ms.placeNum(9);
        ms.checkMines(2,3);

    }
}
