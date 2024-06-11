package sec1;
//ArrayIndexOutOfBoundsException : 배열의 범위를 초과하는 경우 발생
public class ExceptionExam3 {
	public static void main(String[] args) {
		int[] nArr = {90, 85, 100};
		int i = 0;
		while(i<=3) {
			try {
				System.out.println(nArr[i]);	//90 85 100 
				i++;
			} catch(ArrayIndexOutOfBoundsException e) {
				e.getMessage();
				break;
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("작업 종료"); //성공(try) 수행이든 실패(catch)이든 작업 후 반드시 실행
			}
		}
	}
}
