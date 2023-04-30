package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD
	private char column;
	private int row;
	
=======

	private char column;
	private int row;

>>>>>>> ca9a0f85b25a6e4b2ce31299a424566eed1bda76
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
<<<<<<< HEAD
=======

>>>>>>> ca9a0f85b25a6e4b2ce31299a424566eed1bda76
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

=======
	
>>>>>>> ca9a0f85b25a6e4b2ce31299a424566eed1bda76
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
<<<<<<< HEAD
	
=======

>>>>>>> ca9a0f85b25a6e4b2ce31299a424566eed1bda76
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
=======
	
	
>>>>>>> ca9a0f85b25a6e4b2ce31299a424566eed1bda76
}
