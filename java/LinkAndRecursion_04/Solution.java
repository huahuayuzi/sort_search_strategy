package LinkAndRecursion_04;

/**
 * 删除给定值为val的所有元素
 *
 */
public class Solution {
    public ListNode removeElements(ListNode head , int val){
      while (head != null && head.value == val){
          ListNode delNode = head;
          head = head.next;
          delNode.next = null;
      }
      if (head == null){
          return null;
      }
      ListNode prev = head;
      while (prev.next != null){
          if (prev.next.value == val){
             ListNode delNode = prev.next;
             prev.next = delNode.next;
             delNode.next = null;
          }else {
              prev = prev.next;
          }
      }
      return head;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,2,3,6,2};
        ListNode head =  new ListNode(nums);
        System.out.println(head);
        new Solution().removeElements(head,2);
        System.out.println(head);

    }

}
