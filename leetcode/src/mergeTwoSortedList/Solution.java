package mergeTwoSortedList;

class ListNode {
	ListNode Next;
	int val = 0;

	ListNode(int x) {
		this.val = x;
	}
}
// Has potential cause stack overflow
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
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null)
			return null;
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		ListNode result = new ListNode(0);
		ListNode prev = result;
		while (l1 != null && l2 != null){
			if(l1.val <= l2.val){
				prev.Next = l1;
				l1 = l1.Next;
			} else {
				prev.Next = l2;
				l2 = l2.Next;
			}
			prev = prev.Next;
		}
		if(l1 != null)
			prev.Next = l1;
		if(l2 != null)
			prev.Next = l2;
		return result.Next;
	}
}
