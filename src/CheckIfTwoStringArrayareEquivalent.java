public class CheckIfTwoStringArrayareEquivalent {

    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        for (String s : word1) {
            one.append(s);
        }

        for (String s : word2) {
            two.append(s);
        }

        return (one.toString().equals(two.toString()));
    }
}
