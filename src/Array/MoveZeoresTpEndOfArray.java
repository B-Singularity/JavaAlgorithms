package Array;

public class MoveZeoresTpEndOfArray {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] arr ={8, 1, 0, 2, 1, 0, 3};
        printArray(arr);
        moveZeroes(arr, arr.length);
        printArray(arr);
    }

    public void moveZeroes(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeoresTpEndOfArray arrutil = new MoveZeoresTpEndOfArray();
        arrutil.arrayDemo();
    }
}
