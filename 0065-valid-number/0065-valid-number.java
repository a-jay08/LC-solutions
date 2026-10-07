class Solution {
    public boolean isNumber(String s) {
        boolean SeenDigit = false;
        boolean SeenDot = false;
        boolean SeenE = false;
        boolean DigitAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                SeenDigit = true;
                if (SeenE) {
                    DigitAfterE = true;
                }
            }
            else if (c == '-' || c == '+') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else if (c == 'e' || c == 'E') {
                if (SeenE || !SeenDigit) {
                    return false;
                }
                SeenE = true;
                DigitAfterE = false;
            }
            else if (c == '.') {
                if (SeenDot || SeenE) {
                    return false;
                }
                SeenDot = true;
            }
            else {
                return false;
            }
        }
        return SeenDigit && DigitAfterE;
    }
}