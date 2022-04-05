/*
지역번호  지역
02  서울특별시
031 경기도
032 인천광역시
033 강원도
041 충청남도
042 대전광역시
043 충청북도
044 세종특별자치시
051 부산광역시
052 울산광역시
053 대구광역시
054 경상북도
055 경상남도
061 전라남도
062 광주광역시
063 전라북도
064 제주특별자치도

예외지역번호  지역(예외지역 코딩은 다음에)
02  경기도 과천시
02  경기도 광명시
02  경기도 구리시
02  경기도 부천시
02  경기도 시흥시
031 경기도 시흥시
02  경기도 고양시 덕양구 
031 경기도 고양시 덕양구 
031 경기도 고양시 일산동구 
031 경기도 고양시 일산서구 
031 경기도 안산시 상록구
031 경기도 안산시 단원구
032 경기도 부천시
031 경기도 안양시 만안구
031 경기도 안양시 동안구
031 경기도 구리시
041 충청남도 공주시
042 충청남도 공주시
042 충청남도 계룡시
053 경상북도 경산시
=========================
참고자료
-------------------------
지역번호 : https://ko.wikipedia.org/wiki/대한민국의_전화번호_체계#지역_번호_(02,_0NZ)
-------------------------
예외지역번호 : 114웹페이지 지역번호조회에서 위의 예외지역만 재검색 후 지역번호 바꿈
https://www.114.co.kr/search?tab=areaCode
#########################
국번호는 웬지 동네마다 다른 것 같은데, 참고자료에는 없네요ㅜㅜ
114에서는 동네별로 지역번호가 검색되지만, 시간상 다음에 할게요
#########################
 */
package homework;

import java.util.Arrays;

public class Telephone extends Phone implements TelephoneAreaCode, PhoneDialingNumber, PhoneAttaingNumber {  
  //국번호
  public String dialingNumber = null;//범위:001~999
  
  public String[] attaingNumberRandom = new String[5];//랜덤번호 5개(범위:0001~9999)
  public String attaingNumber = null;

  @Override
  public String getAreaCode(String areaCodeName) {
    String areaCode = null;
    int no = Arrays.binarySearch(TelephoneAreaCode.AREA_CODE_NAME, areaCodeName);
    if(-1 < no) areaCode = TelephoneAreaCode.AREA_CODE[no];
    return areaCode;
  }

  @Override
  public String getAreaCode() {
    return TelephoneAreaCode.areaCode;
  }

  @Override
  public void setAreaCode(String areaCode) {
    TelephoneAreaCode.areaCode = areaCode;
  }
  
//  @Override
//  public String getAreaName() {
//    return TelephoneAreaCode.areaName;
//  }
//
//  @Override
//  public void setAreaName(String areaName) {
//    TelephoneAreaCode.areaName = areaName;
//  }

  @Override
  public boolean getAreaCodeFlg() {
    return TelephoneAreaCode.areaCodeFlg;
  }

  @Override
  public void setAreaCodeFlg(String areaCode) {
    if(null != areaCode) TelephoneAreaCode.areaCodeFlg = true;
    else TelephoneAreaCode.areaCodeFlg = false;
  }

  @Override
  public String getDialingNumber() {
    return PhoneDialingNumber.dialingNumber;
  }

  @Override
  public boolean validateDialingNumber(String dialingNumber) {
    //'001~999'숫자패턴 유효성 체크
    return dialingNumber.matches("[0][0][1-9]|[0-9][1-9][0-9]|[1-9][0-9][0-9]");
    /*#########################
    ######## [] 내 ^시작은 부정의미(not)
    ######## \s  공백 문자
    ######## \S  공백 문자가 아닌 나머지 문자
    ######## \w  알파벳이나 숫자
    ######## \W  알파벳이나 숫자를 제외한 문자
    ######## \d  [0-9]와 같음
    ######## \D  숫자를 제외한 모든 문자
    ######## (?i)  대소문자 구분 안함
    #########################*/
  }

  @Override
  public void setDialingNumber(String dialingNumber) {
    PhoneDialingNumber.dialingNumber = dialingNumber;
  }

  @Override
  public String getAttaingNumber() {
    return PhoneAttaingNumber.attaingNumber;
  }

  @Override
  public String[] getAttaingNumberRandom() {
    //(int)(Math.random()*10+1); 최대값(증감영향받음) + 시작값(증감값으로 시작가능) 
    String[] attaingNumberRandom = { 
        String.format("%04d", (int)Math.random() * 9999 + 1),
        String.format("%04d", (int)Math.random() * 9999 + 1),
        String.format("%04d", (int)Math.random() * 9999 + 1),
        String.format("%04d", (int)Math.random() * 9999 + 1),
        String.format("%04d", (int)Math.random() * 9999 + 1)
    };
    return attaingNumberRandom;
  }

  @Override
  public void setAttaingNumber(String attaingNumber) {
    PhoneAttaingNumber.attaingNumber = attaingNumber;
  }
}
