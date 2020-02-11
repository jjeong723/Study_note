// LinkList�� ���� �����ϴ� Ŭ����
public class LinkList { 

	private Link first; 

	// LinkList ������ 
	public LinkList() { 
		first = null; 
	} 

	// ����ִٸ�, null�� ��ȯ 
	public boolean isEmpty() { 
		return first == null; 
	} 

	// ����Ʈ�� ù ��°�� ���ο� ����Ʈ�� ���� 
	public void insert(int d1, double d2) { 
		Link link = new Link(d1, d2); 
		link.nextLink = first; 
		first = link; 
	} 

	// ����Ʈ�� ù ��° ���Ҹ� ���� 
	public Link delete() { 
		Link temp = first; 
		first = first.nextLink; 
		return temp; 
	} 

	// �������� ��� 
	public void printList() { 
		Link currentLink = first; 
		System.out.print("List: "); 
		while(currentLink != null) {
			currentLink.printLink();
			currentLink = currentLink.nextLink; 
		} 
		System.out.println(""); 
	}
}