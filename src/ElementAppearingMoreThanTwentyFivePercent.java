public class ElementAppearingMoreThanTwentyFivePercent {

    public int findSpecialInteger(int[] arr) {

        int tmp = arr[0];
        int counter = 0;


        for (int c : arr) {
            if (c == tmp) {
                counter++;
                if (counter > arr.length * .25 )
                    return c;
            } else {
                counter = 1;
            }

            tmp = c;

        }

        return -1;
    }
}
