import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		int[] dataArray = { 4, 21, 2, 10, 11, 16 };

		System.out.println("�˻��� �����͸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int search = Integer.parseInt(scan.nextLine().
		trim()); // �����͸� �Է¹޽��ϴ�.

		int result = sequentialSearch(dataArray, search);

		if(result == -1)
			System.out.println("�����͸� ã�� ���Ͽ����ϴ�");
		else
			System.out.println("�������� ��ġ�� " + result + "��° �Դϴ�.");
	}

	public static int sequentialSearch(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) { // ������� ���ϱ� ���� �迭�� ũ�⸸ŭ �ݺ��մϴ�.
			if (arr[i] == search) // ���� �����Ͱ� �迭�� ������ �迭�� ��ġ�� return�ϰ�, ���ٸ� -1�� return �մϴ�.
			return i;
		}
		return -1;
	}
}