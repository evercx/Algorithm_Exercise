package Easy;

/**
 * Created by EVERCX on 2017/8/10.
 *
 * https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        int carry = 1;

        for(int i = digits.length-1; i >=0; i--){
            digits[i] = digits[i] + carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }

        if(carry == 1){
            int[] newDigits = new int[digits.length+1];
            System.arraycopy(digits,0,newDigits,1,digits.length);
            newDigits[0] = carry;
            return newDigits;
        }

        return digits;

    }
}
