package sec1;
//Enum : 열거형으로 상속이나 인스턴스를 생성할 수 없음 => public, static, final
//데이터 값의 의미를 명확하게 해야 하거나 컴파일시에 데이터 타입 및 유효성 체크를 하려고 할 경우 활용
enum Week1 { //상수 => 대문자로 순서에 맞게 열거
	SUN, MON, TUE, WED, THU, FRI, SAT
}
//valueOf(String str) - 문자열 str과 일치하는 열거값을 반환
//values() : 열거(값)형 전체를 배열로 반환
//ordinal() : 열거(값)형 순서를 반환
enum Week2 {
	SUN("일"), MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토");
	final private String day;
	
	Week2(String day){
		this.day = day;
	}
	
	String getDay() {
		return day;
	}
}
public class EnumExam1 {
	public static void main(String[] args) {
		String s = "MON";
		Week1 w1 = Week1.SUN;
		Week2 w2 = Week2.valueOf(s);
		
		System.out.println(w1);
		System.out.println(w2);
		
		Week1[] arrWeek1 = Week1.values();
		for(Week1 w:arrWeek1) {
			switch(w) {
				case SAT:
					System.out.println("토요일");
					break;
				case SUN:
					System.out.println("일요일");
					break;
				default:
					System.out.println("평일");
			}
		}
		
		Week2[] arrWeek2 = Week2.values();
		for(Week2 w:arrWeek2) {
			//if(w == Week2.MON) {
				System.out.println();
				System.out.println(w.ordinal()+ "번째 요일 => "+ w.getDay());
			//}
		}
	}
}
