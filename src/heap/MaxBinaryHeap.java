package heap;

public class MaxBinaryHeap {
    private Integer[] heap;

    private int n;

    public MaxBinaryHeap(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public static void main(String[] args) {
        MaxBinaryHeap pq = new MaxBinaryHeap(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
}
