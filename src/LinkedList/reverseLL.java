package LinkedList;

public class reverseLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        list.display();
        list.reverseLL();
        list.display();
    }


}
