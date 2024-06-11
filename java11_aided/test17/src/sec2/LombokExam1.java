package sec2;

public class LombokExam1 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kkt");
		mem1.setPw("1234");
		mem1.setPoint(30);
		System.out.println(mem1.toString());
		Board board = new Board();
		board.setBno(10);
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setViewCnt(1);
	}
}
