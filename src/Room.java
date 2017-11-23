
public class Room {
	private Integer roomNumber;
	private String roomType, eMail;
	private Double Price;
	private Boolean withBalcony, withLounge;
	
	public Room(Integer n, String t, Double p, Boolean b, Boolean l, String m) {

		roomNumber = n;
		roomType = t;
		Price = p;
		withBalcony = b;
		withLounge = l;
		eMail = m;
	}
	
	public String toString(){
		String result = roomNumber + " " + roomType + " " + Price + " " + withBalcony + " " + withLounge + " " + eMail;
		return result;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public String getRoomType() {
		return roomType;
	}

	public double getPrice() {
		return Price;
	}
	
	public boolean getWithBalcony() {
		return withBalcony;
	}

	public boolean getWithLounge() {
		return withLounge;
		
	}
	public String getEMail() {
		return eMail;
	}
	
	public void cancelEmail() {
		eMail.equals("Free");
	}
	public String getAllRooms() {
		return roomNumber + " " + roomType + " " + Price + " " + withBalcony + " " + withLounge + " " + eMail;
	}
}