public static String middleChar(String word) {
	// write your code here
  char ch[] = word.toCharArray();
  String letter = "";
  if(ch.length % 2 == 0){
    letter = String.valueOf(ch[(ch.length/2)-1])+String.valueOf(ch[ch.length/2]);
  }else{
    letter = String.valueOf(ch[ch.length/2]);
  }
  return letter;
}
