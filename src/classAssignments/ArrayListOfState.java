/*
 * 10.	Define a class with three fields state code, state name and capitals. 
 * And define 10 states. 
 * And save in an arraylist. And, print all the objects.
 */
package classAssignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfState {
	private String statecode; 
	private String statename ;
	private String capitals;
	
	
	public ArrayListOfState(String statecode, String statename, String capitals) {
		this.statecode = statecode;
		this.statename = statename;
		this.capitals = capitals;
	}
	
	public String toString() {
		return "State[StateCode =" +statecode +" StateName =" + statename +" , Capital = " + capitals +" }";
	}
	
	public static void main(String[] args) {
	
		ArrayList <ArrayListOfState> arrLstState = new ArrayList<ArrayListOfState>();
		
		arrLstState.add(new ArrayListOfState("CA", "California" , "Sacramento"));
		arrLstState.add(new ArrayListOfState("NV", "Nevada" , "NVCapital"));
		arrLstState.add(new ArrayListOfState("AZ", "Arizona" , "AZ Capital;"));
		
		arrLstState.add(new ArrayListOfState("FL", "Florida" , "Miami"));
		arrLstState.add(new ArrayListOfState("AK", "Arkansas" , "AK Capital"));
		arrLstState.add(new ArrayListOfState("DN", "Denver" , "Colorado"));
		
		
		arrLstState.add(new ArrayListOfState("WA", "Washington" , "Seatle"));
		arrLstState.add(new ArrayListOfState("AL", "Alaska" , "AL Capital"));
		arrLstState.add(new ArrayListOfState("UT", "Uttah" , "Yellowstone"));
		
		arrLstState.add(new ArrayListOfState("NC", "North Carolina" , "Railey"));
		
		Iterator <ArrayListOfState> it =  arrLstState.iterator();
		while(it.hasNext())
		{
			ArrayListOfState st = it.next();
			System.out.println(st);
		}
		 
	}

}
