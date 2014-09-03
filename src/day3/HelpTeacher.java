package day3;

//��������
import java.util.Arrays;

public class HelpTeacher {

	public static void main(String[] args) {

		printJournal();

	}

	static String[][] student = { { "������", "����" }, { "��������", "����" },
			{ "����������", "�������" }, { "��������", "����" },
			{ "��������", "�������" } };

	static String[][] lessons = { { "�����������", "45" },
			{ "����������", "41" }, { "���������", "23" },
			{ "��������������", "55" }, { "�������", "63" }, };

	static int[][] journal = { { 0, 0, 2 }, { 0, 0, 3 }, { 0, 0, 5 },
			{ 0, 0, 5 } };

	static void printJournal() {

		for (int[] data : journal) {
			System.out.print("���� ");
			for (String str : lessons[data[0]]) {
				System.out.print(str + " ");
			}
			System.out.print("������� ");
			for (String str : student[data[1]]) {
				System.out.print(str + " ");
			}
			System.out.println("������ " + data[2]);

		}

	}

}
