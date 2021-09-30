public static String MissingLetter(String txt) {
      char[] array = txt.toCharArray();
      for (int i=1; i<array.length; i++) {
        if (array[i]-array[i-1]!=1)
      return Character.toString ((char) (array[i]-1));
      }
      return "No Missing Letter";
    }
