package day3;

import java.util.Arrays;

public class PrintTwoDimensionalArray {
	public static void main(String[] args) {

		String[][] arr = { 
				{ "Саша", "Маша", "Игорь" },
				{ "Боря", "Лена", "Аркадий" },
				{ "Света", "Николай" },
				{},
				{"Боря", "Коля", "Петр"},
				{"Мурзик", "Васька","Виктор Федорович", "Крокодил Гена"}
				};
		
		printTwoDimensionalArray(arr);
		
		
		
		
	}
	
	

	static void  printTwoDimensionalArray(String[][] data){
		         
		       for(String[] i : data){
		    	   for(String str : i ){
		    		   System.out.print(str + " ");
		    	   }System.out.println();
		       } 
		    	 
		   }     
		}	
	


