/*This class defines a Disk which has a variable -size. */

public class Disk {

	private int size;
	
	//Constructor
	public Disk(int number) {
		size = number;
	}//Disk(int number)
	
	public String toString() {
		return String.valueOf(this.size);
	}//toString()
	
}//class
