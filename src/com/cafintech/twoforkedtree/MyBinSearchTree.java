package com.cafintech.twoforkedtree;

/**
 * Created by 15600 on 2017/12/6.
 * 二叉查找树
 */
public class MyBinSearchTree<E extends Comparable<E>> {

    //根
    private TreeNode<E> root;

    //默认构造函数
    public MyBinSearchTree(){}

    //二叉查找树的搜索
    public boolean search(E e){
        TreeNode<E> current=root;
        while (current!=null){
            if(e.compareTo(current.element)<0){
                current=current.left;
            }else if(e.compareTo(current.element)>0){
                current=current.right;
            }else{
                return true;
            }
        }
        return false;
    }

    //二叉树创建新的节点
    TreeNode<E> createNewNode(E e){
        return new TreeNode(e);
    }

    //二叉树的插入
    public boolean insert(E e){
        if(root==null){
            root=createNewNode(e);
        }else {
            TreeNode<E> parent=null;
            TreeNode<E> current=root;

            while (current!=null){
                if(e.compareTo(current.element)<0){
                    parent=current;
                    current=parent.left;
                }else if(e.compareTo(current.element)>0){
                    parent=current;
                    current=parent.right;
                }else {
                    return false;
                }
            }

            if(e.compareTo(parent.element)>0){
                parent.right=createNewNode(e);
            }else{
                parent.left=createNewNode(e);
            }

            return true;
        }
        return false;
    }
























}
