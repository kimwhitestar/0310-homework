package homework;

public interface TelephoneAreaCode {
  //지역번호(Allocated number code )
  public final String[] AREA_CODE = 
    { "02", 
    "031", "032", "033", 
    "041", "042", "043", "044", 
    "051", "052", "053", "054", "055", 
    "061", "062", "063", "064" };
  public final String[] AREA_CODE_NAME =
    { "서울특별시", 
    "경기도", "인천광역시", "강원도", 
    "충청남도", "대전광역시", "충청북도", "세종특별자치시", 
    "부산광역시", "울산광역시", "대구광역시", "경상북도", "경상남도", 
    "전라남도", "광주광역시", "전라북도", "제주특별자치도" };
  public String areaCode = null;
  public String areaName = null;
  public boolean areaCodeFlg = false;
//  public String[] getAllAreaCodeName();
//  public String[] getAllAreaCode();
  public String getAreaCode(String areaCodeName);
  public String getAreaCode();
  public void setAreaCode(String areaCode);
//  public String getAreaName();
//  public void setAreaName(String areaName);
  public boolean getAreaCodeFlg();
  public void setAreaCodeFlg(String areaCode);
}
