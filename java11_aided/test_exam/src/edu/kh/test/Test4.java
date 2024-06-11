package edu.kh.test;

import com.kh.test4.model.Person;

public class Test4 {
	
	public static void main(String[] args) {

		Person[] pArr = new Person[3]; 	
		pArr[0] = new Person("김기태", 43); pArr[1] = new Person("이성하", 54); pArr[2] = new Person("이예린", 61); //비어 있거나 초기화 되어 있지 않은 pArr 배열에 Person 객체를 생성하여 각 요소(0~2)에 생성된 객체를 대입
		for(int i=0; i < pArr.length; i++) { //for(int i=0; i <= pArr.length; i++) { //실제 선언한 배열의 개수보다 더 많은 수의 반복 실행이 된다.(요청한 횟수가 배열수보다 더 크다.) => ArrayIndexOutOfBoundsException 발생   
			System.out.println(pArr[i].getName());	//Person 의 배열요소인 pArr 객체가 초기화(값이 대입)되어 있지 않아 => NullPointerException이 발생
		}
		
	}
}
