
public class Sample {
	
	    public String longestSubstring(String s) {
	        int n = s.length();
	        String longestSubstring = "";
	        int maxLength = 0;

	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                if (checkRepetition(s, i, j)) {
	                    if (j - i + 1 > maxLength) {
	                        maxLength = j - i + 1;
	                        longestSubstring = s.substring(i, j + 1);
	                    }
	                }
	            }
	        }

	        return longestSubstring;
	    }

	    private boolean checkRepetition(String s, int start, int end) {
	        int[] chars = new int[128];

	        for (int i = start; i <= end; i++) {
	            char c = s.charAt(i);
	            chars[c]++;
	            if (chars[c] > 1) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String args[]) {
	        Sample ob = new Sample();
	        String s = "abcabcabc";
	        System.out.println("Longest Substring without Repeating Characters: " + ob.longestSubstring(s));
	    }
	}


