package GameOfLife;

public class Game {

    private Board board;

    private GameEngine gameEngine;

    private ConsoleRender render;

    public Game() {

        board = new Board(25,25);

        gameEngine = new GameEngine();

        render = new ConsoleRender();

        initializeGlider();  // as per middle of the board

    }

    private void initializeGlider() {

        board.getCell(12, 13).setAlive(true);
        board.getCell(13, 14).setAlive(true);
        board.getCell(14, 12).setAlive(true);
        board.getCell(14, 13).setAlive(true);
        board.getCell(14, 14).setAlive(true);

    }

    public void start(int generations) {

        System.out.println("Generation 0");
        render.print(board);

        for (int i = 1; i <= generations; i++) {

            board = gameEngine.nextGeneration(board);

            System.out.println("Generation " + i);

            render.print(board);
        }
    }

}
