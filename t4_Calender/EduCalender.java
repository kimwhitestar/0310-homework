package t4_Calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EduCalender {

  public static void main(String[] args) {
    //long now = System.currentTimeMillis();
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONDAY);
    int day = now.get(Calendar.DAY_OF_MONTH);
    int date = now.get(Calendar.DATE);

    System.out.println(String.format("yyyy-MM-dd : %tF", now));
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
    String strNow = sdf.format(now.getTimeInMillis());
    System.out.println(strNow);
  }
}
