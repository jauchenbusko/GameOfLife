

public class Board {

    private boolean[][] board;
    private int length, width;

    public Board(int length, int width){
        board = new boolean[width][length];
        this.length = length;
        this.width = width;
        for (int i = 0; i < width; i++)
            for (int j = 0; j < length; j++)
                board[i][j] = false;
    }

    public boolean getLifeStatus(int length, int width){
        return board[width][length];
    }

    public void changeLifeStatus(int length, int width){
        board[width][length] = !getLifeStatus(length,width);
    }

    public void display(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (getLifeStatus(j,i))
                    System.out.print(" x ");
                else
                    System.out.print(" . ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args){

        Board board = new Board(6,8);

        System.out.println(board.getLifeStatus(2,2));
        board.changeLifeStatus(2,1);
        board.changeLifeStatus(3,2);
        System.out.println(board.getLifeStatus(2,1));

        board.display();

    }

}

