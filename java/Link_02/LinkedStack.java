package Link_02;

//       ====03====
public class LinkedStack<E> implements Stack<E>{
    private LinkedList<E> linkedList;

    public LinkedStack() {
        linkedList = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(linkedList);
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        for (int i = 0 ; i < 5 ; i ++){
            linkedStack.push(i);
            System.out.println(linkedStack);
        }
    }
}
