

public class Game {

    private Board gameboard;
    int l,w;

    public Game(int l, int w){
        gameboard = new Board(l,w);
        this.l = l;
        this.w = w;
    }

    public void setAlive(int l, int w){
        if(!gameboard.getLifeStatus(l,w))
            gameboard.changeLifeStatus(l, w);
        else
            System.out.println("Cell is already alive");
    }


    public void nextMove(){

        Board temp = gameboard;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {

            }
        }

    }

    public static void main(String[] args){



    }

}
