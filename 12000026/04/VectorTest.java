import java.util.Vector;

public class VectorTest { 

	public static void main(String[] args) { 

		// ���� ���� �ٷ�� ���׸� ���� ���� 
		Vector<Integer> vector = new Vector<Integer>(); 

		vector.add(5); // 5 ���� 
		vector.add(4); // 4 ���� 
		vector.add(-1); // -1 ���� 

		// ���� �߰��� �����ϱ� 
		vector.add(2, 100); // 4�� -1 ���̿� ���� 100 ���� 

		System.out.println("���� ���� ��� ��ü �� : " + vector.size()); 
		System.out.println("������ ���� �뷮 : " + vector.capacity()); 

		// ��� ��� ���� ����ϱ� 
		for(int i=0; i<vector.size(); i++) { 
			int n = vector.get(i); 
			System.out.println(n); 
		} 
		// ���� ���� ��� ���� ���ϱ� 
		int sum = 0;
		for(int i=0; i<vector.size(); i++) { 
			int n = vector.elementAt(i); 
			sum += n; 
		} 
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum); 
	}
}