package day2;

public class RandomMethod {

	public static void main(String[] args) {
		while (true) {
			 
			randomMove();
		}
	}

	static void randomMove(){
		int rnd = (int)((Math.random() * 4) + 1 );
         System.out.println(rnd);
	}
	

}
