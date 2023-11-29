public class MultiDimensionalArray {
    public static void main(String [] args) {
        int [][] nums = new int [3][4];
        System.out.println("正常的双循环:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                // Math.random()会提供0.xx的小数的随机值
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("使用增强loop的双循环:");

        //使用增强的loop
        //效果和上面一样
        for(int[] n : nums) {
            for(int m: n) {
                System.out.print(m + " ");
            }
        System.out.println();
        }
    }
}
