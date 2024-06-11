package good;

public class Score {
	private int no;	//학번
	private Subject subject;	//과목
	private int point;	//점수
	public Score() {}
	public Score(int no, Subject subject, int point) {
		super();
		this.no = no;
		this.subject = subject;
		this.point = point;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Score [no=" + no + ", subject=" + subject + ", point=" + point + "]";
	}
	
}
