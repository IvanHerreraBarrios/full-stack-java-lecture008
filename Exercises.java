package lecture008;

public class Exercises {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i=1; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		for(int i=10; i >= 1; i--) {
			System.out.println(i);
		}
		
		for(int i=1; i <= 10; i++) {
			if(i==2 || i==5 ||i==9) {
				continue;
			}
			System.out.println(i);
		}
	}

}
