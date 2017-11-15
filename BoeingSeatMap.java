
public class BoeingSeatMap extends SeatMap{ //Seat Map for Flight 1
	
	int row=10;
	int column=7;
	String[][] seats= new String[row][column]; //Initializes rows and columns
	
	public void print(){//Prints seat map for the user 
		for(int i=0;i<4;i++){ //prints the position of the seat in first class
			System.out.print((i+1)+". ");
			for(int j=0;j<7;j++){
				
				if((j==0)||(j==6)){
					System.out.print("W[ ]");
				}
				else if((j==1)||(j==4)){
					System.out.print("A[ ]  ");
				}
				else if((j==2)||(j==5)){
					System.out.print("A[ ]");
				}
				else{
					System.out.print("M[ ]");
			}
			}
			System.out.println();
		}
		System.out.println();
	
			for(int i=4;i<10;i++){  //prints the position of the seat in economy class
				System.out.print((i+1)+". ");
				for(int j=0;j<7;j++){
					
					if((j==0)||(j==6)){
						System.out.print("w[ ]");
					}
					else if((j==1)||(j==4)){
						System.out.print("a[ ]  ");
					}
					else if((j==2)||(j==5)){
						System.out.print("a[ ]");
					}
					else{
						System.out.print("m[ ]");
				}
		}
				System.out.println();
				
			}
				
			}
		
	
	SeatMap initialiseSeatMap(int row,int column){
	for(int i=0;i<4;i++){ //Sets the position of the seat in first class
		for(int j=0;j<7;j++){
			if((j==0)||(j==6)){
				seats[i][j]="W[ ]"; 
				Seat.Position(Seat.WINDOW);
			}
			else if((j==1)||(j==2)||(j==4)||(j==5)){
				seats[i][j]="A[ ]"; 
				Seat.Position(Seat.AISLE);
			}
			else{
				seats[i][j]="M[ ]"; 
				Seat.Position(Seat.MIDDLE);
		}
		}
		
		for(i=4;i<10;i++){  //Sets the position of the seat in economy class
			for(int j=0;j<7;j++){
				if((j==0)||(j==6)){
					seats[i][j]="w[ ]"; 
					Seat.Position(Seat.WINDOW);
				}
				else if((j==1)||(j==2)||(j==4)||(j==5)){
					seats[i][j]="a[ ]"; 
					Seat.Position(Seat.AISLE);
				}
				else{
					seats[i][j]="m[ ]"; 
					Seat.Position(Seat.MIDDLE);
			}
	}
	}
	}
	return null;
}
}
	