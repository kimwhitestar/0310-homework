package homework;

import java.util.regex.PatternSyntaxException;

public class FindIndex {
  private int cntFindAllIndex;
  private int countFindAllIndex(String[] findAllIdx) {
    int cntFindAllIdx;
    if(isNull(findAllIdx)) cntFindAllIdx = 0;
    else cntFindAllIdx = findAllIdx.length;
    return cntFindAllIdx;
  }
  private void setCntFindAllInex(int cntFindAllIndex) {
    this.cntFindAllIndex = cntFindAllIndex;
  }
  public int getCntFindAllIndex() {
    return cntFindAllIndex;
  }
  private String findAllIndex(String target, String findStr, boolean ignoreCase) {
    if(ignoreCase) {
      target = target.toUpperCase();
      findStr = findStr.toUpperCase();
    }
    String findAllIdx = new String("");//초기값//findAllIdx.trim()불필요
    int firstIdx = -1, lastIdx = -1;
    if(isNull(target)) return null;
    if(isNull(findStr)) return null;
    for(int j=0; j<target.length(); j++) {
      firstIdx = getFirstIndex(target, findStr, firstIdx);
      if(isLastIndex(target, findStr, firstIdx)) {
        lastIdx = firstIdx;
        if(-1 == lastIdx) return null;
        findAllIdx += lastIdx;
        break;
      } else {
        findAllIdx = findAllIdx + firstIdx + ",";
        firstIdx++;
      }
    }
    if(0 == findAllIdx.length()) return null;
    else return findAllIdx;
  }
  public Object findAllIndex(String target, String findStr, boolean ignoreCase, boolean isArray) {
    String findAllIdx = findAllIndex(target, findStr, ignoreCase);
    String[] arrFindIdx;
    Object obj;
    if(isNull(findAllIdx)) {
      this.setCntFindAllInex(0);//index 갯수
      return null; 
    } 
    try {
      arrFindIdx = findAllIdx.split(",");
      if(isEmpty(arrFindIdx)) {
        this.setCntFindAllInex(0);//index 갯수
        return null; 
      }
      this.setCntFindAllInex(countFindAllIndex(arrFindIdx));//index 갯수
    } catch(PatternSyntaxException e) {
      System.out.println(e.getMessage());
      return null;
    } catch(Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
    if(isArray) {
      obj = (Object)arrFindIdx;//String[]을 Object로 Promotion
    } else {
      obj = (Object)findAllIdx;//String을 Object로 Promotion
    }
    return obj;
  }
  public boolean isLastIndex(String target, String findStr, int firstIdx) {
      int lastIdx = getLastIndex(target, findStr);
      if(0 > lastIdx) return true;
      else if(firstIdx == lastIdx)  return true;
      else return false;
  }
  public int getFirstIndex(String target, String findStr, int firstIdx) {
    int idx = -1;
    if(isNull(target)) return idx;
    if(isNull(findStr)) return idx;
    if(isEmpty(findStr)) return idx;
    idx = target.indexOf(findStr, firstIdx);
    return idx;
  }
  public int getLastIndex(String target, String findStr) {
    int idx = -1;
    if(isNull(target)) return idx;
    if(isNull(findStr)) return idx;
    if(isEmpty(findStr)) return idx;
    idx = target.lastIndexOf(findStr);
    return idx;
  }
  public boolean isNull(Object obj) {
    if(null == obj) return true;
    else return false;
  }
  
  //parameter obj에 String을 넣으면 Promotion
  public boolean isEmpty(Object obj) {
    if(null == obj) return true;
    if(obj instanceof String) {
      //Promotion된 Object를 다시 Casting(down casting)
      if(((String)obj).trim().isEmpty()) return true;
    } else if(obj instanceof String[]) {
      //Promotion된 Object를 다시 Casting(down casting)
      if(0 >= ((String[])obj).length) return true;
    }
    return false;
  }
}