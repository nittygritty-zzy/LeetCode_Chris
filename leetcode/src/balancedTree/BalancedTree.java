package balancedTree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	};

}

public class BalancedTree {
	public boolean isBalanced = true;

	public boolean isBalanced(TreeNode root) {
		maxDepth(root);
		return isBalanced;
	}

	private int maxDepth(TreeNode root) {
		if (root == null || isBalanced == false) {
			return 0;
		} else {
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			if (Math.abs(leftDepth - rightDepth) > 1) {
				isBalanced = false;
			}
			return leftDepth > rightDepth ? leftDepth : rightDepth;
		}

	}

	// ---------------------------
	int depth(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(depth(root.left), depth(root.right));
	}

	public boolean isBalanced2(TreeNode root) {
		if (root == null)
			return true;
		int leftHight = depth(root.left);
		int rightHight = depth(root.right);
		return Math.abs(leftHight - rightHight) > 1 && isBalanced(root.left)
				&& isBalanced(root.right);
	}

	// ----------------------------

	int dfsHight(TreeNode root) {
		if (root == null)
			return 0;
		int leftHight = dfsHight(root.left);
		if (leftHight == -1)
			return -1;

		int rightHight = dfsHight(root.right);
		if (rightHight == -1)
			return -1;
		if(Math.abs(leftHight - rightHight) > 1)
			return -1;
		return Math.max(leftHight, rightHight) + 1;
	}

	public boolean isBalanced3(TreeNode root){
		return dfsHight(root) != -1;
	}
}
