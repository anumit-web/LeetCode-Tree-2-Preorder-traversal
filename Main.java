/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    //List <Integer> ls = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Binary Tree Inorder Traversal");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();

        TreeNode root1 = tree1.getTree();
        List<Integer> output_list = solution.inorderTraversal(root1);
        System.out.println("Output = " + output_list);

    }



}
