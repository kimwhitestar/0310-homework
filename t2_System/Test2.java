package t2_System;

public class Test2 {
  public static void main(String[] args) {
    int i;
    long tot = 0;
    long startTime = System.nanoTime();
    
    for(i=1; i<=100000000; i++) {
      tot += i;
    }
    
    long endTime = System.nanoTime();
    long time = System.currentTimeMillis();
    System.out.println("long time=" + time);
    System.out.println(String.format("yyyy-MM-dd : %tF", time));
    
    System.out.println("1~"+(i-1)+"까지의 합 : "+tot);
    System.out.println("계산에 소모된 시간?" + (endTime - startTime));
  }
}
