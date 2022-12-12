

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelector {

	/**
	 * Testet die Aktivitätenauswahl
	 */
	public static void main(String[] args) {
		Activity[] activities = {
				new Activity("0", 0, 0),
				new Activity("1", 5, 9), 
				new Activity("2", 8, 11), 
				new Activity("3", 6, 10), 
				new Activity("4", 2, 14), 
				new Activity("5", 3, 5), 
				new Activity("6", 0, 6), 
				new Activity("7", 5, 7),
				new Activity("8", 12, 16),
				new Activity("9", 3, 9),
				new Activity("10", 1, 4),
				new Activity("11", 8, 12) };
		
		Arrays.sort(activities);
		ArrayList<Activity> res = activitySelection(activities, 0, activities.length);
		System.out.println(res);
	}

	
	/**
	 * Rekursiver Algorithmus zur Aktivitätenauswahl
	 */
	private static ArrayList<Activity> activitySelection(Activity[] activities, int k, int n) {
		// TODO: Implementiere den Algorithmus zur Aktivitätenauswahl
		return null; // Platzhalter, muss ersetzt werden
	}

}
