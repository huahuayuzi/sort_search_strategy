package Link_02;
//           ===05====
public class LinkedQueue<E> implements Queue<E> {

    private class Node{
        public E e ;
        public Node next ;

        public Node(E e , Node next){
            this.e = e ;
            this.next = next;
        }

        public Node(E e ){
            this(e , null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private int size;
    private Node head , tail;
    public LinkedQueue(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
       /* if (tail == null){
            tail = new Node(e);
            head = tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }*/
        if (head == null){
            head = new Node(e);
            tail = head;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++ ;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
           throw new IllegalArgumentException("Cannot Enqueue from an empty queue.");
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        if (head == null){
            tail = null;
        }
        size -- ;
        return temp.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty .");
        }
      return head.e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue : front ");
        Node cur = head;
        while (cur!=null){
            res.append(cur+"->");
            cur = cur.next;
        }
        res.append("NULL tail ");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        for (int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);

            if (i%3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
