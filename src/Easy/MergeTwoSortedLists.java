package Easy;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null) {
            return list1;
        } else if (list1 == null) {
            return list2;
        } else if (list1 == null && list2 == null) {
            return null;
        }

        ListNode smallerList = list1.val > list2.val ? list2 : list1;
        ListNode biggerList = list2.val < list1.val ? list1 : list2;
        while (biggerList != null) {
            if (biggerList.val >= smallerList.val && (smallerList.next == null || smallerList.next.val > biggerList.val)) {
                smallerList.next = new ListNode(biggerList.val, smallerList.next);
                biggerList = biggerList.next;
            }
            smallerList = smallerList.next;
        }

        return list1.val <= list2.val ? list1 : list2;
    }

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}