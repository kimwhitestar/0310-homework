package t2_System;

public class Test1 {

  public static void main(String[] args) {
    int i, tot=0;
    System.out.println("1~100까지의 합을 구하는데, "
    + "이때 그 합이 1000을 넘는 순간 프로그램을 강제로 종료시키시오.");
    
    for(i=1; i<=100; i++) {
      tot += i;
      if(tot > 1000) {
        System.out.println("tot 값이 1000을 넘어서 작업을 강제로 종료합니다");
        //#######시스템 강제종료#######
        System.exit(0);
        //#########################
      }
      System.out.println("1~100까지의 합? " + tot);
    }
  }
}
