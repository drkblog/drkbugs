package ar.com.drk.drkbugs.codility;

public class BinaryGap {
    public int solution(int number) {
        int largestGap = 0, zeroCounter = 0;

        while (number > 0 && !lastBitIsOne(number)) number = number >> 1;

        while (number > 0) {
            if (lastBitIsOne(number)) {
                if (zeroCounter > largestGap) {
                    largestGap = zeroCounter;
                }
                zeroCounter = 0;
            } else {
                zeroCounter++;
            }
            number = number >> 1;
        }
        return largestGap;
    }

    private static boolean lastBitIsOne(final int number) {
        return (number & 1) == 1;
    }
}
