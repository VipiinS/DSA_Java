package LinkedList;

public class middleOfLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        LL.Node slow = list.head;
        LL.Node fast = list.head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);


    }
}
