package math;

public class FourDivisor {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int last_div = 0;
            for (int d = 2; d * d <= num; d++) {
                if (num % d == 0 && last_div == 0) {
                    last_div = d;
                } else if (num % d == 0) {
                    last_div = 0;
                    break;
                }
            }
            if (last_div != 0 && last_div != num / last_div) {
                sum = sum + 1 + num + last_div + num / last_div;
            }
        }

        return sum;
    }
}
