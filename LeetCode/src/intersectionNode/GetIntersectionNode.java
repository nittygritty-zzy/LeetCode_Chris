package intersectionNode;

class ListNode {
	int val;
	ListNode Next;

	ListNode(int x) {
		this.val = x;
		Next = null;
	}
}

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = length(headA);
		int lenB = length(headB);

		while (lenA > lenB) {
			headA = headA.Next;
			lenA--;
		}
		while (lenB > lenA) {
			headB = headB.Next;
			lenB--;
		}
		while (headA != headB) {
			headA = headA.Next;
			headB = headB.Next;
		}
		return headA;
	}

	private int length(ListNode node) {
		int length = 0;
		while (node != null) {
			node = node.Next;
			length++;
		}
		return length;
	}

}
