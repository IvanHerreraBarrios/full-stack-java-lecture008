package lecture008;

public class Sellers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sales = {
				"1|01/05/2021|2020|JUAN",
				"2|02/05/2021|12020|Jose",
				"3|03/05/2021|20020|Kevin",
				"4|04/05/2021|42300|Leo",
				"5|05/05/2021|56700|Max"
		};
		//float[] amountPerSeller = {200f,500f,450f,345f};
		
		double amount = 0;
		int quantity = 0;
		
		if(sales.length > 0) {
			int i = 0;
			String previous = null, current = null;
			while(i < sales.length) {
				String[] recor = sales[i].split("\\|");
				if(i==0) {
					previous = recor[3];
					current = recor[3];
				}
				while(previous.equals(current)) {
					amount+= Double.parseDouble(recor[2]);
					quantity+=1;
					
					i++;
					if(i < sales.length ) {
						recor = sales[i].split("\\|");
						current = recor[3];
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
