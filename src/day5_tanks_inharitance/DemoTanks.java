package day5_tanks_inharitance;

public class DemoTanks {

	public static void main(String[] args) {
		Tank tank = new Tank();
		BT7 bt7 = new BT7();
		T34 t34 = new T34();
		Tiger tiger = new Tiger();

		bt7.setColor("Red");
		bt7.setCrew(2);
		bt7.setMaxSpeed(80);

		tiger.setColor("Green");
		tiger.setCrew(3);
		tiger.setMaxSpeed(80);

		t34.setColor("Grey");
		t34.setCrew(5);
		t34.setMaxSpeed(50);

		System.out.println(tiger.move());
		System.out.println(bt7.move());
		System.out.println(t34.move());

		System.out.println(bt7.toString());
		System.out.println(t34.toString());
		System.out.println(tiger.toString());
		
		System.out.println(tiger instanceof Tank);

	}

	
}
