package com.cafintech.twoforkedtree;

import sun.reflect.generics.tree.Tree;

/**
 * Created by 15600 on 2017/12/6.
 * 二叉树的类
 */
public class TreeNode<E> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    TreeNode(E e){
        element=e;
    }

    //二叉树的前序遍历
    public void preorder(TreeNode<E> root){
        if(root==null)
            return;
        System.out.println("node is "+root.element);
        preorder(root.left);
        preorder(root.right);
    }

    //二叉树的中序遍历
    public void inorder(TreeNode<E> root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println("node is "+root.element);
        inorder(root.right);
    }

    //二叉树的后序遍历
    public void postorder(TreeNode<E> root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println("node is "+root.element);
    }
}
