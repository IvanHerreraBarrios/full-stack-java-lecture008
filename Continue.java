package lecture008;

public class Continue {

	public static void main(String[] args) {
		
		int maximum = 10;
		
		while(maximum  > 0) {
			
			if(maximum >= 3 && maximum <=5) {
				continue;
			}
			maximum--;
		}
	}

}
