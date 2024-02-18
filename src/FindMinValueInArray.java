public class FindMinValueInArray {
    public int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0]; // min will hold minimum of array
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        FindMinValueInArray ma = new FindMinValueInArray();
        System.out.println(ma.findMinimum(arr));
    }
}
