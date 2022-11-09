import java.util.HashMap;
import java.util.Scanner;

/*Task 2) Use a hashmap to build a program to retrieve the State information based on the state name that the use will
input. 
You program will store the State information in an object, and use the state name as the key in a key value pair used
in the hashmap ( hashtable)
Your program will start by asking the user for a state name, then will retrieve the state information from the 
hashmap based on the state name. 
The state information to be stored can include, capital, area, population and any other information about the 
state you prefer. 
 */
public class StateRunner {

	public static void main(String[] args) {
		//Section 1 Create several state objects and put them in a hash map
		HashMap<String, State>map = new HashMap<String, State>();             //Syntax for creating a hashmap
		map.put("Michigan", new State("Michigan", "MI", "Lansing",10000000)); //Creating with these 4 properties an instance key is Michigan and the value is the whole state object
		
		HashMap<String, State>map1 = new HashMap<String, State>();
		map.put("New Mexico", new State("New Mexico", "NM", "Santa Fe",2000000));
		
		HashMap<String, State>map2 = new HashMap<String, State>();
		map.put("Colorado", new State("Colorado", "CO", "Denver",580000));
		
		HashMap<String, State>map3 = new HashMap<String, State>();
		map.put("Arizona", new State("Arizona", "AZ", "Phoenix",2000000));
		
		//Section 2 Ask user to input state name, look up state in hash map, and print the state's information to screen
		System.out.println("Choose a state: ");
		Scanner scnr = new Scanner(System.in);                                //Create's scanner variable
		String stateName = scnr.nextLine();                                   //Reading the user's text
		
		if(map.containsKey(stateName))  {
			System.out.println(map.get(stateName));
		}
		else  {
			System.out.println("Sorry we do not have information on that state");
		}

	}

}
