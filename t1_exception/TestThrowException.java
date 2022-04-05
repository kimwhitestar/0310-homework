package t1_exception;

public class TestThrowException {
  public static void main(String[] args) throws ClassNotFoundException{
    findClass();
  }

  private static void findClass() throws ClassNotFoundException {
    Class.forName("java.lang.String");
  }
}
