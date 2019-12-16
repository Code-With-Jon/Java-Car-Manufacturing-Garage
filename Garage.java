package cs20b_project1;


public class Garage {
	
		  //Variables
		  private int capacity = 5;
		  private int position;
		  private Car[] lot;

		  //Constructor
		  public Garage () {
			  lot = new Car [capacity];
		  }
		  
		  //Park Method
		  public void park(Car car) {
			 if (capacity == position) {
				 Car[] newLot = new Car [capacity * 2]; 
				 capacity = capacity * 2;
				 for (int i = 0; i < position; i++) {
					 newLot[i] = lot[i];
				 }
				 lot = newLot;
			 }
			 lot[position] = car;
			 position++;
		  }
		    
		  //Get Method
		  public Car get(int pos) throws NoCarException {
			  if (pos < 0 || pos >= position) {
				  throw new NoCarException();
			  }
			  if (lot[pos] == null) {
				  throw new NoCarException();
			  }
			  return lot[pos];
		  }
		  
		  // Unpark Method
		  public void unpark(int pos) {
			  lot[pos] = null;
			  for (int i = pos; i < position - 1; i++) {
				  lot[i] = lot[i + 1];
			  }  
		  }
}
		  
		  

