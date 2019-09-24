package stackAndQueue_03;

import array_01.Array;
//        ===02====
public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<E>(capacity);
    }

    public ArrayStack() {
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
    public void push(E e) {
        array.addLast(e);
    }

    public E pop() {
        return array.removeLast();
    }

    public E peek() {
        return array.removeLast();
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Stack:");
       sb.append("[");
       for (int i = 0 ; i< array.getSize() ; i++){
           sb.append(array.get(i));
           if (i != array.getSize()-1){
               sb.append(",");
           }
       }
       sb.append("] top");
       return sb.toString();
    }
}
