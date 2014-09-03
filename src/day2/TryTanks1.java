package day2;

public class TryTanks1 {

	public static void main(String[] args) {
		
		
		System.out.println(getQuadrant("a", "2"));
		printCoordinates("f", "9");
		
		
	}
	
	/**
	 * -TANKS-
	 * @param v
	 * @param h
	 * @return
	 */
	
	public static String getQuadrant( String v, String h)
	
	{   	
		int hor = Integer.valueOf(h);
		int vert = 1;
		if (v.equals("b"))
			vert = 2;
		if (v.equals("c"))
			vert = 3;
		if (v.equals("d"))
			vert = 4;
		if (v.equals("e"))
			vert = 5;
		if (v.equals("f"))
			vert = 6;
		if (v.equals("g"))
			vert = 7;
		if (v.equals("h"))
			vert = 8;
		if (v.equals("i"))
			vert = 9;
			String coord = (vert - 1) * 64 + "_" + (hor - 1) * 64;
		return coord;
	}
	/**
	 * -TANKS-
	 * @param v
	 * @param h
	 */
	
	
	public static void printCoordinates(String v, String h)
	{
		String coord = getQuadrant(v , h);
		String coord1 = coord.substring(0, coord.indexOf("_"));
		String coord2 = coord.substring(coord.indexOf("_") + 1);
		String printCoordinates = v + h + ":" + "(" + coord1 + "px; " + coord2 + "px)";
		System.out.println(printCoordinates);
	}
}
