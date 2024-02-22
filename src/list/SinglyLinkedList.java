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

    public void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        if(head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //Insert node at the beginning of a Singly Linked List
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;

            while(count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public ListNode deleteFirst() {
        if  (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null; // break the chain
        return current;
    }

    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
    public boolean find(ListNode head, int searchKey) {
        if(head == null) {
            return false;
        }
        ListNode current = head;
        while(current != null) {
            if(current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null) {
             slowPtr = slowPtr.next;
             fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        ListNode head = new ListNode(10);
        singlyLinkedList.head = head;
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //connect
        singlyLinkedList.head.next = second; //10 -> 1
        second.next = third; // 10 -> 1 -> 8
        third.next = fourth; // 10 -> 1 -> 8 -> 11 -> null

        singlyLinkedList.display();
        System.out.println(singlyLinkedList.length());

        singlyLinkedList.insertLast(14);

        singlyLinkedList.display();

        singlyLinkedList.insert(1, 3);
        singlyLinkedList.display();
        singlyLinkedList.insert(3, 7);
        singlyLinkedList.display();

        System.out.println(singlyLinkedList.deleteFirst().data);
        System.out.println(singlyLinkedList.deleteLast().data);
        singlyLinkedList.display();
        singlyLinkedList.delete(2);
        singlyLinkedList.display();

        ListNode newHead = singlyLinkedList.reverse(head);
        singlyLinkedList.head = newHead;
        singlyLinkedList.display();
    }
}
