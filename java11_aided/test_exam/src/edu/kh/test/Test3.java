package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); //List<Integer> list = null;	//list 선언만 있으므로 객체 생성이 되어 있지 않아 NullPointerException이 발생
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add(1); //list.add(1.23456);	//List의 선언시 요소의 데이터 타입이 Integer로 설정되어 있으므로 정수만 입력 받을 수 있으므로 데이터 타입 오류 발생

		for(int num : list) {
			char ch;
			
			if(num < 0) { //if(num <= 0) {	//if문의 조건에서 0을 포함하여 음수라고 표현했으므로 0이어도 음수가 발생하고, 0인 경우의 정상으로 처리되어야 할 else문이 실행되지 않는 오류 발생
				ch = '-';
			} else if(num > 0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			
			//int Math.abs(정수) : 정수의 절대값을 반환
			for(int i=1 ; i<=Math.abs(num) ; i++) { //for(int i=1 ; i<Math.abs(num) ; i++) { //for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어 => 해당 숫자의 횟수 만큼 부호를 출력해야 되는데 한 번씩 덜 출력
				System.out.print(ch); 
			}
			System.out.println();
		}
		
	}
}
