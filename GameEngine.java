package GameOfLife;

public class GameEngine {

   // private Board board;
    private static int[] ROW_DIRECTION = {-1,-1,-1,0,0,1,1,1}; // cur cell to find 8 direction cell index
    private static int[] COL_DIRACTION = {-1,0,1,-1,1,-1,0,1};


    public Board nextGeneration(Board board){

        Board nextBoard = new Board(board.getRows(), board.getCols());

        for(int row = 0; row < board.getRows(); row++){

            for(int col = 0; col < board.getCols(); col++){

                Cell currCell = board.getCell(row,col);

                int countAliveNeigbours = countAliveNeigbours(board,row,col);

                if(currCell.isAlive()){

                    if(countAliveNeigbours == 2 || countAliveNeigbours == 3){
                        nextBoard.getCell(row,col).setAlive(true);
                    }
                } else {

                    if(countAliveNeigbours == 3){
                        nextBoard.getCell(row,col).setAlive(true);
                    }
                }
            }
        }

        return nextBoard;
    }

    private int countAliveNeigbours(Board board, int row, int col){
        int aliveneigbours = 0;

        for(int i = 0; i < 8; i++){
            int newRow = row + ROW_DIRECTION[i];
            int newCol = col + COL_DIRACTION[i];

            if(isValidCell(board,newRow,newCol) && board.getCell(newRow,newCol).isAlive()){
                aliveneigbours++;
            }
        }

        return aliveneigbours;

    }
    // find the row,col is valid or not to avoid overflow error
    private boolean isValidCell(Board board, int row, int col){

        return row >= 0 && row < board.getRows() &&
                col >= 0 && col < board.getCols();

    }

}
