/* Telephone, InternetPhone, HP 등 */
package homework;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Phone {
  public static final BigInteger PHONE_UNIQ_RANGE = new BigInteger("30000000");//서울권 or 지역권
  //public static final BigInteger HP_UNIQ_RANGE1 = new BigInteger("1100000000");//010 or 011<HP(10자리)>
  //public static final BigInteger HP_UNIQ_RANGE6 = new BigInteger("1600000000");//016<HP(10자리)>
  //public static final BigInteger HP_UNIQ_RANGE9 = new BigInteger("1900000000");//019<HP(10자리)>
  
  //전화번호
  public BigInteger phoneNumber;//범위:"001~999"+"0001~9999"+"0001~9999"
  public BigInteger[] allPhoneNumber;//범위:"001~999"+"0001~9999"+"0001~9999"
  //public static final short[] phoneKind = { 1, 2, 3 }; //1:Telephone, 2:InternetPhone, 3:HP
  public BigInteger getPhoneNumber() {
    return this.phoneNumber;
  }
  public void setPhoneNumber(BigInteger phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public boolean existPhoneNumber(BigInteger phoneNumber) {
    if (-1 < Arrays.binarySearch(this.allPhoneNumber, phoneNumber)) return true;
    else return false;
  }
  public int getPhoneNumberNo(BigInteger phoneNumber) {
    return Arrays.binarySearch(this.allPhoneNumber, phoneNumber);
  }
  public void setPhoneNumber(BigInteger phoneNumber, int no) { 
    this.allPhoneNumber[no] = phoneNumber;
  }
  public BigInteger[] getAllPhoneNumber() {
    return allPhoneNumber;
  }
  public void setAllPhoneNumber(BigInteger[] allPhoneNumber) { 
    this.allPhoneNumber = allPhoneNumber;
  }
  public BigInteger[] copyAllPhoneNumber() { 
    BigInteger[] copyAllPhoneNumber = Arrays.copyOf(this.allPhoneNumber, this.allPhoneNumber.length);
    return copyAllPhoneNumber;
  }
  public void sortArrayNumber(int order) {
    //Arrays.parallelSort(this.allPhoneNumber);//오름차순정렬(기본)
    Arrays.parallelSort(this.allPhoneNumber, Collections.reverseOrder());//내림차순정렬
  }
}
