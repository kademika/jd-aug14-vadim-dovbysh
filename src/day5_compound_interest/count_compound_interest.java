//package day5_compound_interest;
//
//public class count_compound_interest {
//
//	private int monthlyPayments;
//	private int interest;
//	private int dreamSum;
//
//	public int getMonthlyPayments() {
//		return monthlyPayments;
//	}
//
//	public void setMonthlyPayments(int monthlyPayments) {
//		this.monthlyPayments = monthlyPayments;
//	}
//
//	public int getInterest() {
//		return interest;
//	}
//
//	public void setInterest(int interest) {
//		this.interest = interest;
//	}
//
//	public int getDreamSum() {
//		return dreamSum;
//	}
//
//	public void setDreamSum(int dreamSum) {
//		this.dreamSum = dreamSum;
//	}
//
//	public int count_interest(int monthlyPayments, int interest, int dreamSum) {
//
//		int startSum = 0;
//		int month = 0;
//		int yearsCount = 0;
//
//		while (startSum < dreamSum) {
//
//			for (month = 0; month < 12; month++) {
//				startSum = (int) (startSum + monthlyPayments) * (interest / 12);
//
//				yearsCount++;
//				 
//				if (startSum >= dreamSum){
//					
//					break;
//				}
//
//			}
//
//		}
//		
//		
//		return (yearsCount / 12) + month;
//
//	}
//
//}
