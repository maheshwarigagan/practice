package bitmanipulation.bitwiserangeand;

public class BitwiseANDOfNumbersRange {
    public static int rangeBitwiseAnd(int m, int n) {
        int shift_count = 0;
        while(m != n){
            m = m>>1;
            n = n>>1;
            shift_count++;
        }
        return n<<shift_count;
    }
}
