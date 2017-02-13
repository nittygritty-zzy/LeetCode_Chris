package symmetricTree;

import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SymmetricTree {
	// recursive solution:
	// 1, left.val == right.val
	// 2, left.left.val == right.right.val
	// 3, left.right.val == right.left.val
	//
	// root
	// left right
	// left.left left.right right.left right.right
	public boolean isSymmetric(TreeNode root) {
		return root == null || isSymmetricHelper(root.left, root.right);
	}

	public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}
		if (left.val != right.val)
			return false;
		return isSymmetricHelper(left.left, right.right)
				&& isSymmetricHelper(left.right, right.left);
	}

	// non-recursive solution:

	public boolean isSymmetricII(TreeNode root) {
		if (root == null)
			return true;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode left, right;
		if (root.left != null) {
			if (root.right == null)
				return false;
			stack.push(root.left);
			stack.push(root.right);
		} else if (root.right != null) {
			return false;
		} // check Symmetric Tree Structure

		while (!stack.isEmpty()) {
			if (stack.size() % 2 != 0) // symmetric tree size %2 == 0
				return false;
			right = stack.pop();
			left = stack.pop();
			if (right.val != left.val)
				return false; // Check Symmetric Tree Value

			if (left.left != null) {
				if (right.right == null) {
					return false;
				}
				stack.push(left.left);
				stack.push(right.right);
			} else if (right.right != null) { // if root.left == null &&
												// root.right != null return
												// false;
				return false;
			}

			if (left.right != null) {
				if (right.left == null)
					return false;
				stack.push(left.right);
				stack.push(right.left);
			} else if (right.left == null)
				return false;
		}
		return true;
	}
}
