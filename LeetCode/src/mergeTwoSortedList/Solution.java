package mergeTwoSortedList;

class ListNode {
	ListNode Next;
	int val = 0;

	ListNode(int x) {
		this.val = x;
	}
}

public class Solution {
	public ListNode mergeTwoList(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val > l2.val) {
			l1.Next = mergeTwoList(l1.Next, l2);
			return l1;
		} else {
			l2.Next = mergeTwoList(l2.Next, l1);
			return l2;
		}
	}
}
