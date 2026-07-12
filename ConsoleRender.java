package GameOfLife;

public class ConsoleRender {

    public void print(Board board){

        for(int row = 0; row < board.getRows(); row++){

            for(int col = 0; col < board.getCols(); col++){

                Cell cell = board.getCell(row,col);

                if(cell.isAlive()){
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}
