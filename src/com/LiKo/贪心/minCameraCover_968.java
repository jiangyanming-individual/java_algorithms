package com.LiKo.贪心;


/**
 * @author Lenovo
 * @date 2023/3/15
 * @time 8:30
 * @project java_算法
 **/
public class minCameraCover_968 {

    int result=0;
    public int minCameraCover(TreeNode root){

        if (traversal(root) == 0){
            //如果跟跟节点没有被覆盖的话：result++;
            result++;
        }
        return result;
    }

    public int traversal(TreeNode cur){
        //递归遍历：

        //递归终止条件：0表示没有被覆盖，1表示安装摄像头，2表示覆盖了
        if (cur == null)
            return 2;


        //后序遍历，如果需要得到根节点的反馈信息的话，首选的就是中序遍历：
        int left=traversal(cur.left);
        int right=traversal(cur.right);

        if (left == 2 && right == 2){
            //左右节点已经被覆盖了
            return 0;//根节点返回0；
        }

        if (left == 0 || right == 0){
            result++;
            return 1;//此时需要根节点放一个；
        }
        if (left ==1 || right ==1){
            return 2;//根节点被覆盖了
        }
        //不会走到这里
        return -1;
    }
}
