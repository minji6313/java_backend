package jungsuk_0624;

import java.util.TreeSet;

public class Ex1_TreeSetBasic {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for (int i = 50; i >0; i-=2) {  treeSet.add(i);      }
		System.out.println(treeSet.toString());
		//출력 : [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
		
		//#1.first() : 정렬된 순서에서 가장 작은 객체를 반환
		System.out.println(treeSet.first()); //출력 : 2
		
		//#2.last() : 정렬된 순서에사 가장 큰 (마지막 순서) 객체를 반환
		System.out.println(treeSet.last()); //출력 : 50 
		
		//#3.lower(E element) : 매개변수로 입력된 원소보다 작은 수들 중 가장 큰 수를 리턴
		System.out.println(treeSet.lower(26)); //출력 : 24
		
		//#4.higher() : 매개변수로 입력된 원소보다 큰 수들 중 가자 작은 수를 리턴
		System.out.println(treeSet.higher(26)); //출력 : 28
		
		//#5.floor(E element) : 입력된 매개변수의 원소와 비교하여 같거나 작은 수들 중 가장 큰 수를 리턴
		System.out.println(treeSet.floor(25)); //출력 : 24
		System.out.println(treeSet.floor(26)); //출력 : 26
		
		//#6.ceiling(E element) : 입격된 매개변수의 원소와 비교하여 같거나 큰 수들 중 가장 작은 수를 리턴
		System.out.println(treeSet.ceiling(25)); //출력 : 26
		System.out.println(treeSet.ceiling(26)); //출력 : 26
		
		

	}

}
