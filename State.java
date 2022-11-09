/*Task 2) Use a hashmap to build a program to retrieve the State information based on the state name that the use will
input. 
You program will store the State information in an object, and use the state name as the key in a key value pair used
in the hashmap ( hashtable)
Your program will start by asking the user for a state name, then will retrieve the state information from the 
hashmap based on the state name. 
The state information to be stored can include, capital, area, population and any other information about the 
state you prefer. 
 */
public class State {
	private String name;                                                               //Instance variables
	private String abbreviation;
	private String capital;
	private int population;

	public State(String name,String abbreviation, String capital, int population)  {   //Constructor
		this.name = name;
		this.abbreviation = abbreviation;
		this.capital = capital;
		this.population = population;
		
		
	}
	public String toString() {
		String answer = name + " has a population of " + population;
		String answer2 = abbreviation + " is the abbreviation of " + name;
		String answer3 = capital + " is the capital of " + name;
		return answer + "\n" + answer2 + "\n" + answer3;
	}

	public String getName() {                                                         //Access private instance variables
		return name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}


	public String getCapital() {
		return capital;
	}


	public int getPopulation() {
		return population;
	}

	
}


