/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Set<TreeNode> set;
    Map<String, TreeNode> map;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        set= new HashSet<>();
        map = new HashMap<>();
        
        traverse(root);
        List<TreeNode> ans = new LinkedList<>();
        for (TreeNode node: set) {
            ans.add(node);
        }
        return ans;
    }
    
    public String traverse(TreeNode root) {
        if (root == null) {
            return "";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String cur = left + " " + right + " " + root.val;
        if (map.containsKey(cur)) {
            set.add(map.get(cur));
        } else {
            map.put(cur, root);
        }
        return cur;
    }
}