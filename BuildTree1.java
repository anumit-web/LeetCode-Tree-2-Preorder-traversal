public class BuildTree1 {

    public static TreeNode getTree() {

        TreeNode root = new TreeNode(1);
        root.left = null;
        //root.right = new TreeNode(2)

        TreeNode right1 = new TreeNode(2);
        right1.left = new TreeNode(3);
        right1.right = null;

        root.right = right1;

        return root;

    }
}