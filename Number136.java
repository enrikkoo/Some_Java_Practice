package Practice;
import java.util.*;

public class Number136 {
    public static int singleNumber(int[] nums22) {
        Arrays.sort(nums22);
        int count =0;
        int len=nums22.length;
        if (nums22[0] != nums22[1])
            return nums22[0];
        if (nums22[nums22.length-1]!=nums22[nums22.length-2])
            return nums22[nums22.length-1];

        for (int i = 1;i<len-1;i++){
            if ((nums22 [i] != nums22[i+1])&(nums22 [i] != nums22[i-1])){
                return nums22[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums22 = {3,2,6,5,5,6,1,2};
        System.out.println(singleNumber(nums22));

    }
}
