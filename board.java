package board;

import java.util.Scanner;

public class board {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("��ɾ� : ");
			String command = sc.nextLine();

			command.trim();

			if (command.length() == 0) {
				continue;
			}
			if (command.equals("list")) {
				System.out.println("�Խù� ���");
			}

			else if (command.equals("write")) {
				// ��ȣ, ����, ����

				int id = 1;

				System.out.printf("���� : ");
				String title = sc.nextLine();

				System.out.printf("���� : ");
				String body = sc.nextLine();

				System.out.println("�Խù� ����� �Ϸ�Ǿ����ϴ�.\n");
			} else {
				System.out.printf("$s �������� �ʴ� ��ɾ��Դϴ�\n.", command);
			}
		}
	}
}
