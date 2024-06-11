package creational.builder;
//Builder Pattern : 멤버 필드와 같은 구성원을 하나 하나 쌓아 올려 객체를 생성하는 패턴
//그러므로, Builder Pattern은 객체의 생성 단계를 캡슐화하여 구축 공정을 동일하게 이용하도록 하는 패턴
class Student {
	private int no;
	private String name = "홍길동";
	private int point = 0;
	private String phoneNumber = "010-0000-0000";
	public Student(int no, String name, int point, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
class StudentBuilder {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;
	
	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
	}
	
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Student build() {
		return new Student(no, name, point, phoneNumber);
	}

	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
public class BuilderPattern {
	public static void main(String[] args) {
		//StudentBuilder를 이용한 Student 객체 생성 -> 해당 멤버를 하나 씩 메소드체이닝 방법에 의해 추가하는 객체 생성 방식
		Student st1 = new StudentBuilder()
				.no(1001)
				.name("김기태")
				.point(80)
				.phoneNumber("010-1234-1004")
				.build();
		System.out.println(st1.toString());
		
		Student st2 = new StudentBuilder()
				.no(1002)
				.build();
		System.out.println(st2.toString());
		
		Student st3 = new StudentBuilder()
				.no(1003)
				.name("이성아")
				.build();
		System.out.println(st3.toString());
		
		Student st5 = new Student(1005, "이연정", 100, "010-2356-1278"); //생성자에 의한 Student 객체 생성
		System.out.println(st5.toString());
	}
}
