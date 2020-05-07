package Medium;
import Helpers.TreeNode;

public class CousinsInBinaryTree {
    TreeNode prev;
    int[] res = new int[4];
    public boolean isCousins(TreeNode root, int x, int y){
        prev = root;
        dfs(root, x, y, 0);
        return res[0] == res[1] &&
                res[0] > 1 &&
                res[2] != res[3];
    }

    public void dfs(TreeNode root, int x, int y, int depth){
        if(root == null) return;
        if(root.val == x){
            res[0] = depth;
            if(prev != null) res[2] = prev.val;
        }
        if(root.val == y){
            res[1] = depth;
            if(prev != null) res[3] = prev.val;
        }
        prev = root;
        dfs(root.left, x, y, depth + 1);
        prev = root;
        dfs(root.right, x, y, depth + 1);
        return;
    }
}
