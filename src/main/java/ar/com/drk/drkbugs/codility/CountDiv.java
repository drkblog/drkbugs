package ar.com.drk.drkbugs.codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int higher = B - (B%K);
        int lower =  A + ((K-(A%K))%K);
        return (higher - lower) / K + 1;
    }
}
