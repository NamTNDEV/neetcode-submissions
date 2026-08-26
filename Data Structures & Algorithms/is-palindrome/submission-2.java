class Solution {
    public boolean isAlphanumericCharacter(char c) {
        System.out.println(Character.toLowerCase(c));
        return (97 <= c && 122 >= c) || (65 <= c && 90 >= c) || (48 <= c && 57 >= c);
    }

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if (!isAlphanumericCharacter(s.charAt(l))) {l++; continue;}
            if (!isAlphanumericCharacter(s.charAt(r))) {r--; continue;}
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                System.out.println(Character.toLowerCase(s.charAt(l)));
                System.out.println(Character.toLowerCase(s.charAt(r)));
                return false;
            }
            l++; r--;
        }

        return true;
    }
}
