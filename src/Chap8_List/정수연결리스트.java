package Chap8_List;
//단순한 linked list에서 insert, delete하는 알고리즘을 코딩: 1단계

import java.util.Random;
import java.util.Scanner;

class Node1 {
	int data;
	Node1 link;

	public Node1(int element) {
		data = element;
		link = null;
	}
}

class LinkedList1 {
	Node1 first;

	public LinkedList1() {
		first = null;
	}

	public int Delete(int element) // delete the element
	{	Node1 tmp = new Node1(element);
		Node1 p = first , q = null;
		while (p != null) {
			if (p.data == element) {
				q.link = p.link;
				
			}
			else {
				q = p;
				p = p.link;
				
			}
		}

	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node1 p = first;
		
		while (p != null) {	// p가 null이 아닌 동안 반복 
			System.out.print(p.data + " ");
			p = p.link;
		}
		System.out.println();
	}

	public void Add(int element) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{
		Node1 tmp = new Node1(element);
		Node1 p = first, q = null;
		if (p == null) {			
			first = tmp;
			return;
		}
		while (p != null) {			
			if (element < p.data) {
				tmp.link = p;
				if (q != null) 
					q.link = tmp;
				else
					first = tmp;
				return;
			}
			else {
				q = p;
				p = p.link;
				if (p == null) {
					q.link = tmp;
					return;
				}
			}
			
		}
		
		
	}

	public boolean Search(int data) { // 전체 리스트를 순서대로 출력한다.
		return true;
	}
}

public class 정수연결리스트 {
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // 메뉴
		Random rand = new Random();
		System.out.println("Linked List");
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		int data = 0;
//		System.out.println("inserted");		// 테스트용
//		l.Show();
		do {
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				data = rand.nextInt(20);
				//double d = Math.random();
				//data = (int) (d * 50);
				l.Add(data);
				break;
			case Delete: // 머리 노드 삭제
				data = sc.nextInt();
				int num = l.Delete(data);
				System.out.println("삭제된 데이터는 " + num);
				break;
			case Show: // 꼬리 노드 삭제
				l.Show();
				break;
			case Search: // 회원 번호 검색
				int n = sc.nextInt();
				boolean result = l.Search(n);
				if (!result)
					System.out.println("검색 값 = " + n + "데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + "데이터가 존재합니다.");
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}
}
