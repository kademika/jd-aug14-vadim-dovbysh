package day3;

import javax.lang.model.type.DeclaredType;

public class Birds {

	static int moneyEagle = 0;
	static int moneyDuck = 0;
	static int walletMoney = 0;
	static int quantityEagle = 0;
	static int quantityDuck = 0;

	static String typeBirds[][] = { { "Eagle", "60", "5", "0" },
			{ "Duck", "70", "2", "0" } };

	public static void main(String[] args) {

		printSoldBirds();
		writeSoldBirds("����", 10);
		writeSoldBirds("����", 10);
		printSoldBirds();
		writeSoldBirds("����", 1);
		writeSoldBirds("����", 1);
		printSoldBirds();
		writeSoldBirds("����", 5);
		writeSoldBirds("����", 3);
		printSoldBirds();
		writeSoldBirds("����", 53);
		writeSoldBirds("����", 45);
		printSoldBirds();
	}

	// ������ ������� �����, ������� �����
	static void writeSoldBirds(String typBirds, int quantityBirds) {
		// ��� �����
		int typeB = 0;

		if (typBirds.equals("����")) {
			typeB = 0;
		}
		if (typBirds.equals("����")) {
			typeB = 1;
		}
		// ���������� � ���������� ��������� ����
		int decline = Integer.parseInt(typeBirds[typeB][3]);
		decline = decline + quantityBirds;
		String declineStr = Integer.toString(decline);
		typeBirds[typeB][3] = declineStr;

		// ������ ������� ����
		int restBirds = Integer.parseInt(typeBirds[typeB][1]);
		restBirds = restBirds - quantityBirds;
		String restStringStr = Integer.toString(restBirds);
		typeBirds[typeB][1] = restStringStr;

		// ������� ������������ �� ����� ����� :)
		int money = 0;

		if (typeB == 0) {
			money = 5 * quantityBirds;
			moneyEagle += money;
			quantityEagle = restBirds;

		} else if (typeB == 1) {
			money = 2 * quantityBirds;
			moneyDuck += money;
			quantityDuck = restBirds;
		}
		walletMoney += money;
	}

	// ���������� ������ ����
	static void printSoldBirds() {
		System.out.println("���������� ������� �����: ");

		String quantEagle = typeBirds[0][3];
		String quantDuck = typeBirds[1][3];
		System.out.println("������� ����� -  " + quantEagle + ";");
		System.out.println("������� ���� - " + quantDuck + ";");
		System.out.println();

		// ������� ����
		String restEagle = typeBirds[0][1];
		String restDuck = typeBirds[1][1];
		System.out.println("������� ����� " + restEagle + ";");
		System.out.println("������� ���� " + restDuck + ";");
		// ��������� �� �����
		System.out.println("� �������� � ��� " + walletMoney + "$");
		System.out.println("--------------------");
		System.out.println("�� ����� ���������� " + moneyEagle);
		System.out.println("�� ����� ���������� " + moneyDuck);
		System.out.println("********************");

		if (quantityDuck < 3 && quantityDuck != 0) {
			System.out
					.println("��������! ���� �������� ������ ����! ����� ��������!");
		}
		if (quantityEagle < 3 && quantityEagle != 0) {
			System.out
					.println("��������! ����� �������� ������ ����! ����� ��������!");
		}

	}

	// ��� �����, ���������� � �������, ����, �������

}
