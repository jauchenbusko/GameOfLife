

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

    public void setLifeStatus(boolean lifeStatus, int length, int width){
        board[width][length] = lifeStatus;
    }

    public void changeLifeStatus(int length, int width){
        board[width][length] = !getLifeStatus(length,width);
    }

    public void display(){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < length; j++) {
                if (getLifeStatus(j,i))
                    System.out.print(" x ");
                else
                    System.out.print(" . ");
            }
            System.out.println();
        }
    }

    public int checkAliveNeighbors(int length, int width) {
        int aliveSells = 0;

        if ((length != 0 && length != this.length-1) && (width != 0 && width != this.width-1)) {
            for (int widthI = width - 1; widthI <= width + 1; widthI++)
                for (int lengthJ = length - 1; lengthJ <= length + 1; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
                return aliveSells;

        } else if (length == 0 && (width !=0 && width != this.width-1)){
            for (int widthI = width - 1; widthI <= width + 1; widthI++)
                for (int lengthJ = length; lengthJ <= length + 1; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;

        } else if (length == this.length-1 && (width != 0 && width != this.width-1)){
            for (int widthI = width - 1; widthI <= width + 1; widthI++)
                for (int lengthJ = length-1; lengthJ <= length; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        } else if ((length != 0 && length!= this.length-1) && width == 0){
            for (int widthI = width; widthI <= width + 1; widthI++)
                for (int lengthJ = length-1; lengthJ <= length+1; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        } else if ((length !=0 && length != this.length-1) && width == this.width-1){
            for (int widthI = width-1; widthI <= width; widthI++)
                for (int lengthJ = length-1; lengthJ <= length+1; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        } else if (length == 0 && width == 0){
            for (int widthI = width; widthI <= width+1; widthI++)
                for (int lengthJ = length; lengthJ <= length+1; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        } else if (length == 0 && width == this.width-1) {
            for (int widthI = width-1; widthI <= width; widthI++)
                for (int lengthJ = length; lengthJ <= length+1; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        } else if (length == this.length-1 && width == 0) {
            for (int widthI = width; widthI <= width+1; widthI++)
                for (int lengthJ = length-1; lengthJ <= length; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        } else if (length == this.length-1 && width == this.width-1) {
            for (int widthI = width-1; widthI <= width; widthI++)
                for (int lengthJ = length-1; lengthJ <= length; lengthJ++) {
                    if (getLifeStatus(lengthJ, widthI)) {
                        if (lengthJ == length && widthI == width)
                            continue;
                        aliveSells++;
                    }
                }
            return aliveSells;
        }

       return 0;
    }






    public static void main(String[] args){

        Board board = new Board(6,5);

        System.out.println(board.getLifeStatus(2,2));
        board.changeLifeStatus(2,1);
        board.changeLifeStatus(3,2);
        board.changeLifeStatus(3,0);
        board.changeLifeStatus(4,0);
        board.changeLifeStatus(0,3);
        board.changeLifeStatus(2,2);
        board.changeLifeStatus(1,2);
        board.changeLifeStatus(4,1);
        board.changeLifeStatus(4,2);
        board.changeLifeStatus(5,2);
        board.changeLifeStatus(3,3);
        board.changeLifeStatus(4,4);
        board.changeLifeStatus(0,1);
        board.changeLifeStatus(1,3);

        System.out.println(board.getLifeStatus(2,1));

        board.display();

        System.out.println(board.checkAliveNeighbors(2,2));

    }

}

