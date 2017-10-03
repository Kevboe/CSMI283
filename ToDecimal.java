public class ToDecimal{
  int base;
  ArrayList<Integer> numInBase;
  int convertedNum;


  //2nd Variable is put in via standard input. Standard Input is Keyboard.
  public static void main(String[] args) {
    base = Integer.parseInt(args[0]);
    /* METHOD WON'T WORK FOR BASES LARGER THAN 9.
    NEED TO SEE HOW OTHERVARIABLE IS PASSED IN TO SOLVE*/
    numInBase = new ArrayList<Integer>;
    for(int x = 0; x < OTHERVARIABLE.length(); x++){
      if(OTHERVARIABLE.charAt(x) == '['){
        int y = x;
        do {
          y++;
        } while (OTHERVAIABLE.charAt(y) != ']');
        numInBase.add(OTHERVAIABLE.substring(x+1, y))
      }
      //Add a println to test the ArrayList creation
    }

    int pwr = 0;
    convertedNum = 0;
    for(int x = numInBase.size() - 1; x > 0; x++){
      convertedNum += numInBase.get(x) * (Math.pow(base, pwr));
      pwr++;
    }
    System.out.println(convertedNum);
  }
}
