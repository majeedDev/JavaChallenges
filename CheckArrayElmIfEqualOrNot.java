public static boolean stringCheck(String[] value) {
    // write your code here
    if (  Arrays.stream(value).distinct().count() == 1 ) {
        return true;
    }
    return false;
}
