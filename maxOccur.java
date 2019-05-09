import java.util.*;

/* Question number1
 */
 
public class maxOccur {

	public static void main(String[] args) {
		// create a list, add values, and call the method
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(2);
		//check if the result is 4. (#2 occurs 4 times)
		
		// call the method with an empty list
		List<Integer> list2 = new ArrayList<Integer>();
	
		maxOccurrences(list);
		maxOccurrences(list2);

	}
	
	public static int maxOccurrences (List<Integer> list) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		
		// for every single element in the list, put them into the map
		for ( int n : list) {
			
			// if the map contains the number already, add 1 to the value (which means occurred 1 more)
			if(map.containsKey(n)) {
			map.put(n, map.get(n)+1);
			
			//if the map does not contain the number put the number and 1 ( occur once)
		} else {
			map.put(n,1);
		}
		
			//after the adding process is done, now count the max occurrences
			if (map.get(n) > count) {
				count = map.get(n);
				
			}
		}
		System.out.println("Occurs " + count + " Times");
		return count;
		
	}
	
	/* Problem 2
	 * 												* ANSWERS *
	 *  1) [2, 6, 1, 8]							----> [1, 2, 6, 8]
	 *  2) [30, 20, 10, 60, 50, 40]				----> [10, 30, 40, 20, 60, 50]
	 *  3) [-4, 16, 9, 1, 64, 25, 36, 4, 49]	----> [-4, 1, 25, 4, 16, 9, 64, 36, 49]
	 */
	
	
	/* Problem 3
	 * 
	 * 1) mystery3(6) 							----> 6
	 * 2) mystery3(17)							----> 8
	 * 
	 */
	
	

}
