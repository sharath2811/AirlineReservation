import java.util.Scanner;
/**
 * This program is an airline reservation application where the user can choose from two different flights
 * @author sharathsreenivas
 *
 */
public class AirlineReservationApplication {
	
	public static void main(String[] args) { //Main method
		
		Scanner kb= new Scanner(System.in);
		
		System.out.println("Welcome to the Airline reservation System. Please choose your flight!");
		System.out.println("");
		System.out.println("1. Flight:"+Flight.flight1+" Departs at: "+Flight.flight1time+" From: "+Flight.flight1start+" To: "+Flight.flight1end+" Flight Type: "+Flight.flight1type);
		System.out.println("2. Flight:"+Flight.flight2+" Departs at: "+Flight.flight2time+" From: "+Flight.flight2start+" To: "+Flight.flight2end+" Flight Type: "+Flight.flight2type);
		int x = kb.nextInt();
		
		switch(x){ //User chooses his flight
		case 1:
			SimpleJet sj = new SimpleJet();
			BoeingSeatMap bsm= new BoeingSeatMap();
			System.out.println("Would you like to reserve a seat in 1. First class OR 2. Economy class?");
			x = kb.nextInt();
			switch(x){ //User chooses First or economy class
			case 1:
				bsm.print(); //Prints the Seat map for Boeing
				bsm.initialiseSeatMap(10, 7); //Assigns seat position for Boeing
				sj.reserveFirstClass(x); // Reserves first class seat for boeing
				break;
			case 2:
				bsm.print();
				bsm.initialiseSeatMap(10, 7); 
				sj.reserveEconomyClass(x);// Reserves economy class seat
				break;
			}
			break;
		case 2:
			RynoAir ra = new RynoAir();
			AirbusSeatMap asm= new AirbusSeatMap();
			System.out.println("Would you like to reserve a seat in 1. First class OR 2. Economy class?");
			x = kb.nextInt();
			switch(x){ //User chooses First or economy class
			case 1:
				asm.print(); //Prints the Seat map for Airbus
				asm.initialiseSeatMap(12, 9);
				ra.reserveFirstClass(x);
				break;
			case 2:
				asm.print();
				asm.initialiseSeatMap(12, 9);
				ra.reserveEconomyClass(x);
				break;
			}
			break;
		}
	}

}
