package binaryTreeLevelOrderTraversalII;

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

public class Solution {

	// BFS
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null)
			return wrapList;
		queue.offer(root);

		while (!queue.isEmpty()) {
			List<Integer> subList = new LinkedList<Integer>();
			int queueSize = queue.size();
			for (int i = 0; i < queueSize; i++) {
				if (queue.peek().left != null)
					queue.add(queue.peek().left);
				if (queue.peek().right != null) {
					queue.add(queue.peek().right);
				}
				subList.add(queue.poll().val);
			}
			wrapList.add(0, subList);
		}
		return wrapList;
	}

	// DFS

	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
		levelMaker(wrapList, root, 0);
		return wrapList;
	}

	public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
		if (root == null)
			return;
		if (level >= list.size()) {
			list.add(0, new LinkedList<Integer>());
		}
		levelMaker(list, root.left, level + 1);
		levelMaker(list, root.right, level + 1);
		list.get(list.size() - level - 1).add(root.val);
	}
}
