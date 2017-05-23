public class LeetcodeEasyReverseString {
    public String reverseString(String s) {
        char[] c1 = s.toCharArray();
        char[] c2 = new char[c1.length];
        String rev = "";
        int i=0;
        for (int j=s.length()-1;j>=0;j--) {
            c2[i++] = c1[j];
        }
        return new String(c2);
    }
}