package easy;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

//404
public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode curr = null;
		q.add(root);
		int sum = 0;
		if(root == null) return 0;
		while(!q.isEmpty()) {
			curr = q.remove();
			if(curr.left != null && curr.left.left == null && curr.left.right == null) sum += curr.left.val;
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
		}
		return sum;
	}
}