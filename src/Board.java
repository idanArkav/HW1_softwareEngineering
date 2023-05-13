import java.util.Arrays;
public class Board {
private Tile[][] tiles;

public Board (String tileString) {
    String[] rows = tileString.split("|");
    int rowsNum = rows.length;
    int colNum = rows[0].split(" ").length;
    String[][] intialBoard = new String[rowsNum][colNum];

    tiles = new Tile[rowsNum][colNum];
    for (int i = 0; i < rowsNum; i++) {
        String row = rows[i];
        String[] cells = row.split(" ");
        for (int j = 0; j < colNum; j++) {
            String cell = cells[j];
            if (cell.equals("_")) {
                tiles[i][j] = new Tile(0);//Empty cell ("_") will be repalced by ( 0 )
            } else {
                int value = Integer.parseInt(cell);
                tiles[i][j] = new Tile(value);

            }
        }
    }
}
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Board)) {
            return false;
        }
        Board board = (Board) other;
        return Arrays.deepEquals(tiles, board.tiles);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(tiles);
    }
}
