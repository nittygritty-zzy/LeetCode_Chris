package deleteDuplicates;

class ListNode {
	ListNode next;
	int val;

	ListNode(int x) {
		this.val = x;
	}
}

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;

		ListNode res = head;
		while (res != null) {
			if (res.next == null)
				break;
			if (res.val == res.next.val)
				res.next = res.next.next;
			else
				res = res.next;
		}
		return head;
	}
}
