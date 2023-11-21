package Section07;


public class L16_House {
	
	public static void main(String[] args) {
		L16_House house = new L16_House(12, 4, 6);
		
		System.out.println(
				"Windows: " + house.getWindows() + " Doors: " + house.getDoors() + " Bedrooms: " + house.getBedrooms());
	}
	
	
		private int nbrOfWindows;
		private int nbrOfDoors;
		private int nbrOfBedrooms;
		
		
		public L16_House (int windows, int doors, int bedrooms) {
			
			nbrOfWindows = windows;
			nbrOfDoors = doors;
			nbrOfBedrooms = bedrooms;
			
		}
		
		public int getWindows() {
			return nbrOfWindows;
		}
		
		public int getDoors() {
			return nbrOfDoors;
		}
		
		public int getBedrooms() {
			return nbrOfBedrooms;
		}
		
	}