import java.util.Scanner;

public class MineSweeper {
    int rows;
    int columns;
    String[][] mineMap;
    String[][] gameMap;
    int mineNumbers;
    int rowIndex;
    int columnIndex;

    MineSweeper(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.mineMap = new String[rows][columns];
        this.gameMap = new String[rows][columns];
        this.mineNumbers = (rows*columns)/4;
    }

    public void randomNumber() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.mineMap[i][j] = "-";  // Fill with default value
            }
        }

        for (int i = 0; i < this.mineNumbers; i++) {
            int random1 = (int) (Math.random() * this.rows);
            int random2 = (int) (Math.random() * this.columns);
            if (!this.mineMap[random1][random2].equals("*")) {
                this.mineMap[random1][random2] = "*";
            }
        }
    }
    public void mineMap(String[][] map) {
        System.out.println("Location of mines");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================");
    }

    public void gameMap(){
        System.out.println("Initial game map");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void selection(){
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = false;
        while(!isTrue) {
            System.out.print("Enter the row index: ");
            rowIndex = scanner.nextInt();
            System.out.print("Enter the column index: ");
            columnIndex = scanner.nextInt();

            if (rowIndex >= rows || columnIndex >= columns) {
                System.out.println("Out of index.");
                continue;
            }
            if(mineMap[rowIndex][columnIndex].equals("*")){
                System.out.println("Game over!");
                break;
            }
            control();
            if (finish()){
                System.out.println("You Won!");
                break;
            }
        }
    }

    public void control(){
        int counter = 0;
        for (int i = (rowIndex - 1); i <= (rowIndex + 1); i++) {
            for (int j = (columnIndex - 1); j <= (columnIndex + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rows || j >= this.columns) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    counter++;
                }
            }
        }

        this.gameMap[rowIndex][columnIndex] = String.valueOf(counter);
        this.mineMap[rowIndex][columnIndex] = String.valueOf(counter);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void run(){
        randomNumber();
        mineMap(mineMap);
        gameMap();
        selection();
    }
}
