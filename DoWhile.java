package lecture008;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int option;
		Scanner keyboard = new Scanner(System.in);
		int failures = 0;
		
		do {
			System.out.println("Select an option");
			try {				
				option = keyboard.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				option = -1;
				keyboard.next();
				failures++;
			}
		} while ((option < 0 || option > 3) && failures < 3);
		
		if(failures == 3) {
			System.out.println("Error");
		}else {
			System.out.println("Yeah");
		}
		
		System.out.println("Valid option");
		
		keyboard.close();
	}

}
