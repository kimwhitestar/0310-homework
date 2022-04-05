/*
(문제2) 아래 message변수에 저장된 문자열중에서, 
사용자가 영문 'a~z 또는 A~Z'까지의 임의의 문자를 입력하면, 
해당 문자가 전체 몇개 있는지와, 그 문자가 위치한 위치값을 출력하시오.
(대소문자는 구별하지않고 같은것으로 보고 처리하도록 합니다. (예: a랑 A는 같은문자로 간주됨))
message = "Welcome to Korea! Nice to meet you! Have a good time!"
예)  알파벳 문자 1개를 입력하세요?  a
    입력한 a 는 메세지내용중 2개가 있으며, 위치는 15, 37, 41번째 있습니다.
    계속 하시겠습니까?(y/n) n
    수고하셨습니다.
 */
package homework;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FindIndex myUtil = new FindIndex();
    String message = new String("Welcome to Korea! Nice to meet you! Have a good time!");
    System.out.println(message);
    String findStr;
    boolean isYN = true;
    while(isYN) {
      System.out.print("알파벳 문자 1개를 입력하세요.(예: a랑 A는 같은문자로 간주됨) ");
      findStr = sc.next();
      if(!findStr.matches("[a-z]") && !findStr.matches("[A-Z]")) continue;
      
      //입력받은 글자의 index위치 찾음//Promotion으로 가져온 Object를 다시 Casting(down casting)
      String[] arrFindIdx = (String[])myUtil.findAllIndex(message, findStr, true, true);
      String findAllIdx = (String)myUtil.findAllIndex(message, findStr, true, false);        
      int cntIdx = myUtil.getCntFindAllIndex();
      if(0 == cntIdx) System.out.printf("입력한 %s는 메세지내용중 없습니다\n", findStr);
      else System.out.printf("입력한 %s는 메세지내용중 %d개가 있으며, 위치는 %s번째 있습니다\n", findStr, cntIdx, findAllIdx);
      System.out.print("계속 하시겠습니까?(y/n)");
      if(!"Y".equals(sc.next().toUpperCase())) isYN = false;
    }
    System.out.println("\n수고하셨습니다.");
    sc.close();
  }
}