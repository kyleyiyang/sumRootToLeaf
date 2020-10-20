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
    public int sumRootToLeaf(TreeNode root) {
        List<String> lstr=new ArrayList<>();
        String str="";
        int level=0;
        recur(root,str,level,lstr);
        int sum=0;
        for (String n:lstr) {
            sum+=Integer.parseInt(n, 2);
        }
        return sum;
    }
    public static void recur(TreeNode r, String s, int lev, List<String> lst) {
        if(r!=null) {
            lev++;
            if (s.length()<lev) {
                s+=r.val;
            }
            if (r.left==null && r.right==null) {
                lst.add(s);
            }
            recur(r.left,s,lev,lst);
            recur(r.right,s,lev,lst);
        }
    }
}
