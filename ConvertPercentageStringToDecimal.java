public static double convertPercent(String percentage) {
	// write your code here
    String str = percentage.replaceAll("%","");
    double d = Double.parseDouble(str) / 100;
    return d;
}
