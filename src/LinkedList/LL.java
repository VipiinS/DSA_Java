package LinkedList;

    public class LL {
        public static class Node{
            public int val;
            public Node next;

            public Node(int val) {
                this.val = val;
            }
            public Node(int val,Node next){
                this.val = val;
                this.next = next;
            }
            public Node() {
            }
        }

        public Node head;
        public Node tail;
        private int size;

        public LL() {
            // by default the head and tail will be null so they need not be initialised here

            this.size = 0;
        }
        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;
            if(tail == null){
                tail = head;
            }
            size++;
        }
        public void insertLast(int val){
            if(tail == null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
        public void insert(int val, int index){
            if(index == 0){
                insertFirst(val);
                return;
            }
            if(index == size){
                insertLast(val);
                return;
            }
            Node temp = get(index - 1);
            Node node = new Node(val,temp.next);
            temp.next = node;
        }

        public int deleteFirst(){
            int removedVal = head.val;
            head = head.next;
            if(head == tail)
                tail = null;
            return removedVal;
        }
        public int deleteLast(){
            Node secondLast = get(size - 1);
            int removedValue = tail.val;
            tail = secondLast;
            tail.next = null;
            return removedValue;
        }
        public int delete(int index){
            if(index == 0){
                deleteFirst();
            }
            if(index == size - 1){
                deleteLast();
            }
            Node prev = get(index - 1);
            int val = prev.next.val;
            prev.next = prev.next.next;
            return val;
        }
        public void deleteOccurrence(int val){
            Node temp = head;
            int index = 0;
            while(temp != null){
                if(temp.val == val){
                    break;
                }
                index++;
                temp = temp.next;
            }
            System.out.println("removed "+ delete(index));
        }

        // remove duplicates in a sorted list.
        public Node removeDuplicates(Node head){
            Node n = head;
            if(n == null){
                return n;
            }
            while(n.next != null){
                if(n.val == n.next.val){
                    n.next = n.next.next;
                }
                else{
                    n = n.next;
                }
            }
            return head;
        }
        public Boolean isCyclic(Node head){
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow)
                    return true;
            }
            return false;
        }
        private Node get(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }




        public Node sortList(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            Node mid = mid(head);
            head.next = null;
            Node left = sortList(head);
            Node right = sortList(mid);

            return merge(left, right);
        }

        Node merge(Node list1, Node list2) {
            Node dummyHead = new Node();
            Node tail = dummyHead;
            while (list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    tail.next = list1;
                    list1 = list1.next;
                } else {
                    tail.next = list2;
                    list2 = list2.next;
                }
                tail = tail.next;
            }
            tail.next = (list1 != null) ? list1 : list2;
            return dummyHead.next;
        }
        public Node mid(Node head) {
            // uses fast and slow pointer
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        public LinkedList.LL.Node mergesort(LinkedList.LL.Node head){
            if(head == null || head.next == null)
                return head;
            LinkedList.LL.Node temp = head;
            LinkedList.LL.Node slow = head;
            LinkedList.LL.Node fast = head;
            // to find the mid of the list
            while(fast != null && fast.next != null){
                temp = slow;
                fast = fast.next.next;
                slow = slow.next;
            }
            temp.next = null;
            LinkedList.LL.Node left = mergesort(head);
            LinkedList.LL.Node right = mergesort(slow);

            return merge(left,right);
        }
        private void bubbleSort() {
            int length = 0;
            Node temp = head;
            while(temp != null) {
                length++;
                temp = temp.next;
            }
            bubbleSort(length-1,0);
        }

        public void bubbleSort(int row, int col){
            if(row == 0)
                return;

            if(col < row){
                Node first = get(col);
                Node second = get(col + 1);

                if(first.val > second.val) {
                    //swap
                    if (first == head) {
                        head = second;
                        first.next = second.next;
                        second.next = first;
                    } else if (second == tail) {
                        Node previous = get(col - 1);
                        previous.next = second;
                        tail = first;
                        first.next = null;
                        second.next = tail;
                    } else {
                        Node previous = get(col - 1);
                        previous.next = second;
                        first.next = second.next;
                        second.next = first;
                    }
                }
                bubbleSort(row, col + 1);
            }
            else {
                bubbleSort(row - 1,0);
            }
        }
        public void reverseRecursive(Node node){
            if(node.next == null){
                head = tail;
                return;
            }
            reverseRecursive(node.next);
            tail.next = node;
            tail = node;
            tail.next = null;
        }
        public Node reverseLL(){
            Node prev = null;
            Node present  = head;
            while(present!=null){
                Node next = present.next;
                present.next = prev;
                prev = present;
                present = next;
            }
            head = prev;
            return prev;
        }

        public static Node addtwoLLs(Node list1, Node list2){
            Node dummyHead = new Node();
            Node ansHead = dummyHead;
            int carry = 0;
            while(list1 != null || list2!= null){
                int num1 = list1 != null ? list1.val : 0;
                int num2 = list2 != null ? list2.val : 0;
                int currSum = num1 + num2 + carry;
                carry = currSum > 9 ? 1 : 0;
                currSum %= 10;

                Node node = new Node(currSum);
                dummyHead.next = node;
                dummyHead = dummyHead.next;
                list1 = list1.next;
                list2 = list2.next;
            }
            if(carry !=0 ){
                Node node = new Node(carry);
                dummyHead.next = node;
            }
            return ansHead;
        }

        public Node deleteMiddleNode(){
            Node slow = head;
            Node fast = head;
            if(slow == null || slow.next == null) return null;
            if(slow.next.next == null) {
                slow.next = null;
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
            Node prev = head;

            while(fast !=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                prev = prev.next;
            }
            prev.next = slow.next;
            return head;
        }

        public Node reverse(Node head){
            Node present = head;
            Node previous = null;
            Node next = present.next;

            while(present != null){
                present.next = previous;
                previous = present;
                present = next;
                if(next != null){
                    next = next.next;
                }
            }
            head = previous;
            return head;
        }







        public Node reverseBetween(Node head,int left,int right){
            if(left == right){
                return head;
            }
            Node previous = null;
            Node current = head;
            // we are moving the current pointer till the left index
            for (int i = 0; current != null && i < left-1; i++) {
                previous = current;
                current = current.next;
            }
            // we are assigning previous to last so that we can make last.next to the right.next index at the end of reversal
            Node last = previous;
            Node newEnd = current;
            Node next = current.next;
            for (int i = 0; i < right - left + 1; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if(next != null) {
                    next = next.next;
                }
            }
            // after the reversal the current will be in right.next index, previous will be in right index

            //if the link doesn't contain a last,i.e. if the left starts from head, we put the last as head, or we put last.next = previous
            if(last != null)
                last.next = previous;
            else
                head = previous;
            // assigning the newEnd,i.e. the left - 1 index to the right -1 index.
            newEnd.next = current;
            return head;
        }
        public boolean palindrome(Node head){
            // find the middle node,and make it second head to reverese and then transverse from.
            Node newMid = mid(head);
            Node secondHead = reverse(newMid);
            // until one of the nodes reach null transverse it till it the values doesn't match and return false

            while(head != null && secondHead != null){
                if(head.val != secondHead.val)
                    return false;
                head= head.next;
                secondHead = secondHead.next;
            }
            // if the loop completes without returning then it's a palindrome.
            return true;
        }

        public void reorder(Node head){
            Node mid = mid(head);
            Node hs = reverse(mid); // hs is headSecond
            Node hf = head; // hf is headFirst;

            while(hf != null && hs != null){
                Node temp = hf.next;
                hf.next = hs;
                hf = temp;
                temp = hs.next;
                hs.next = hf;
                hs = temp;
            }
            if(hf != null){
                hf.next = null;
            }
        }

        public Node rotate(Node head, int k){
            if(k <= 0 || head == null || head.next == null)
                return head;
            Node last = head;
            int length = 0;
            while(last != null){
                length++;
                last = last.next;
            }
            last.next = head;
            int rotations = k % length;
            int skip = length - rotations;
            Node newLast = head;
            for (int i = 0; i < skip; i++) {
                newLast = newLast.next;
            }
            head= newLast.next;
            newLast.next = null;
            return head;
        }

        public Node intersection(Node headA, Node headB){
            Node temp1 = headA;
            Node temp2 = headB;
            while(temp1 != null && temp2 != null){
                temp2 = headB;
                while(temp2 != null){
                    if(temp1 == temp2){
                        return temp1;
                    }
                    else{
                        temp2 = temp2.next;
                    }
                }
                temp1 = temp1.next;
            }
            return null;
        }

        public Node remove(Node head,int val){
            if(head == null){
                return null;
            }
            head.next = remove(head.next,val);
            return head.val == val ? head.next : head;
        }
        public void removeFromEndIndex(Node head, int index) {
            display();
            reverseRecursive(head);
            display();
            Node prev = head;
            System.out.println(prev.val);
            for (int i = 0; prev.next != null && i < index; i++) {
                prev = prev.next;
            }
            if (prev.next == null){
                reverseRecursive(head);
                return;
            }
            prev.next = prev.next.next;
            reverse(head);
        }
        public static void main(String[] args) {
            LinkedList.LL list = new LinkedList.LL();
            list.insertLast(1);
            list.insertLast(2);
            list.insertLast(3);
            list.insertLast(4);
            list.insertLast(5);
//        list.display();
//        list.reverseRecursive(list.head);
//        list.display();
//        list.reverse(list.head);
            list.display();
            list.swapNodes(list.head,2);
            list.display();

        }



        public void swapNodes(Node head, int index){
            if(index == 0){
                return;
            }
            // find the length of the list
            int length = 0;
            Node temp = head;
            while(head != null){
                length++;
                head = head.next;
            }
            Node node1 = get(index - 1);
            Node node2 = get(length - index);
            int tempo = node1.val;
            node1.val = node2.val;;
            node2.val = tempo;
        }


    }


