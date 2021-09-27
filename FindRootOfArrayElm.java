public static double[] arrayRoot(double[] arr) {
	// write your code here
  for (int i = 0; i < arr.length; i++) {
    arr[i] = Math.sqrt(arr[i]);
  }
  return arr;
}
