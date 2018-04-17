package leetcode_train;

/**
 * Created by EVERCX on 2018/4/17.
 * https://leetcode.com/problems/complex-number-multiplication/description/
 */
public class ComplexNumberMultiply {

    public String complexNumberMultiply(String a, String b) {

        // 找出实部和虚部的字符串并且转成int型
        int ReA = Integer.parseInt(a.substring(0,a.indexOf("+")));
        int ImA = Integer.parseInt(a.substring(a.indexOf("+")+1,a.indexOf("i")));

        int ReB = Integer.parseInt(b.substring(0,b.indexOf("+")));
        int ImB = Integer.parseInt(b.substring(b.indexOf("+")+1,b.indexOf("i")));

        int ReC = ReA * ReB - ImA * ImB;
        int ImC = ReA * ImB + ImA * ReB;

        return String.valueOf(ReC) + "+" + String.valueOf(ImC) + "i";
    }

    public static void main(String[] args) {

        String a1 = "1+1i"; String b1 = "1+-1i";
        String c1 = new ComplexNumberMultiply().complexNumberMultiply(a1,b1);

        String a2 = "1+-1i"; String b2 = "1+-1i";
        String c2= new ComplexNumberMultiply().complexNumberMultiply(a2,b2);

        System.out.println(c1);
        System.out.println(c2);

    }
}
