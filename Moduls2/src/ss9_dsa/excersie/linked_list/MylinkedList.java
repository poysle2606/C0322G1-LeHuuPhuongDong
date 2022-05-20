package ss9_dsa.excersie.linked_list;

public class MylinkedList<E> {
    private Node head;
    private int numNodes;

    public MylinkedList(Node head, int numNodes) {
        this.head = head;
        this.numNodes = numNodes;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MylinkedList() {

    }

    public void add(int index, E element) {
        Node holder;
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

//    public E remove(int index) {
//       //???
//    }
//    public boolean remove(Object element) {
//??
//    }
//    public E clone() {
//
//    }
//    public boolean add( E element){
//
//    }

    public int side() {
        return this.side();
    }

    public boolean contains(Object o) {
        boolean flag = false;
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(o)) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(E element) {
        Node temp = head;
        int q = 0;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(element)) {
                q = i;
                break;
            } else {
                temp = temp.next;
            }
        }
        return q;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
