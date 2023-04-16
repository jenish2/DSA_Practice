class IsStringRotated {
    public static boolean isStringRotated(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int rotatePointer = s1.indexOf(s2.charAt(0));
        for (int i = 0; i < s1.length(); i++) {
            if (rotatePointer == s1.length()) {
                rotatePointer = 0;
            }
            if (s1.charAt(rotatePointer) != s2.charAt(i)) {
                return false;    
            }
            rotatePointer++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "CDEFAB";
        System.out.println(isStringRotated(s1, s2));
    }
}