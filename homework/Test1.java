/*
 * (문제1) String msg3 = Welcom to 코리아~ !~~ !~~~ !";
 * 변수에 저장된 공백의 위치값을 모두 출력하시오
 */
package homework;

public class Test1 {

  public static void main(String[] args) {
    String msg3 = "Welcom to 코리아~ !~~ !~~~ !";
    char[] charMsg = msg3.toCharArray();
    for(int i=0; i<charMsg.length; i++) {
      if(' ' == charMsg[i]) {
        System.out.println("' ' index = " + i);
      }
    }
    
    int idx = 0;
//    msg3 = "asdfg";
    for(int j=0; j<msg3.length(); j++) {
      idx = msg3.indexOf(" ", idx);
      if(0 > idx) { //-1
        System.out.println("문자없음");
        break;
      }
      if(idx == msg3.lastIndexOf(" ")) {
        System.out.println("idx=" + idx);
        break;
      } else {
        System.out.println("idx=" + idx);
        idx++;
      }
    }
  }
}
