package t1_Object;

public class TestHashCode {
  String str;
  public TestHashCode(String str) {
    this.str = str;
  }
  public static void main(String[] args) {
    String str1 = new String("홍길동");
    String str2 = new String("홍길동");
    String str3 = new String("홍길순");
    
    if(str1==str2) {
      System.out.println("str1과 str2는 같다");
    } else {
      System.out.println("str1과 str2는 같지 않다");
    }
    if(str1.equals(str3)) {
      System.out.println("str1과 str3는 같다");
    } else {
      System.out.println("str1과 str3는 같지 않다");
    }
    Object obj1 = str1;
    Object obj2 = str2;
    if(obj2.toString().equals(obj1.toString())) {
      System.out.println("obj1과 obj2는 내용이 같다");
    } else {
      System.out.println("obj1과 obj2는 내용이 다름");
    }
    if("냉장고".equals(new TestHashCode("냉장고").toString())) {
      System.out.println("같을 수 없을텐데");
    }
    Object1 object1 = new Object1("김말자", "40", "여자", "서울");
    Object1 object2 = new Object1("김말자", "40", "여자", "서울");
    if(object1.equals(object2)) {
      System.out.println("???");
    }
    if(object1 instanceof Object) {
      System.out.println("Object타입이다");
    }
    
    
    
    //객체비교
    /*
    TestHashCode hash1 = new TestHashCode("냉장고");
    TestHashCode hash2 = new TestHashCode("냉장고");
    TestHashCode hash3 = new TestHashCode("오디오");
    */
//    if(hash1) {
//      
//    }
    
    
  }
}
