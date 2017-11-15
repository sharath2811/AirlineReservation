import java.util.ArrayList;

public enum Seat {
	AISLE('A'),MIDDLE('M'), WINDOW('W');
	public static boolean isReserved; //indicates if seat is reserved
	private boolean isFirst;	//indicates if seat is in first class
	private int row;
	private int column;
	private static char position;
	Seat x;
	
	/**
	 * This is the seat enum class that contains all the attributes for assigning a seat.
	 * @param x
	 */
	
	Seat(char x){
		this.setPosition(x);
	}

	public boolean isReserved() { //returns is the seat is reserved
		return isReserved;
	}

	public void setReserved(boolean isReserved) { //sets the seat as reserved
		this.isReserved = isReserved;
	}

	public boolean isFirst() { //returns is the seat is in fist class
		return isFirst;
	}

	public void setFirst(boolean isFirst) { //sets if the seat is in first class
		this.isFirst = isFirst;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public static char getPosition() {
		return position;
	}

	public void setPosition(char position) {
		this.position=position;
	}
	
	public static Seat Position(Seat x){
		return x;
	}

	public void SeatPosition(int row,int column){ //Converts the array into seat numbers
		this.setRow(row);
		this.setColumn(column);
	}
	
}
