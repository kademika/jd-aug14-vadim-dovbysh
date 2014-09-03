package day3;

//Дописать
import java.util.Arrays;

public class HelpTeacher {

	public static void main(String[] args) {

		printJournal();

	}

	static String[][] student = { { "Петров", "Вася" }, { "Деточкин", "Юрий" },
			{ "Расторгуев", "Николай" }, { "Пугачева", "Алла" },
			{ "Леонтьев", "Валерий" } };

	static String[][] lessons = { { "Физкультура", "45" },
			{ "Литература", "41" }, { "География", "23" },
			{ "Природоведение", "55" }, { "Билогия", "63" }, };

	static int[][] journal = { { 0, 0, 2 }, { 0, 0, 3 }, { 0, 0, 5 },
			{ 0, 0, 5 } };

	static void printJournal() {

		for (int[] data : journal) {
			System.out.print("Урок ");
			for (String str : lessons[data[0]]) {
				System.out.print(str + " ");
			}
			System.out.print("Студент ");
			for (String str : student[data[1]]) {
				System.out.print(str + " ");
			}
			System.out.println("Оценка " + data[2]);

		}

	}

}
