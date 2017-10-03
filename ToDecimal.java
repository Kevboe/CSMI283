public class ToDecimal{
  int base;
  int numInBase;
  int convertedNum;
  public static void main(String[] args) {
    base = Integer.valueOf(args[0]);
    /* METHOD WON'T WORK FOR BASES LARGER THAN 9.
    NEED TO SEE HOW OTHERVARIABLE IS PASSED IN TO SOLVE*/
    for(int x = OTHERVARIABLE.length(); x > 0; x++){
      int pwr = 0;
      int convertedNum = 0;
      if(OTHERVARIABLE.charAt(x) != '[' || OTHERVARIABLE.charAt(x) != ']' ){
        convertedNum += (Integer.parseInt("" + OTHERVARIABLE.charAt(x))) * Math.pow( base, pwr);
      }
    }
    System.out.println(convertedNum);
  }
}
