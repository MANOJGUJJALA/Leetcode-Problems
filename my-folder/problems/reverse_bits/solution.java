public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder s2 = new StringBuilder(s);
        String s3 = s2.reverse().toString();
        return (int) Long.parseLong(s3, 2); // safely parse up to 32 bits
    }
}
