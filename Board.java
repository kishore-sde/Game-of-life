package GameOfLife;

public class Board {

    private Cell[][] cells;
    private int rows;
    private int cols;

    public Board(int rows, int cols){

        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];

        //Initialize every cell
        for(int row = 0; row < rows; row++){

            for(int col = 0; col < cols; col++){

                cells[row][col] = new Cell(false);

            }
        }
    }

    public Cell getCell(int row, int col){
        return cells[row][col];
    }

    public void setCell(int row, int col, Cell cell){
        cells[row][col] = cell;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public Cell[][] getCells(){
        return cells;
    }

}
