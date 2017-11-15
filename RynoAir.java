import java.util.Scanner;


public class RynoAir extends Airline {  // Flight 2 RynoAir Airbus
	
	Seat reserveFirstClass(int x){ // Reserving a Seat in first class
		System.out.println(" ");
		System.out.println("What kind of seat would you like?: 1. AISLE or 2.MIDDLE or 3.WINDOW");
		Scanner kb= new Scanner(System.in);
		x = kb.nextInt();
		switch(x){
		case 1:
		for(int i=0;i<6;i++){  
			for(int j=0;j<9;j++){
				if(Seat.isReserved=false&&Seat.getPosition()=='A') //Checks is there is an AISLE seat that is not reserved and reserves it 
					Seat.isReserved=true;
					char letter=(char) (65+j);
					System.out.println("Thank you. Your AISLE seat has been reserved in First class. Your seat number is: "+(i+1)+letter);
					i+=4;
					break;
			}
		}
			break;
		case 2:
			for(int i=0;i<6;i++){ 
				for(int j=0;j<9;j++){
					if((Seat.isReserved=false)&&(Seat.getPosition()=='M')) //Checks is there is an MIDDLE seat that is not reserved and reserves it 
						Seat.isReserved=true;
						char letter=(char) (65+j);
						System.out.println("Thank you. Your MIDDLE seat has been reserved in First class.Your seat number is: "+(i+1)+letter);
						i+=4;
					break;
				}
			}
			break;
		case 3:
			for(int i=0;i<6;i++){ 
				for(int j=0;j<9;j++){
					if(Seat.isReserved=false&&Seat.getPosition()=='W') //Checks is there is an WINDOW seat that is not reserved and reserves it 
						Seat.isReserved=true;
						System.out.println("Thank you. Your WINDOW seat has been reserved in First class.");
						i+=4;
					break;
				}
			}
	}
		return null;
	}
	
	Seat reserveEconomyClass(int x) { //Reserves a seat in economy class
		System.out.println(" ");
		System.out.println("What kind of seat would you like?: 1. AISLE or 2.MIDDLE or 3.WINDOW");
		Scanner kb= new Scanner(System.in);
		x = kb.nextInt();
		switch(x){
		case 1:
		for(int i=6;i<12;i++){ 
			for(int j=0;j<9;j++){
				if(Seat.isReserved=false&&Seat.getPosition()=='A') //Checks is there is an AISLE seat that is not reserved and reserves it 
					Seat.isReserved=true;
					char letter=(char) (65+j);
					System.out.println("Thank you. Your AISLE seat has been reserved in First class. Your seat number is: "+(i+1)+letter);
					i+=4;
					break;
			}
		}
			break;
		case 2:
			for(int i=6;i<12;i++){ 
				for(int j=0;j<9;j++){
					if((Seat.isReserved=false)&&(Seat.getPosition()=='M')) //Checks is there is an MIDDLE seat that is not reserved and reserves it 
						Seat.isReserved=true;
						char letter=(char) (65+j);
						System.out.println("Thank you. Your MIDDLE seat has been reserved in First class.Your seat number is: "+(i+1)+letter);
						i+=4;
					break;
				}
			}
			break;
		case 3:
			for(int i=6;i<12;i++){ 
				for(int j=0;j<9;j++){
					if(Seat.isReserved=false&&Seat.getPosition()=='W') //Checks is there is an WINDOW seat that is not reserved and reserves it 
						Seat.isReserved=true;
						System.out.println("Thank you. Your WINDOW seat has been reserved in First class.");
						i+=4;
					break;
				}
			}
	}
		return null;
	}


}
