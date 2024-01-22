public class Solution {

    private TreeNode root;
    private static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public void insert(int val){
        root=insertion(root, val);
    }
    public TreeNode insertion(TreeNode root, int val){

        if(root==null){
            root=new TreeNode(val);
        }else{
            if(val<root.data){
                root.left=insertion(root.left, val);
            }else{
                root.right=insertion(root.right, val);
            }
        }
        return root;
    }
    public void display(TreeNode root){
        if(root==null){
            return;
        }else{
            display(root.left);
            System.out.print(root.data+" ");
            display(root.right);
        }
    }

    //avg case O(log n) worst case O(n)
    static int closest=Integer.MAX_VALUE;
    static int node=0;
    public int checkClosest(TreeNode root,int val){
        if(root==null){
            return node;
        }else{
            if(Math.abs(root.data-val)<closest){
                closest=Math.abs(root.data-val);
                node=root.data;
            }
            if(val<root.data){
                checkClosest(root.left, val);
            }else{
                checkClosest(root.right, val);
            }
        }
        return node;
    }
    public static void main(String[] args) {
        Solution obj= new Solution();
        obj.insert(10);
        obj.insert(5);
        obj.insert(15);
        obj.insert(2);
        obj.insert(5);
        obj.insert(13);
        obj.insert(22);
        obj.insert(1);
        obj.insert(14);
        obj.display(obj.root);
        System.out.println();
        System.out.println(obj.checkClosest(obj.root,12));
    }
    
}