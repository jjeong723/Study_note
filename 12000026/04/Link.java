// Link�� �����ϴ� Ŭ����
public class Link { 
	public int data1; 
	public double data2; 
	public Link nextLink; 

	// Link ������ 
	public Link(int d1, double d2) { 
		data1 = d1; 
		data2 = d2; 
	}

	// Link �������� ��� 
	public void printLink() { 
		System.out.print("{" + data1 + ", " + data2 + "} "); 
	}
}
