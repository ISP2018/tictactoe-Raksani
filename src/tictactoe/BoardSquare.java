package tictactoe;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * A single square on the game board.
 *
 * @author jim
 *
 */
public class BoardSquare extends Rectangle {
	/** square knows its own row and column. */
	private int row;
	private int column;

    /**
     * creating board according to given row and column.
     * @param row board row.
     * @param col board column.
     * @param size of the square.
     */
	public BoardSquare(int row, int col, int size){
		super(100, 100);
        this.row = row;
        this.column = col;
	}

    /** get the row. */
	public int getRow() {
		return this.row;
	}

    /** get the column. */
	public int getColumn() {
		return this.column;
	}
	
}
