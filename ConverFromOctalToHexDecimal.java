public static String octToHex(int oct) {
	// write your code here
  String hex_Num = "";
  String octal_Num = String.valueOf(oct);
  int decNum;
  decNum = Integer.parseInt(octal_Num, 8);
  hex_Num = Integer.toHexString(decNum);
  return hex_Num.toUpperCase();
}

//This Method will help you converting from Octal to HexDecimal
