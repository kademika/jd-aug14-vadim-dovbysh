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
		writeSoldBirds("Утка", 10);
		writeSoldBirds("Орел", 10);
		printSoldBirds();
		writeSoldBirds("Утка", 1);
		writeSoldBirds("Орел", 1);
		printSoldBirds();
		writeSoldBirds("Утка", 5);
		writeSoldBirds("Орел", 3);
		printSoldBirds();
		writeSoldBirds("Утка", 53);
		writeSoldBirds("Орел", 45);
		printSoldBirds();
	}

	// запись продажи птицы, подсчет денег
	static void writeSoldBirds(String typBirds, int quantityBirds) {
		// тип птицы
		int typeB = 0;

		if (typBirds.equals("Орел")) {
			typeB = 0;
		}
		if (typBirds.equals("Утка")) {
			typeB = 1;
		}
		// добавление к количеству проданных птиц
		int decline = Integer.parseInt(typeBirds[typeB][3]);
		decline = decline + quantityBirds;
		String declineStr = Integer.toString(decline);
		typeBirds[typeB][3] = declineStr;

		// запись остатка птиц
		int restBirds = Integer.parseInt(typeBirds[typeB][1]);
		restBirds = restBirds - quantityBirds;
		String restStringStr = Integer.toString(restBirds);
		typeBirds[typeB][1] = restStringStr;

		// подсчет заработанных на птице денег :)
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

	// статистика продаж птиц
	static void printSoldBirds() {
		System.out.println("Статистика продажи птицы: ");

		String quantEagle = typeBirds[0][3];
		String quantDuck = typeBirds[1][3];
		System.out.println("Продано орлов -  " + quantEagle + ";");
		System.out.println("Продано уток - " + quantDuck + ";");
		System.out.println();

		// остаток птиц
		String restEagle = typeBirds[0][1];
		String restDuck = typeBirds[1][1];
		System.out.println("Остаток орлов " + restEagle + ";");
		System.out.println("Остаток уток " + restDuck + ";");
		// зароботок на птице
		System.out.println("В кошельке у нас " + walletMoney + "$");
		System.out.println("--------------------");
		System.out.println("На орлах заработали " + moneyEagle);
		System.out.println("На утках заработали " + moneyDuck);
		System.out.println("********************");

		if (quantityDuck < 3 && quantityDuck != 0) {
			System.out
					.println("Внимание! Уток осталось меньше трех! Нужна доставка!");
		}
		if (quantityEagle < 3 && quantityEagle != 0) {
			System.out
					.println("Внимание! Орлов осталось меньше трех! Нужна доставка!");
		}

	}

	// тип птицы, количество в наличии, цена, продано

}
