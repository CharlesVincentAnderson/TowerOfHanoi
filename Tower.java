/*This class defines a Tower which has variables -numDisks, -name, -pile and -moves.
 * It also contains methods init which stacks the disks on the tower, move which 
 * moves a disc and increments -moves and toString which outputs the tower and disks*/

import java.util.ArrayList;

public class Tower extends Disk {
	private  int numDisks;
	private char name;
	private ArrayList<Disk> pile = new ArrayList<>();
	private int moves = 0;
	
	//Constructor
	public Tower(char n, int numberOfDisks) {
		super(numberOfDisks);
		name = n;
		numDisks = numberOfDisks;
		init(numDisks);
	}//Tower(char n, int disks)
	
	//stacks disks on tower
	public void init(int numberOfDisks){
		for (int size = numberOfDisks; size >= 1; size--) {  
			Disk disk = new Disk(size);  
			pile.add(disk); 
		}//for 
	}//init()
	
	//moves a disk and increments moves
	public void move(Tower destinationTower){
		Disk temp = pile.get(pile.size() - 1);
		pile.remove(pile.size() - 1);
		destinationTower.pile.add(temp);
		moves++;
	}//move(Tower)
	
	public String toString() {
		String s = "Tower " + name + ": [";
		for (int i = 0; i < pile.size(); i++) {
			s = s + pile.get(i) + ",";
		}//for 
		s = s + "]";
		return s;
	}//toString() 
	
}//class
