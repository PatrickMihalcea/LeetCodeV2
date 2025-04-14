public class ProductOfArrayExceptSelf_238 {
    public static int[] Solution(int[] nums) {
        int[] answer = new int[nums.length];

        // Left to Right Product.
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        // Right to Left Product.
        int product = 1;
        for (int i = 2; i <= nums.length; i++) {
            product *= nums[nums.length - (i-1)];
            answer[nums.length - i] *= product;
        }

        return answer;

    }
}
