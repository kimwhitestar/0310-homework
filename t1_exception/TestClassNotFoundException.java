package t1_exception;

public class TestClassNotFoundException {
  public static void main(String[] args) {
    try {
      Class.forName("java.lang.String");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
