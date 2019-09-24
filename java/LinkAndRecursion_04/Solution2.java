package LinkAndRecursion_04;

//          删除指定值的所有元素，方法2
public class Solution2 {
    public ListNode removeElements(ListNode head , int val){
       ListNode dummyHead = new ListNode(-1);
       dummyHead.next = head;

       ListNode prev = dummyHead;
       while (prev.next != null){
           if (prev.next.value == val){
               prev.next = prev.next.next;
           }else {
               prev = prev.next;
           }
       }
       return dummyHead.next;
    }
}
