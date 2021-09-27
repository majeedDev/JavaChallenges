public static int[] mergeSort(int[] node1, int[] node2) {
	// write your code here
  Arrays.sort(node1);
  Arrays.sort(node2);
  int fooLength = node1.length;
  int barLength = node2.length;

  int[] merged = new int[fooLength + barLength];

  int fooPosition, barPosition, mergedPosition;
  fooPosition = barPosition = mergedPosition = 0;

  while(fooPosition < fooLength && barPosition < barLength) {
      if (node1[fooPosition] < node2[barPosition]) {
          merged[mergedPosition++] = node1[fooPosition++];
      } else {
          merged[mergedPosition++] = node2[barPosition++];
      }
  }

  while (fooPosition < fooLength) {
      merged[mergedPosition++] = node1[fooPosition++];
  }

  while (barPosition < barLength) {
      merged[mergedPosition++] = node2[barPosition++];
  }
  for (int i : merged) {
    System.out.println(i);
  }
  return merged;
}
