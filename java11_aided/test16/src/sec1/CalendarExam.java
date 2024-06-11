package sec1;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();	//Date today = new Date();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;	//0~11 이므로 +1
		int day = today.get(Calendar.DATE);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);	//년 중 몇 일째
		int dom = today.get(Calendar.DAY_OF_MONTH);	//월 중 몇 일째
		int dow = today.get(Calendar.DAY_OF_WEEK);	//주 중 몇 일째
		
		int hour12 = today.get(Calendar.HOUR);	//12시간제
		int hour24 = today.get(Calendar.HOUR_OF_DAY);	//24시간제
		int minute = today.get(Calendar.MINUTE);	//분
		int second = today.get(Calendar.SECOND);	
		int ampm = today.get(Calendar.AM_PM);
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);	//밀리초 => 시간(/1000/60/60)
		int lastDate = today.getActualMaximum(Calendar.DATE);	//마지막 날
		int firstDate = today.getActualMinimum(Calendar.DATE);
		
		System.out.println("현재 년도 : "+year);
		System.out.println("현재 월 : "+month);
		System.out.println("현재 일 : "+day);
		
		System.out.println("오늘은 "+year+"년의 "+doy+"일 째 날");
		System.out.println("오늘은 "+month+"월의 "+dom+"번째 날");
		System.out.println("오늘은 이번 주의 "+dow+"번째 날");

		String[] wk = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 "+wk[dow-1]+"요일입니다.");
		
		System.out.println("현재 시간(24시간제) - "+hour24+":"+minute+":"+second);
		System.out.print("현재 시간(12시간제) - ");
		if(ampm==0) {
			System.out.println("오전 "+hour12+":"+minute+":"+second);
		} else {
			System.out.println("오후 "+hour12+":"+minute+":"+second);
		}
		
		System.out.println("타임존 : "+(timeZone/1000/60/60));
		System.out.println("이 달의 마지막 날 : "+lastDate);
		System.out.println("이 달의 첫 번째 날 : "+firstDate);
	}
}
