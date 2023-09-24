import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(mergerTwoLists(list1, list2));

    }

    /*
        First approach which is not only inefficient in complexity but doesn't make use of the custom list class provided
     */
    public static List mergerTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> solution = new ArrayList<>();

        for (int i : list1) {
            solution.add(i);
        }

        for (int j : list2) {
            solution.add(j);
        }

        Collections.sort(solution);

        return solution;
    }

    /*
        With help from chatGPT we use a two pointer approach that works with the custom class ListNode.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        // Create a dummy node to act as the starting point of the merged list.
        // This helps in simplifying the code as we don't have to handle the head node as a special case.
        ListNode dummy = new ListNode(-1);
        // This will be used to point to the last node in the merged list as we build it.
        ListNode solution = dummy;

        // Traverse both linked lists.
        // We continue this loop as long as there are nodes left in BOTH lists.
        while (list1 != null && list2 != null) {
            // Compare the current nodes of the two lists.
            if (list1.val <= list2.val) {
                // If list1's node has a smaller value, append it to the merged list.
                solution.next = list1;
                // Move to the next node in list1.
                list1 = list1.next;
            } else {
                // Otherwise, append list2's node to the merged list.
                solution.next = list2;
                // Move to the next node in list2.
                list2 = list2.next;
            }
            // Move the 'current' pointer to the last node in the merged list.
            solution = solution.next;
        }
        // After the above loop, at least one of the lists (list1 or list2) is empty.
        // We append the remaining nodes from the non-empty list.

        // If list1 still has nodes left, append them to the merged list
        if (list1 != null) {
            solution.next = list1;
        }
        // If list2 still has nodes left, append them to the merged list.
        else {
            solution.next = list2;
        }
        // Return the merged list.
        // Since 'dummy' was a placeholder, the actual merged list starts from the next node.
        return dummy.next;
    }
}
