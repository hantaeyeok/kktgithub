package behavioral.iterator;

public class Sheep implements Animal {

	@Override
	public void eat() {
		System.out.println("주로 길쭉한  풀을 뜯어 먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("앉아서 잠을 잠니다.");
	}

	@Override
	public void soud() {
		System.out.println("메헤에~!");
	}
	
}
