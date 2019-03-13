/* PP 2.6 Write an application that reads values representing a time duration
in hours, minutes, and seconds, and then prints the equivalent
total number of seconds. (For example, 1 hour, 28 minutes,
and 42 seconds is equivalent to 5322 seconds.)*/

import java.util.Scanner;
public class Seconds {

	public static void main(String[] args) {
		
		int houres, minutes, seconds;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of houres:");
		houres = scan.nextInt();
		System.out.println("Enter number of minutes:");
		minutes = scan.nextInt();
		System.out.println("Enter number of seconds:");
		seconds = scan.nextInt();
		
		int sec = ((houres * 60)*60) + (minutes * 60) + seconds;
		
		System.out.println(houres + " hour " + minutes + " minutes " + seconds + " seconds " );
		System.out.println("Give us a total of (is equivalent to) " + sec + " seconds.");

	}

}
