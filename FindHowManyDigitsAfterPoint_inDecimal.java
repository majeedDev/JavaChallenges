public static int DecimalPlaces(String num) {
	// write your code here
  int DecimalAfter = 0;
  String[] splitter = num.toString().split("\\.");
  if (splitter.length == 1) {
    DecimalAfter = 0;
  }else{
    DecimalAfter = splitter[1].length();
  }
  return DecimalAfter;
}
//This method Will Help you to find digits after point in decimal
