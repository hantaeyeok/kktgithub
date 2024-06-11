package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {
	Scanner sc = new Scanner(System.in);
	List<Food> foodList = new ArrayList<>();
	
	public static void main(String[] args) {
		Test6 app = new Test6();
		app.mainMenu();
	}
	
	public void mainMenu() {
		boolean sw = true;
		while(sw) {
			System.out.println("=== 음식 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호 선택 : ");
			switch(sc.nextInt()) {
				case 1:
					add();
					break;
				case 2:
					info();
					break;
				case 3:
					remove();
					break;
				case 4:
					sw = false;
					break;
				default:
					System.out.println("종료");
					sw = false;
			}
		}
	}
	
	public void add() {
		System.out.print("추가할 음식 입력 : ");
		String name = sc.next();
		System.out.print("\n칼로리 입력 : ");
		int kcal = Integer.parseInt(sc.next());
		foodList.add(new Food(name, kcal));
		System.out.println("음식 정보가 추가되었습니다.");
	}
	
	public void info() {
		for(Food f:foodList) {
			System.out.println(f.toString());
		}
	}
	
	public void remove() {
		System.out.print("삭제하고 싶은 음식 선택 : ");
		String name = sc.next();
		Food fd;
		for(int i=0;i<foodList.size();i++) {
			fd = foodList.get(i);
			if(fd.getName().equals(name)) {
				System.out.println(fd.toString()+"이 삭제되었습니다.");
				foodList.remove(i);
			}
		}
	}
}
