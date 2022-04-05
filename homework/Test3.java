/*
(문제3) 전화번호 4자리를 서로 중복하지 않고 다양하게 만들기.
① 사용자는 '지역명'와 '국번호'를 입력한다.(이때 지역번호를 배열에 저장시켜두고, 입력된 '지역명'과 같은 '지역번호'를 배열에서 찾아서 '지역번호'를 완성한다.)
  예: 지역명을 입력하세요? 서울
    국번호를 입력하세요? 656
② random() 메소드를 사용하여 전화번호 4자리를 완성한다. 이때 4자리의 전화번호는 서로 중복되지 않아야 한다.
③ 2번에서 만들어진 전화번호 5개를 화면에 출력시켜주고, 그중에서 사용자가 1개를 선택하게 한다.
  예: 1번: 2357,  2번: 5421,  3번 6548,  4번: 8930,  5번: 9231
    앞에 출력된 5개의 번호중 마음에 드는 번호 1개를 선택하세요? 3
④ 사용자의 선택이 끝나면, 최종적으로 선택된 '지역번호-국번호-전화번호'를 출력시켜준다.
  선택하신 전화번호는 02-656-6548 입니다.
  다시 전화번호를 만들어 드릴까요?(Y/N) N
  당신의 전화번호는? 02-656-6548 입니다.
 */
package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Telephone telPhone = new Telephone();
    Scanner sc = new Scanner(System.in);
    String areaCode = null, inputAreaName = null;
    String inputDialingNumber = null;
    String[] attaingNumberRandom = null;
    int inputAttaingNumberRandomNo = 0;
    String editPhoneNumber = null;
    BigInteger quotient = null;
    boolean loop = false;
    
    //if(1 == phoneKind) {}//1:Telephone, 2:InternetPhone, 3:HP
    loop = true;
    while(loop) {
      System.out.print("지역명을 입력하세요?");
      inputAreaName = sc.next();
      areaCode = telPhone.getAreaCode(inputAreaName);
      telPhone.setAreaCodeFlg(areaCode);
      if(telPhone.getAreaCodeFlg()) loop=false;
    }
    //NEW PHONE-AreaCode
    telPhone.setAreaCode(areaCode);
    
    loop = true;
    while(loop) {
      System.out.print("\n국번호를 입력하세요?");
      inputDialingNumber = sc.next();
      if(telPhone.validateDialingNumber(inputDialingNumber)) loop=false;
    }
    //NEW PHONE-DialingNumber
    telPhone.setDialingNumber(inputDialingNumber);
    
    loop = true;
    attaingNumberRandom = telPhone.getAttaingNumberRandom();
    System.out.printf("\n1번: %s,  2번: %s,  3번: %s,  4번: %s,  5번: %s",
      attaingNumberRandom[0], attaingNumberRandom[1], attaingNumberRandom[2],
      attaingNumberRandom[3], attaingNumberRandom[4]);
    while(loop) {
      System.out.print("\n앞에 출력된 5개의 번호중 마음에 드는 번호 1개를 선택하세요?");
      inputAttaingNumberRandomNo = sc.nextInt();
      if(0 < inputAttaingNumberRandomNo && 6 > inputAttaingNumberRandomNo) loop = false;
    }
    //NEW PHONE-AttaingNumber
    telPhone.setAttaingNumber(attaingNumberRandom[inputAttaingNumberRandomNo-1]);
    
    loop = true;
    //NEW PHONE:'지역번호-국번호-전화번호'
    editPhoneNumber = telPhone.getAreaCode()
        + telPhone.getDialingNumber()
        + telPhone.getAttaingNumber();
    telPhone.setPhoneNumber(new BigInteger(editPhoneNumber));
    while(loop) {
      //HP:0XX-XXXX-XXXX(0+10자리)//02-999-9999 < 030-000-0000 : 서울권
      quotient = (BigInteger)telPhone.getPhoneNumber()
          .divide(new BigInteger("30000000"));//몫(quotient):0 or 10,13,16,20
      if(String.valueOf(quotient).equals("0")) 
        System.out.printf("\n선택하신 전화번호는 %s 입니다.", 
          String.format("%02d-%3d-%4d", telPhone.getPhoneNumber()));//0:서울권
      else 
        System.out.printf("\n선택하신 전화번호는 %s 입니다.", 
          String.format("%03d-%3d-%4d", telPhone.getPhoneNumber()));//10,13,16,20:지역권
      System.out.print("\n다시 전화번호를 만들어 드릴까요?(Y/N)");
      if(sc.next().toUpperCase().equals("N")) loop = false;
    }
    if(String.valueOf(quotient).equals("0")) 
      System.out.printf("\n당신의 전화번호는? %s 입니다.", 
        String.format("%02d-%3d-%4d", telPhone.getPhoneNumber()));//0:서울권
    else 
      System.out.printf("\n당신의 전화번호는? %s 입니다.", 
        String.format("%03d-%3d-%4d", telPhone.getPhoneNumber()));//10,13,16,20:지역권
  }
}
