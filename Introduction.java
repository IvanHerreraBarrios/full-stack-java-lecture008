package lecture008;

import java.util.Iterator;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cut control
		int[] numbers;
		numbers = new int[100];
		
		for(int i=0; i <100; i++) {
			numbers[0] = i;
		}
		
		//int[] anotherVector = {10, 20, 30, 40, 50};
		int[] anotherVector = new int[6];
		
		int count = 0;
		int minimum = 0;
		int maximum = 0;
		float average;
		int pMinimum = 0;
		int pMaximum = 0;
		int minima = 0;
		int maximums = 0;
		while(count < 6) {
			for(int i=0; i<6;i++) {
				anotherVector[i] = numbers[i];
				if(i==0) {
					minimum = i;
					pMinimum = i;
					minima+=minimum;
					
					maximum = i;
					pMaximum = i;
					maximums += maximum;
				}else {
					if(numbers[i]>maximum) {
						maximum = numbers[i];
						pMaximum = i;
						maximums += maximum;
					}if(numbers[i] < minimum) {
						minimum = numbers[i];
						pMinimum = i;
						minima+=minimum;
					}
				}
				count++;
			}
			
		}
		
		average = (maximums + minima) / count;
		System.out.println("Minimum" + minimum);
		System.out.println("P Minimum" + pMinimum);
		System.out.println("Maximum" + maximum);
		System.out.println("Maximum" + pMaximum);
		System.out.println("Average" + average);
	}

}
