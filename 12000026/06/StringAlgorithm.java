public class StringAlgorithm {
	public static void main(String[] args) {
		String str = "abcdabcdfgab";
		String sStr = "ab";

		int orStrLen = str.length(); // �������� ��Ʈ��
		int sStrLen = sStr.length(); // ã������ �ܾ�

		char[] searchString= sStr.toCharArray(); // ã�� �ܾ character�� �迭�� ��ȯ
		char[] allString = str.toCharArray(); // ��ü ������ character�� �迭�� ��ȯ

		int start; // ��ü�� ���忡�� ã������ �ܾ ���� ���� �ε����� ���Ѵ�.
		int i;

		int count = 0; // ���忡�� ã������ ����

		for(start=0; start < orStrLen ; start++) { // ��ü ������ ó������ ����
			for( i=0; i<sStrLen; i++ ) { // ã������ �ܾ ����
				if( allString[start] == searchString[i] ) { // �� �ܾ��� ù
				��° �ܾ��� ��
					if( allString[start+1] == searchString[I + 1] ) {
					// �� ��° �ܾ��� ��
						count++; // �� ���� �ܾ ������ �ϳ� ����
						}
					}
					else {
						break;
					}
				}
			}
		System.out.println("ã���� �ܾ��� ���� = " + count);
	}
}