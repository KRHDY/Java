package LinkedList;

import java.util.Iterator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {		
		test1();
	}

	private static void test1() {
		List<String> list = new LinkedList<>();
		String [] sArr = {"자동차","운동장","유치원","학교","황대영"};
//		list.add("자동차")
		for (String s : sArr) list.add(s);	// for each 문	
		System.out.println(list); // ArrayList의 toString()메소드가 이용됨
		
		for (int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println(); 
		
		for (String s : list) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		Iterator<String> iter = list.iterator();
			while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
			}
			
		System.out.println();
			// 위 코드 왜 {}를 쓰지않아도 될까?
			// unchecked exception은 버그다.
			// 이런 exception 자체가 발생하지 않게 코딩해라
			
			// overloading된 add 메소드로 원ㄴ손를 중간에 삽입 할 수있다
		list.add(1,"벚꽃");
			// 배열 리스트에 추가
		iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
			//hasNext 를 다시 쓰고싶으면 iter = list.iterator를 다시해야
		
		System.out.println();
			// 배열을 삭제 할 수 있는 메소드
//		list.remove() ;
		
			// 마지막 원소 삭제하고싶으면?
			// 원소수 -1
		
//		list.remove(list.size()-1);
//		
//		while(list.size()>0) {
//			list.remove(0);
//		}
		// 1번, 첫번째 원소만 1번 삭제된다. 2번 다 삭제된다.
		
		list.remove(3); // 네번째 원소 삭제
		System.out.println(list);
	
	
	
	
	
	}
}
