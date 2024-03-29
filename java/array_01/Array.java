package array_01;

//       ====01=====
public class Array<E>{
    private E[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认数组的容量为capacity = 10
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向所有元素的末尾添加一个新的元素
     * @param e
     */
    public void addLast(E e ){
        add(size,e);
    }
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 在指定位置添加元素
     * @param e 要添加的元素
     * @param index 要添加的位置
     */
    public void add(int index , E e){
        if (size == data.length)
            resize(2*data.length);
        if (index < 0|| index > size)
            throw new IllegalArgumentException("Add failed. Require index >=0 and index < szie");
        for (int i = size-1 ;i>=index;i--){
            data[i+1]= data[i];
        }
       data[index] = e;
        size++;
    }


    /**
     * 获取index索引位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index<0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    /**
     * 修改index索引位置的元素e
     * @param index
     * @param e
     */
    public void set(int index ,E e){
        if (index<0 || index >= size){
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 查找数组中是否有元素e
     * @param e
     * @return
     */
    public boolean contains(E e ){
        for (int i = 0 ; i < size ; i++){
            if (data[i] == e)
                return true;
        }
        return false;
    }

    /**
     * 查找数组中元素e所在的索引。如果不存在元素e，则返回-1
     * @param e
     * @return
     */
    public int find(E e){
        for (int i = 0 ; i < size ; i++){
            if (data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     * 从数组中删除index位置的元素，返回删除的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if (index >= size || index <0)
            throw new IllegalArgumentException("Remove failed.Index is illegal.");
        E ret = data[index];

        for (int i = index+1 ; i <size ; i++){
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length/4 && data.length/2 != 0){
            resize(data.length/2);
        }
        return ret;
    }

    /**
     * 从数组中删除第一个元素，返回删除的元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 从数组中删除最后一个元素,返回删除的元素
     * @return
     */
    public E removeLast(){
        return remove(size-1);
    }

    /**
     * 从数组中删除指定的元素e
     * @param e
     */
    public void removeElement(E e ){
        int index = find(e);
        if (index != -1){
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        res.append("[");
        for (int i = 0 ; i < size ; i++){
            res.append(data[i]);
            if (i != size-1)
            res.append(",");
        }
        res.append("]");
        return res.toString();
    }
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0 ; i < size ; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public E getFirst() {
        return get(0) ;
    }
}
