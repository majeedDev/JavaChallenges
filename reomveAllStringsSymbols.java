public static String removeSpecialCharacters(String str) {
	// write your code here
  String result = str.replaceAll("[!@#$%&*()[]/=;'+.^:,<>?]]","");
  return result;
}
