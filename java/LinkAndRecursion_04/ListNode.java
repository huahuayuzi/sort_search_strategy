package LinkAndRecursion_04;

public class ListNode {
        int value;
        ListNode next;

        ListNode(int value){
            this.value = value;
        }
        //链表节点的构造函数
        //使用arr为参数，创建一个链表，当前的ListNode为链表头结点
    public ListNode(int [] arr){
            if (arr == null || arr.length == 0){
                throw new IllegalArgumentException("arr can not be empty");
            }
            this.value = arr[0];
            ListNode cur = this;
            for (int i = 1 ; i < arr.length ; i++ ){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
    }
    //以当前节点为头节点的链表信息字符串

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null){
            sb.append(cur.value);
            sb.append("->");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}
