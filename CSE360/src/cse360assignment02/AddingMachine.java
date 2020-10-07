package cse360assignment02;

public class AddingMachine {
  private int total;
  StringBuffer history;

  public void main (String [] args) {
	  
  }
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new StringBuffer ("0");
  }
  
  public int getTotal () {
    return total;
  }//returns total
  
  public void add (int value) {
	  total = total + value;
	  history.append(" + "+value);
  }//adds two numbers

  public void subtract (int value) {
	  total = total - value;
	  history.append(" - "+value);
  }//subtracts 2 numbers

  public String toString () {
    return history.toString();
  }//toString to return a summary of the operations

  public void clear() {
	  history.delete(0, history.length());
  }//clears AddingMachine
}
