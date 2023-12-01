class LCP {
    public static void main(String[] args) {


        String[] example = {"flower", "flight", "flow"};

        String answer = longestCommonPrefix(example);

        System.out.println(answer);

    }

    public static String longestCommonPrefix(String[] arr) {
        // Mutable string we can append characters in
        StringBuilder lcp = new StringBuilder();
        // This variable will hold the lenght of the shortest string
        int minimum = arr[0].length();
        // Looking for the shortest string in arr
        for (int i = 0; i < arr.length; i++) {
            minimum = Math.min(minimum, arr[i].length());
        }
        // We only need to iterate as many times as the shortest string in arr
        for (int i = 0; i < minimum; i++) {
            //This will be the current character that we will compare other characters with
            char current = arr[0].charAt(i);
            /* Iterating through arr and checking if the current character matches the character in other strings
                at the current index. If not we return the current longestCommonPrefix
             */
            for (String str : arr) {
                if (str.charAt(i) != current) {
                    return lcp.toString();
                }
            }
            /* If the current character does equal the character at the same index
                of other strings in arr, then we append that character to the lcp
             */
            lcp.append(current);
        }

        return lcp.toString();
    }
}