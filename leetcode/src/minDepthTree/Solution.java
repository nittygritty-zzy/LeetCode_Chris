package minDepthTree;

import java.util.LinkedList;
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
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int depth = 1;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode temp, magic = new TreeNode(0);
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.equals(magic)) {
				if (!q.isEmpty()) {
					depth++;
					q.add(magic);

				}
				continue;
			}
			if (temp.left == null && temp.right == null) {
				return depth;
			}
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
		return depth;
	}

	public int minDepth2(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null) {
			return 1 + minDepth2(root.right);
		}
		if (root.right == null) {
			return 1 + minDepth2(root.left);
		}
		return 1 + Math.min(minDepth2(root.left), minDepth2(root.right));
	}

}
