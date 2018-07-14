/*This class has the variables towers, numDisks, numMoves and test.  It contains the main method which solves the Tower of Hanoi problem for the minimum 
 * number of moves required to transfer a stack of disks from one tower to another, moving only one at a time and size order must never be violated. 
 * The problem is solved and displayed for 1 - 33 disks and displays each step for numDisks = 5 */

public class TowerOfHanoi {
	static Tower[] towers = new Tower[3];        
	static int numDisks = 0;                 
	static long numMoves = 0;
	static boolean test = false;
	
	public static void main(String[] args) {
		System.out.println("Towers of Hanoi");
		System.out.println("===============\n");
		for (numDisks = 1; numDisks < 33; numDisks++) {
			numMoves = 0;
			test = false;

			if (numDisks == 5) {
				test = true;
			}//if 
		
			Tower a = new Tower('A', numDisks);
			Tower b = new Tower('B', 0);
			Tower c = new Tower('C', 0);
		
			towers[0] = a;
			towers[1] = b;
			towers[2] = c;
		
		
			moveDisks(numDisks, a, b, c);
	
			if (test == true) {
				displayTowers(a, b, c);
			}//if 
			System.out.println("Moving " + numDisks + " completed in " + numMoves + " moves!");
		}//for 
	}//main
	
	public static void displayTowers(Tower a, Tower b, Tower c) {
		 System.out.println("TOWERS:\n\n" + a.toString() + "\n" + b.toString() + "\n" + c.toString() + "\n");
	 }// displayTowers()
	 
	public static void  moveDisks(int numberDisks, Tower a, Tower b, Tower c ) {
		if (numberDisks == 1) {
			if (test == true) {
				displayTowers(a, b, c);
			}//if
			a.move(c); 				
			numMoves++;
		}//if 
			else {
				moveDisks((numberDisks - 1), a, c, b);
				moveDisks(1, a, b, c); 
				moveDisks(numberDisks - 1, b, a, c);
			} //else
	 }//moveDisks(int numDisks, char towerBeg, char towerAux, char towerEnd)
}//class
