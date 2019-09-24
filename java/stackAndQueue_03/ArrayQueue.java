package stackAndQueue_03;

import array_01.Array;
//          ====05=====
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<E>(capacity);
    }

    public ArrayQueue() {
        array = new Array<E>();
    }

    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }
    public int getCapacity(){
        return array.getCapacity();
    }

    public void enqueue(E e) {
        array.addLast(e);
    }

    public E dequeue() {
        return array.removeFirst();
    }

    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue:");
        sb.append("front [");
        for (int i = 0 ; i < array.getSize(); i++){
            sb.append(array.get(i));
            if (i != array.getSize()-1)
                sb.append(",");
        }
        sb.append("] tail");
        return sb.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);
            if (i%3 == 2){
                queue.dequeue();
            }
        }
    }
}
