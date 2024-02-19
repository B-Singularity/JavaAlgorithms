package list;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; //Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //connect
        singlyLinkedList.head.next = second; //10 -> 1
        second.next = third; // 10 -> 1 -> 8
        third.next = fourth; // 10 -> 1 -> 8 -> 11 -> null

    }
}
