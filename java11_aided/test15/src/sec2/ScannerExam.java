package sec2;

import java.util.Scanner;

class Person {
	private String name;
	private int point;
	private double weight;
	public Person() { }
	public Person(String name, int point, double weight) {
		super();
		this.name = name;
		this.point = point;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", point=" + point + ", weight=" + weight + "]";
	}
	
}
public class ScannerExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("점수 입력 : ");
		int point = sc.nextInt();
		
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString());
	}
}
