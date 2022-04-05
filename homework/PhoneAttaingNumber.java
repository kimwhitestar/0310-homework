package homework;

public interface PhoneAttaingNumber {
  //전화번호 뒷자리
  public String[] attaingNumberRandom = new String[5];//랜덤번호 5개(범위:0001~9999)
  public String attaingNumber = null;
  //랜덤번호 5개
  public String[] getAttaingNumberRandom();
  public void setAttaingNumber(String attaingNumber);
  public String getAttaingNumber();
}
