package t1_exception;

public class TestMultiException {
  public static void main(String[] args) {
    try {
      String data1 = args[0];
      String data2 = args[1];
      String data3 = args[3];
      String data4 = args[4];//값 없는 방 호출
      
      System.out.println("data1 =" + data1);
      System.out.println("data2 =" + data2);
      
      //Type mismatch: cannot convert from String to int
      //int res = data1 + data2;
      
      //java.lang.NumberFormatException: 
      //For input string: "a300"
      int res = Integer.parseInt(data3 + data2); //exception1
      
      //java.lang.ArrayIndexOutOfBoundsException: 
      //Index 4 out of bounds for length 4
      System.out.println(data4); //exception2 ------마지막 exception만 출력됨
      
      Class.forName("t2_exception.TestClassNotFoundException");//패키지명 오류입력했는데
    } catch(NumberFormatException e) {
    } catch(ArrayIndexOutOfBoundsException e) {
    } catch (ClassNotFoundException e) {
      e.printStackTrace(); //에러가 안나네ㅜㅜ
    }
  }
}
