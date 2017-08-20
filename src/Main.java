import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter dimensions of field: length and width");

        int length = in.nextInt();
        int width = in.nextInt();

        Game game = new Game(length, width);

        System.out.println("Set start alive sells");
        System.out.println("To stop enter 0 at stop query, to continue another integer number");

        while (true){
            System.out.println("Input coordinates of first alive sell (Starts from 0x0)");

            int l = in.nextInt();
            int w = in.nextInt();

            if ((l >= length || l < 0) || (w >= width || w < 0)){
                System.out.println("This point is out of dimension");
            } else {
                game.setAlive(l, w);

                System.out.println("stop?");
                int stop = in.nextInt();

                if (stop == 0)
                    break;
            }
        }

        System.out.println("Board start conditions");
        System.out.println("");
        game.print();
        System.out.println("Game starts, to stop enter 0, to continue enter another int");

        while (true){

            game.nextMove();
            game.print();

            System.out.println("stop?");
            int stop = in.nextInt();

            if (stop == 0)
                break;
        }

    }
}
