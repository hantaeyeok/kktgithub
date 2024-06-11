package kr.ed.haebeop.test;

import kr.ed.haebeop.domain.Days365;
import kr.ed.haebeop.domain.Holiday;
import kr.ed.haebeop.util.DatePicker;
import kr.ed.haebeop.util.Holyday;
import kr.ed.haebeop.util.LunarCalendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HolidayTest {
    public static void main(String[] args) throws Exception {
        DatePicker datePicker = new DatePicker();
        List<Days365> daysList = datePicker.generatorHoliday("2023");  //해당 년도의 국경일 생성

        for(Days365 day:daysList){  //국경일 출력
            Calendar cal = day.getCal();
            String wk = datePicker.generateWeekDay2(cal);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH) + 1;
            int date = cal.get(Calendar.DAY_OF_MONTH);
            System.out.println(year+"-"+month+"-"+date+"("+wk+") : "+day.getName());
        }

        LunarCalendar lunar = new LunarCalendar();
        String sunDate = "2023-10-01";
        String lunarDate = lunar.getLunar(sunDate); //해당 날짜의 음력

        String wk = lunar.getWeekday(lunar.parseCalendar(sunDate)); //해당 날짜의 요일
        System.out.println("양력 :"+sunDate);
        System.out.println("음력 :"+lunarDate);
        System.out.println("요일 : "+wk);

        Holyday holi = new Holyday();

        List<Holiday> holiList = holi.getHolidayList(sunDate);
        //model.addAttribute("holiList", holiList);
        //<c:forEach var="holi" items="${holiList}">
        //${holi.dateName}
        //</c:if>
        for(Holiday holiday:holiList){
            System.out.println(holiday.toString());
        }

        //해당 월의 달력
        List<String[]> calList = datePicker.getDatePicker("202310");
        for(String[] row:calList){
            for(String col:row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }
}
