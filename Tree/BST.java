// package Tree;


// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int d){
//         this.val = d;
//     }
// }

// public class BST{
//     TreeNode FIN = null;
//     TreeNode SIN = null;

//     TreeNode prevNode = new TreeNode(Integer.MIN_VALUE);

//     public void RecoverTree(TreeNode root){
//         inorder(root);

//         int temp = FIN.val;
//         FIN.val = SIN.val;
//         SIN.val = temp;

//         void inorder(TreeNode node){
//             if(node==null){
//                 return;
//             }
//             inorder(node.left);
//             if(FIN==null && prevNode.val >=node.val){
//                 FIN = prevNode;
//             }
//             if (FIN != null && prevNode.val >= node.val){
//                 SIN = node;
//             }prevNode = node;
//             inorder(node.right);
//         }
//     }
//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(2);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(4);

//         root.right.left = new TreeNode(1)
//     }
// }

