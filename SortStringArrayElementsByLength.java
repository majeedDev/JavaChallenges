public static String sortByLength(String txt) {
	// write your code here
  String str = "";
  String[] splitter = txt.split(" ");
  Arrays.sort(splitter);
  for (int i = 0; i < splitter.length; i++) {
    for (int k = i+1; k < splitter.length; k++) {
      if (splitter[i].length() > splitter[k].length()) {
        String temp = splitter[i];
        splitter[i] = splitter[k];
        splitter[k] = temp;
      }
    }
  }
  for (String string : splitter) {
    str += string + " ";
  }
  return str;
}
