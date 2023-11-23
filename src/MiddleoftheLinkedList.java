public class MiddleoftheLinkedList {

  public static void main(String[] args) {
    ListNode a = new ListNode(6, null);
    ListNode b = new ListNode(5, a);
    ListNode c = new ListNode(4, b);
    ListNode d = new ListNode(3, c);
    ListNode e = new ListNode(2, d);
    ListNode f = new ListNode(1, e);

    System.out.println(middleNode(f).val);
  }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode middleNode(ListNode head) {

      ListNode dummy = head;
      int length = 0;
      int target = 0;

      while (dummy != null) {
        length++;
        dummy = dummy.next;
      }

      target = length / 2;

      ListNode answer = head;

      for (int i = 1; i <= target; i++) {
        answer = answer.next;
      }


      return answer;

    }

    /*
    // GPT Solution
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
     */
}
