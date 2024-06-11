package sec1;
//ClassCastException : 형 변환시 발생하는 예외
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }
public class ExceptionExam5 {
	public static void main(String[] args) {
		Animal ani1 = new Dog();
		Animal ani2 = new Cat();
		changeAnimal(ani2);
		
		Cat ani3 = new Cat();
		changeAnimal(ani3);
	}
	public static void changeAnimal(Animal animal) {
		try {
			Dog dog = (Dog) animal;
		} catch(ClassCastException e) {
			System.out.println("형제나 다른 패키지에 있는 클래스는 형 변환 불가");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알 수 없는 예외");
			e.getMessage();
		} finally {
			System.out.println("작업 종료");
		}
	}
}
