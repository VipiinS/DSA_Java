package LinkedList;

public class delMiddlenode {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);

        list.display();

        list.deleteMiddleNode();

        list.display();
    }
}
