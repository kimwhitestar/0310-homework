package t1_exception;

public class TestNumberFormatException {
  public static void main(String[] args) {
    String data1 = "100";
    String data2 = "seoul";
    int data3 = 300;
    
    try {
      System.out.println("data1 + 200 =" + data1 + 200);
      
      int intData1 = Integer.parseInt(data1);//ok
      System.out.println(intData1);
      
      //java.lang.NumberFormatException: 
      //For input string: "seoul"
      int intData2 = Integer.parseInt(data2);//error
    } catch(NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
