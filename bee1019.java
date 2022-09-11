import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int time;
		int hours;
		int minutes;
		int seconds;

		hours = 0;
		minutes = 0;
		seconds = 0;
		
		time = input.nextInt();

		while(time>=60){
			time = time - 60;
			minutes++;
		}
		while(minutes>=60) {
			minutes = minutes - 60;
			hours++;
		}

		seconds = time;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}