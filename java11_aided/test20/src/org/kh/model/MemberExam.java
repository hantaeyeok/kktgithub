package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	boolean sw = true;
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
	}
	//메뉴를 반복 호출하고, 키보드에서 각 해당 번호를 누르면 각 작업이 이루어 질 수 있도록 하시오.
	public void mainCall() { //1. 회원 가입, 2. 회원 목록, 3. 회원 삭제, 4. 프로그램 종료
		while(sw) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 삭제"); 
			System.out.println("4. 프로그램 종료");
			System.out.print("작업 번호 : ");
			int job = sc.nextInt();
			switch(job) {
				case 1:
					add();
					break;
				case 2:
					info();
					break;
				case 3:
					remove();
					break;
				default:
					System.out.println("프로그램 종료");
					sw = false;
			}
		}
	}
	
	public void add() {
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("레벨 입력 : ");
		int mcode = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.print("전화번호 입력 : ");
		String tel = sc.next();
		System.out.print("출생년도 입력 : ");
		int year = sc.nextInt();
		memList.add(new Member(mcode, name, pw, tel, year, id));
		System.out.println("새로운 회원 등록");
	}
	public void info() {
		for(Member s:memList) {
			System.out.println(s.toString());
		}
	}
	public void remove() {
		System.out.print("제거할 회원 아이디 입력 : ");
		String id = sc.next();
		for(int i=0;i<memList.size();i++) {
			if(memList.get(i).getId().equals(id)) {
				System.out.println("제거 : "+memList.get(i).toString());
				memList.remove(i);
			}
		}
	}
}
