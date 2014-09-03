package day3;

public class ArrayCountry {

	public static void main(String[] args) {
		String[][] arraysCountry = new String[][] {
				{ "China", "Peking", "1354040000" },
				{ "India", "New Delhi", "1210569573" },
				{ "USA", "Vashington D.C.", "316305000" },
				{ "Idonesia", "Jakarta", "237641326" },
				{ "Brazil", "Brasilia", "193946886" },
				{ "Pakistan", "Islamabad", "183748060" } 
				};
		
		long popul = getPopulation(arraysCountry);
		System.out.println(popul);

	}

	static long getPopulation(String[][] arraysCountry) {
		long pop = 0;
		for (int i = 0; i < arraysCountry.length; i++) {
				pop = Integer.parseInt(arraysCountry[i][2]);
				pop += pop;
			}
		
		return pop;
	}
}
