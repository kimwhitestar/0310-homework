package t4_String;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

public class TestGetBytesEncodingUtf8 {
  public static void main(String[] args) {
    long now = System.currentTimeMillis();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
    String strNow = sdf.format(now);
    System.out.println(strNow);
    System.out.println("-------------------------");
    String str10 = new String("Welcom to Korea!");
    System.out.println(str10.contains("!"));
    System.out.println(str10.concat(",Japan!"));//출력용으로만!!내용안바뀜!
    System.out.println(str10.replace("Korea", "USA, Korea"));
    str10.trim();//앞 뒤 공백제거
    str10.startsWith("Welcom To");//앞에서 부터 접두사 비교
    str10.endsWith("Welcom To");//뒤에서 부터 접미사 비교
    System.out.println("########################");
    String[] strArr = str10.split(" ");
    for(int i=0; i<strArr.length; i++) strArr[i] += "@hanmail.net"; 
    str10.join(";", strArr); //배열에 ';'문자추가해서, join으로 String문자열 붙임
    System.out.println(str10);
    System.out.println("########################");
    
    String str1 = "안녕하세요";
    String str2 = "Hello";
    System.out.println(str1.length());
    System.out.println(str2.length());
    
    byte[] b3 = new byte[1024];//보통 1024byte씩 잘라서 보냄
    byte[] b1 = str1.getBytes();
    System.out.println(b1.length);
    System.out.println(b1[0]);
    
    //인코딩/디코딩 예제
    try {
      byte[] b5 = str1.getBytes("EUC  _KR");//인코딩
      System.out.println("EUC_KR b5[0] : " + b5[0]);
      //이동 후 다시 전송되어온 자료를 받기위해 디코딩
      String str5 = new String(b5, "EUC_KR");//디코딩
      System.out.println(str5);
      
      byte[] b8 = str1.getBytes("UTF-8");//인코딩
      System.out.println("UTF-8 b8[0] : " + b8[0]);
      String str8 = new String(b8, "UTF-8");//디코딩
      System.out.println(str8);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
    
  }
}
