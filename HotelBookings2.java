import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class HotelBookings2 {

	private static Scanner input = new Scanner(System.in);

	private static Room[] Rooms = new Room[17];

	public static void main(String[] args) throws FileNotFoundException {
		final Scanner file = new Scanner(new FileReader("M:\\Data\\rooms.txt"));

		String menu = "";

		int index = 0;
		String splits[] = { "" };

		while (file.hasNext()) {
			splits = file.nextLine().split(" ");
			Rooms[index] = new Room(Integer.parseInt(splits[0]), splits[1], Double.parseDouble(splits[2]),
					Boolean.parseBoolean(splits[3]), Boolean.parseBoolean(splits[4]), splits[5]);
			index++;

			// System.out.println((Integer.parseInt(splits[0]) + splits[1] +
			// Double.parseDouble(splits[2]) + Boolean.parseBoolean(splits[3]) +
			// Boolean.parseBoolean(splits[4]) + splits[5]));
		}

		do {
			System.out.println(
					"--Room Booking System-- \n" + " \n" + " \n" + "--Main Menu-- \n" + "1- Search Rooms \n"
							+ "2-View Room Reservations \n" + "3-Reserve Room \n" + "4-Cancel Room \n" + "Q - Quit \n" + "Pick :");
			menu = input.next();

			switch (menu.toUpperCase()) {
			case "1":
				searchRooms();
				break;
			case "2":
				viewRoomReservations();
				break;
			case "3":
				reserveRoom();
				break;
			case "4":
				cancelRoom();
				break;
			case "Q":
				quit();
				break;
			default:
				System.out.println("Invalid selection.");
				break;
			}
		} while (!"Q".equals(menu));
		System.out.println("Thankyou for using our hotel booking system.");
	}

	private static void searchRooms() {
		
		/*boolean Lounge, Balcony;
		String roomType, loungeBoolean, balconyBoolean;
		double cost;
		
		System.out.println("What is your preffered room type? Single/Double/Suite");
		roomType = input.next();
		System.out.println("Please select the maximum cost you would like to spend? ");
		cost = input.nextDouble();
		System.out.println("Would you like a lounge with your room? (Yes,No)");
		loungeBoolean = input.next();
		System.out.println("Would you like a balcony with your room? (Yes,No)");
		balconyBoolean = input.next();
		
		
		if (loungeBoolean.equalsIgnoreCase("Yes")) {
			Lounge = true;
			System.out.print("it works...ish");
		}
		else {
			Lounge = false;
		} 
		
		if (balconyBoolean.equalsIgnoreCase("Yes")) {
			Balcony = true;
			System.out.print("it works");
		}
		else {
			Balcony = false;
		}*/
	}

	private static void viewRoomReservations() {

		System.out.println("Checking all rooms");
		System.out.println("Number - Type - Price - With Lounge - With Balcony - Availability");
		for (int i = 0; i < Rooms.length; i++) {
			System.out.println(Rooms[i].toString());
		}
		return;
	}

	private static void reserveRoom() throws FileNotFoundException {
		for (int i = 0; i < Rooms.length; i++) {
		System.out.println("Please enter the room number you would like to reserve");
		Integer roomNumber = file.nextInteger();
		if(Room[i].getRoomNumber() = roomNumber) {
			
			}
		}
	}

	private static void cancelRoom() {
		
		System.out.println("You have selected - Cancel Room");
		System.out.println("To cancel your room, please enter in your email address");
		String cancelEmail;
		
	//	if (cancelEmail.equalsIgnoreCase(Room));

	}

	private static void quit() {

	}

}
