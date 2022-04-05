package t1_exception;

public class TestArrayException {
  public static void main(String[] args) {
    String[] arrStr = null;
    int[] arrInt = {};
    int[] arrInt2 = {1};
    int a;
    
    try {
      //in thread "main" java.lang.ArrayIndexOutOfBoundsException
      //Index 1 out of bounds for length 1
      //a = arrInt2[1];
        
      //Cannot read the array length 
      //because "arrStr" is null
      //a = arrStr.length;
      
      //in thread "main" java.lang.ArrayIndexOutOfBoundsException
      //Index 0 out of bounds for length 0
      a = arrInt[0];//error
      a = arrInt.length;//ok
    } catch(ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    }
  }
}
