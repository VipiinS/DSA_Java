package LinkedList;

public class addtwoLL {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertFirst(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);
        list1.insertLast(6);
        list1.insertLast(7);

        LL list2 = new LL();
        list2.insertFirst(1);
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(3);
        list2.insertLast(3);
        list2.insertLast(3);
        list2.insertLast(3);

        list1.display();
        list2.display();

        LL.Node node = new LL.Node();


        node = LL.addtwoLLs(list1.head,list2.head);

        while (node !=null){
            System.out.println(node.val);
            node=node.next;
        }

    }
}
