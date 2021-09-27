public static String[] addFive(String[] arr) {
	// write your code here
  String str[] = new String[arr.length];
  for (int i = 0; i < arr.length; i++) {
    str[i] = arr[i] + "5";
    System.out.println(str[i]);
  }
  return str;
}
