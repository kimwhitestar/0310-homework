package t2_Class;

public class Test1 {
  public static void main(String[] args) {
    try {
      Class.forName("t2_Class.Sample");
      System.out.println("파일 존재");
      
      Class a = Sample.class;
      System.out.println("이름 : " + a.getName());
      System.out.println("패키지 : " + a.getPackageName());
      
      Class imgPath = Test1.class;
      System.out.println(imgPath.getResource("./images/abstract1.jpg").getPath());
      
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("파일 존재하지 않음");
    }
  }
}
