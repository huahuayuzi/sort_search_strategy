package LinkAndRecursion_04;

//            ====03====递归删除元素
public class Solution3 {
    public ListNode removeElements(ListNode head ,int val){
        if (head == null){
            return null;
        }
       /* ListNode res = removeElements(head.next,val);
        if (head.value == val){
            return res;
        }else {
            head.next = res;
            return head;
        }*/
       head.next = removeElements(head.next,val);
       return head.value == val ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1,2,3,4,5,6,7});
        ListNode listNode = new Solution3().removeElements(head, 2);
        System.out.println(head);
    }
}
