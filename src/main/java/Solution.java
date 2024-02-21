class Solution {

    public int rangeBitwiseAnd(int left, int right) {
        int res = right;
        int length = Integer.toBinaryString(right).length();
        for (int i = 0; i < length ; i++) {
            if(res != 0 && res - 1 >= left){
                res &= (res - 1);
            }else break;
        }
        return res;
    }
}
