package lecture008;

import java.util.Scanner;

public class Sllers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sales = {
				"2020|JUAN",
				"12020|Jose",
				"20020|Kevin",
				"42300|Leo",
				"56700|Max"
		};
		//float[] amountPerSeller = {200f,500f,450f,345f};
		Scanner keyboard = new Scanner(System.in);
		int numberOfRecords;
		
		do {
			
			System.out.println("Enter the files: (1 to 6)");
			try {
				numberOfRecords= keyboard.nextInt();				
			} catch (Exception e) {
				numberOfRecords = -1;
				keyboard.next();
			}
		} while (numberOfRecords < 1 || numberOfRecords > 6);
		
		sales = new String[numberOfRecords];
		
		for(int i=0; i < numberOfRecords;i++) {
			System.out.println("Enter the amount");
			double amount = keyboard.nextDouble();
			
			System.out.println("Enter the name");
			String name = keyboard.next();
			
			String recor = amount+"|"+name;
			sales[i] = recor;
		}
		keyboard.close();
		double amount = 0;
		int quantity = 0;
		
		if(sales.length > 0) {
			int i = 0;
			String previous = null, current = null;
			while(i < sales.length) {
				String[] recor = sales[i].split("\\|");
				if(i==0) {
					previous = recor[1];
					current = recor[1];
				}
				while(previous.equals(current)) {
					amount+= Double.parseDouble(recor[0]);
					quantity+=1;
					
					i++;
					if(i < sales.length ) {
						recor = sales[i].split("\\|");
						current = recor[1];
					}else {
						break;
					}
				}
				System.out.println(current + "sales" + amount);
				System.out.println(current + "quantity" + quantity);
				
				amount = 0;
				quantity = 0;
				
				previous = current;
			}
		} else {
			System.out.println("Null");
		}
		
	}
}
