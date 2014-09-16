package day5_compound_interest;

public class Demo_compaund_percent {

	public static void main(String[] args) {

	 new Demo_compaund_percent().darkZone(300, 12, 1000000);

	}

	public void darkZone(int monthlyPayments, int interest, int dreamSum) {

		int startSum = 0;
		int month = 0;
		double interestMult = interest / 1200d;
		double cashFlow = 0;

		while (startSum < dreamSum) {
			startSum += monthlyPayments;
			
			cashFlow =  startSum * interestMult;
			startSum += (int) cashFlow;
			month++;
			}
			
		System.out.println("Month " + month);	
			System.out.println((month / 12) + " years " + month % 12 + " month");

		
         
	}

}