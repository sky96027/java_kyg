package day15;

import java.util.*;

public class ExeListEx3 {

	public static void main(String[] args) {
		/* 오늘의 할일을 5개 입력받아 출력하는 코드를 작성하세요.
		 * 단, 리스트 이용
		 * 방법1. 오늘의 할일을 String으로 관리하는방법*/

		ArrayList<String> todoList1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("오늘의 할일 : ");
			String tmp = scan.nextLine();
			todoList1.add(tmp);
		}
		System.out.println(todoList1);
		scan.close();
	}



}