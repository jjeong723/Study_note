# 자료구조
## 연결 리스트

### 연결리스트 코드
* **python 코드**
```python
class Node : 
# 연결 리스트를 구성하는 단위 데이터의 모습은 데이터+다음 데이터 
	def __init__(self, data, next=None) : 
		self.data = data 
		self.next=next

def init() : 
# 연결리스트를 만듦. node1~4 그리고 연결포인터로 구성 
	global node1
	node1 = Node(1) 
	node2 = Node(2) 
	node3 = Node(3) 
	node4 = Node(4) 
	node1.next = node2 
	node2.next = node3 
	node3.next = node4

def delete(del_data) : 
# 구성된 리스트에서 데이터를 지우고 나머지를 연결
	global node1 
	pre_node = node1 
	next_node = pre_node.next 

	if pre_node.data == del_data : 
		node1 = next_node 
		del pre_node 
		return 

	while next_node : 
		if next_node.data == del_data: 
			pre_node.next = next_node.next 
			del next_node 
			break 
		pre_node = next_node 
		next_node = next_node.next

def insert(ins_data) : 
# 연결 리스트 추가 
	global node1 
	new_node = Node(ins_data) 
	new_node.next=node1 
	node1 = new_node

def print_list() : 
# 연결리스트 데이터 출력. 
	global node1 
	node = node1 
	while node: 
		print (node.data) 
		node=node.next 
	print()
def LinkedList() : 
	init(); 
	delete(2) 
	insert("9") 
	print_list()

# Main code
LinkedList() 

```

* **결과**
```결과
List: {5, 500.0}  {4, 400.0}  {3, 300.0}  {2, 200.0}  {1, 100.0}
deleted: {5, 500.0}
deleted: {4, 400.0}
deleted: {3, 300.0}
deleted: {2, 200.0}
deleted: {1, 100.0}
List: 
```

### 자료구조 활용 예시
> 이전에 자료구조를 통해 알고리즘이 활용되는지 보기 위한 예로 해쉬 테이블을 확인하도록 하자.

해쉬 테이블(Hash Table)은 데이터를 저장할 때, 저장할 위치를 해쉬 함수를 이용해서 생성하고 생성된 위치에 데이터를 저장하는 방식에서 사용하는 주소 테이블이다.

순서 리스트 + 연결 리스트 자료구조를 가지며, 데이터에 직접적인 접근이 가능하여 저장 및 읽기 속도가 빠르다. 그래서 데이터베이스에서 데이터를 저장할 때 주로 사용한다.

#### 해쉬테이블 저장 방법
데이터를 저장할때 해쉬 함수를 돌려서 나오는 배열 항목으로 저장하게됩니다.
![해쉬테이블 예시](./1st_image/hash_table.png)

## 순서 리스트 자료구조
순서 리스트(Ordered List) 또는 선형 리스트(Linear List)는 리스트 기반의 자료 구조이다. 순서 리스트는 주로 인덱스 관리에 사용된다.

![순서리스트](./1st_image/list.png)

순서리스트는 리스트 기반의 자료 구조이기 때문에 중간의 자료를 삽입 또는 삭제시 전체의 크기가 변하는 것을 알 수 있음.
![순서리스트_삭제](./1st_image/ordered_list_del.png)
![순서리스트_삽입](./1st_image/ordered_list_insert.png)

## 배열 자료구조
배열(Array)는 프로그램 언어 기능중에 가장 많이 사용되며, 동일한 형태의 자료를 연속해서 저장하는 구조를 가진다. 이때, 기본 자료형(int, double, bool 등)외에도 사용자 정의 자료형(구조체, 클래스 등)도 포함된다.

## 스택 자료구조
스택(Stack)은 데이터가 입력되면 입력되는 순서대로 쌓고, 나중에 들어온 것부터 먼저 사용하는 자룐구조이다 (LIFO; Last In First Out).
![스택](./1st_image/Stack.png)

### 스택 용도
스택은 프로그램을 수행할 때 사용된다.

가령, 함수 A를 호출하여 실행할때, 함수 A 내의 함수 B가 호출되어 스택으로 쌓이게 된다.
함수 B의 실행이 완료되면 함수 A가 다시 실행되며 함수 A가 완료되면 프로그램이 실행된다.

### 스택 코드
* **python 코드**
```python
def Stack() : 
	stack = [] 

	stack.append(1) 
	stack.append(2) 
	stack.append(3) 
	stack.append(4) 
	stack.append(5) 
	print(stack) 

	while stack : 
		print("POP Value is ", stack.pop())
Stack()
```
* **결과**
```
[1, 2, 3, 4, 5]
POP Value is 5
POP Value is 4
POP Value is 3
POP Value is 2
POP Value is 1
```

### 컴퓨터가 사용하는 수식 방법(후위 표기법)
사람이 사용하는 수식(중위 표기법)을 컴퓨터가 사용하는 수식(후위 표기법)으로 변환하여 연산하는 과정을 알아보자.

```
K = ((A*B)+(C/D))
```
```
K = AB*CD/+
```

## 큐 자료구조
큐(Queue)는 데이터가 입력되면 입력되는 순서대로 쌓이고, 먼저 들어온 것부터 먼저 사용되는 자료구조이다 (FIFO; First In First Out). 
큐의 구현은 배열을 사용하거나 (순환 큐), 연결 리스트를 사용한다(링크드 큐).
![큐](./1st_image/Queue.png)

### 큐 용도
컴퓨터 내에서 여러 개의 프로세스가 수행중 일 경우, 새로운 프로세스가 수행되야한다면 기존에 수행되던 프로세스중 가장 먼저 올라온 프로세스를 내보낸다. 이를 운영체제가 큐의 형태로 관리하게된다.

### 큐 코드
* **python 코드**
```python
	def Queue() :
		queue = []
		queue.append(1)
		queue.append(2)
		queue.append(3)
		queue.append(4)
		queue.append(5)
		print(queue)
		while queue :
			print("Get Value :", queue.pop(0))
	Queue()
```
* **코드 결과**
```
	[1, 2, 3, 4, 5]
	Get Value : 1
	Get Value : 2
	Get Value : 3
	Get Value : 4
	Get Value : 5
```

## 데크 자료구조
데크(Deque) 자료구조는 많이 사용되지 않지만, 상당히 재밌는 구조이다. 데크는 리스트 양쪽 끝에서 삽입과 삭제가 모두 이루어지는 자료구조이며, 스택과 큐를 혼합한 구조형태이다. 

![데크](./1st_image/Deque.png)

### 데크의 자료구조 종류
* 입력 제한 데크(스크롤): 삽입이 한쪽에서만 일어나는 데크
* 출력 제한 데크(셀프): 삭제가 한쪽에서만 일어나는 데크

## 트리 자료구조
임의의 노드에서 다른 노드로 가는 경로가 하나 밖에 없을 경우, 이를 트리 자료구조라고 한다. 트리 자료구조는 단 하나의 루트 노드(Root Node)가 있고, 루트노드에서 하위 노드(Sub Node)들이 연결된 비선형 계층 구조이다.

트리 자료구조의 구현은 배열이나 연결 리스트를 사용하며 운영체제의 파일 시스템에서 사용하고 있다.

![트리](./1st_image/Tree.png)

### 이진 트리
 이진 트리 구조(Binary Tree)는 트리 자료구조중에서 모든 노드가 최대 2개의 자식 노드를 가질 수 있는 구조이다. 이때, 왼쪽 서브 트리는 루트값보다 작고, 오른쪽 서브 트리는 루트 값보다 크게 구성된다. 주로 빠른 검색이 필요한 곳에 사용되며, **이진 검색 트리**라고 한다.

 #### 이진 트리의 분류
 * 포화 이진 트리(Full Binary Tree): 레벨의 노드가 꽉찬 트리
 * 완전 이진 트리(Complete Binary Tree): 마지막 레벨 전까지 노드가 꽉차있고, 마지막 레벨의 왼쪽에서 오른쪽으로 노드가 채워져 있는 트리(*마지막 레벨이 다 채워지지 않아도됨*)
 * 편향 이진 트리(Skewed Binary Tree): 왼쪽 또는 오른쪽 서브 트리만을 가지는 트리

 #### 이진 트리 사용 및 응용

 #### 이진 트리 응용 사례 및 구현 방법

 #### 이진 트리 코드
 * **python 코드**
```python
	class Node(object): 	# ����� ������ �����ϴ� �κ� 
		def _ _init_ _(self, data): 
			self.data = data 
			self.left = self.right = None

	class BinarySearchTree(object) : 
		def _ _init_ _(self): 
			self.root = None 

		def insert(self, data): # ���� Ʈ���� �����͸� �ִ� �κ� 
			self.root = self._insert_value(self.root, data) 
			return self.root is not None 
		
		def _insert_value(self, node, data) : 
			if node is None : 
				node = Node(data) 
		else : 
			if data <= node.data: 
				node.left =self._insert_value(node.left, data) 
			else : 
				node.right = self._insert_value(node.right, data) 
		return node 

		def find(self, key): # ���� Ʈ������ �����͸� ã�� �κ� 
			return self._find_value(self.root, key) 

		def _find_value(self, root, key): 
			if root is None or root.data ==key: 
				return root is not None 
			elif key <root.data: 
				return self._find_value(root.left, key) 
			else : 
				return self._find_value(root.right, key) 
		def delete(self, key) : # ���� Ʈ������ �����͸� ����� �κ� 
			self.root, deleted = self._delete_value(self.root, key) 
			return deleted 
		def _delete_value(self, node, key) :
			if node is None : 
				return node, False 

			deleted=False 
			if key == node.data : 
				deleted = True 
				if node.left and node.right : 
					parent, child = node, node.right 
					while child.left is not None : 
						parent, child = child, child.left 
					child.left = node.left 
					if parent != node: 
						parent.left=child.right 
						child.right = node.right 
					node = child 
				elif node.left or node.right : 
					node = node.left or node.right 
				else: 
					node = None 
			elif key < node.data: 
				node.left, deleted = self._delete_value(node.left, key) 
			else : 
				node.right, deleted = self._delete_value(node.right, key) 
			return node, deleted 
		
		def DFTravel(self): # �����͸� ����ϴ� �κ� 
			def _DFTravel(root): 
				if root is None: 
					pass 
				else : 
					print(root.data, end=' ') 
					_DFTravel(root.left) 
					_DFTravel(root.right) 
				_DFTravel(self.root) 
			def LFTravel(self): # �����͸� ����ϴ� �κ� 
				def _LFTravel(root) : 
					if root is None : 
						pass
					else: 
						_LFTravel(root.left) 
						print(root.data, end=' ') 
						_LFTravel(root.right) 
				_LFTravel(self.root) 

		def LRTravel(self): # �����͸� ����ϴ� �κ� 
			def _LRTravel(root) : 
				if root is None: 
					pass 
				else : 
					_LRTravel(root.left) 
					_LRTravel(root.right) 
					print(root.data, end=' ') 
			_LRTravel(self.root) 

		def layerTravel(self): # �����͸� ����ϴ� �κ� 
			def _layerTravel(root) : 

				queue = [root] 
				while queue : 
					root = queue.pop(0) 
					if root is not None : 
						print(root.data, end=' ') 
						if root.left : 
							queue.append(root.left) 
						if root.right: 
							queue.append(root.right) 
			_layerTravel(self.root)
```

 * **결과**
 ```
	True
	False
	True
	True
	False

	@@@@@@@
	20 8 7 12 9 32 32 65
	=====
	7 8 9 12 20 32 32 65
	*****
	7 9 12 8 32 65 32 20
	&&&&&
	20 8 32 7 12 32 65 9
 ```

 ### 힙
 트리 자료구조의 활용 예로서 힙(Heap)을 보자.