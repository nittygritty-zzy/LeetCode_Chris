package findLCA;

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;

	TreeNode(int x) {
		val = x;
	}
}

public class solution {
	// iterative, O(1) space:
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while ((root.val - (long) p.val) * (root.val - (long) q.val) > 0)
			// p and q are both belong to root.left branch or p and q are both
			// belong to root.right branch, else the LCA is the root
			root = p.val < root.val ? root.left : root.right;
		// if p.val < root.val, then p and q both belong to root.left branch, in
		// that way, we need to make root.left as new root
		return root;
	}

	// recursive :

	public TreeNode lowestCommonAncestorII(TreeNode root, TreeNode p, TreeNode q) {
		return (root.val - p.val) * (root.val - q.val) < 1 ? root
				: lowestCommonAncestorII(p.val < root.val ? root.left
						: root.right, p, q);
	}

}
