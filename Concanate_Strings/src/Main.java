import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {1, 2, 2, 1};

        //Concatanate obj = new Concatanate();
        //obj.ConcatanateString(nums);

        Solution2 obj = new Solution2();
        int[] returnedArray = obj.Solution2(nums);
        System.out.println(Arrays.toString(returnedArray));
    }



}



