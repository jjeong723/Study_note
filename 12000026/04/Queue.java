import java.util.*;
public class Queue {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.offer("ȫ�浿"); // ť�� ����
		ls.offer("�赿��");
		ls.offer("������");
		ls.offer("õ����");
		System.out.println("Size = " + ls.size());
		while(ls.peek() != null) // ���� ���� �ִ°�?
		System.out.println(ls.poll()); // ���� �о ���
		System.out.println("Size = " + ls.size());
	}
}