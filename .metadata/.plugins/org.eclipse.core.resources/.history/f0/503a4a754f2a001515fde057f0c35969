package binaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

// Queue is a collection designed for holding elements prior to processing.
// Besides basic
// Collection operations, queues provide additional insertion, extraction, and
// inspection operations. Each of these methods exists in two forms: one throws
// an exception if the operation fails, the other returns a special value
// (either null or false, depending on the operation). The latter form of the
// insert operation is designed specifically for use with capacity-restricted
// Queue implementations; in most implementations, insert operations cannot
// fail.

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

		if (root == null)
			return wrapList;

		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				if (queue.peek().right != null)
					queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			wrapList.add(subList);
		}
		return wrapList;
	}

	public List<List<Integer>> levelOrder2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

		if (root == null) {
			return wrapList;
		}

		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();

			for (int i = 0; i < levelNum; i++) {
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
				}
				wrapList.add(subList);
			}
		}
		return wrapList;

	}

}
