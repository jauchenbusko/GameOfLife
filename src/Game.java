

public class Game {

    private Board gameboard;
    int length,width;
    private final boolean Alive = true;

    public Game(int length, int width){
        gameboard = new Board(length,width);
        this.length = length;
        this.width = width;
    }

    public void setAlive(int l, int w){
        if(!gameboard.getLifeStatus(l,w))
            gameboard.changeLifeStatus(l, w);
        else
            System.out.println("\nCell is already alive");
    }

    public void print(){
        gameboard.display();
    }



    public void nextMove(){

        Board temp = new Board(length, width);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (!gameboard.getLifeStatus(j,i) && gameboard.checkAliveNeighbors(j, i) != 3)
                    temp.setLifeStatus(!Alive,j,i);

                else if(!gameboard.getLifeStatus(j,i) && gameboard.checkAliveNeighbors(j, i) == 3)
                    temp.setLifeStatus(Alive,j,i);

                else if (gameboard.getLifeStatus(j,i) && gameboard.checkAliveNeighbors(j,i) < 2)
                    temp.setLifeStatus(!Alive,j,i);

                else if (gameboard.getLifeStatus(j,i)
                        && gameboard.checkAliveNeighbors(j,i) >= 2
                        && gameboard.checkAliveNeighbors(j,i) < 4)
                   temp.setLifeStatus(Alive,j,i);

                else if (gameboard.getLifeStatus(j,i) && gameboard.checkAliveNeighbors(j,i) > 4)
                    temp.setLifeStatus(!Alive,j,i);
            }
        }

       gameboard = temp;
    }

}
