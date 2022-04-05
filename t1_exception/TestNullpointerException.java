package t1_exception;

public class TestNullpointerException {
  public static void main(String[] args) {
    String data = new String("atom");
    System.out.println("data="+data);
    String data2 = new String("100");
    System.out.println("data2="+data2);
    System.out.println("data2="+data2.toString());
    System.out.println("data2="+data2+100);
    System.out.println("data2="+data2.toString());

    int data3 = Integer.parseInt(data2);
    System.out.println("data3="+data3);
    
    String data4 = null;
    try {
      String data5 = data4 + 1;
      System.out.println(data4 +0);
      System.out.println(data5);
      
      //error//Cannot read field //"value" because "original" is null
      //String str = new String(data4); 
      
      //error//Cannot invoke() //"String.length()" because "str" is null
      //StringBuffer buffer = new StringBuffer(data4); 
      
      //error//Cannot invoke() //"String.toString()" because "data4" is null
      //System.out.println(data4.toString()); 
    } catch(NullPointerException e) {
      e.printStackTrace();
    } finally {
      System.out.println("1234567890");
    }
    
  }
}
