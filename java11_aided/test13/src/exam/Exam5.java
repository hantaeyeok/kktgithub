package exam;
@FunctionalInterface
interface Calc {
	public int add(int num1, int num2);
}
public class Exam5 {
	public static void main(String[] args) {
		Calc c1 = (int num1, int num2) -> {
			return num1+num2;
		};
		System.out.println(c1.add(100, 200));
	}
}
