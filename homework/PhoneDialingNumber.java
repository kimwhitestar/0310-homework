package homework;

public interface PhoneDialingNumber {
  //국번호
  public String dialingNumber = null;//범위:001~999
//  public String[] dialingNumber = new String[998];//동네 국번호 3자라의 범위:모름
//  public String[] getDialingNumber();
//  public int getDialingNumber(String dialingNumber);
  public String getDialingNumber();
  public void setDialingNumber(String dialingNumber);
//  public void setDialingNumber(String dialingNumber, int no);//update
//  public void setDialingNumber(int no);//delete
  public boolean validateDialingNumber(String dialingNumber);
}
