package com_10_28;

public class DebugBiTree {
	public BiTree createBiTree() {
		BiTreeNode b=new BiTreeNode('B');
		BiTreeNode d=new BiTreeNode('D');
		BiTreeNode c=new BiTreeNode('C',d,null);
		BiTreeNode a=new BiTreeNode('A',b,c);
       return new BiTree(a);
	}	
	public static void main(String[] args) {
DebugBiTree debugBiTree=new DebugBiTree();
BiTree biTree=debugBiTree.createBiTree();
BiTreeNode root=biTree.root;
System.out.println("(递归)先根遍历序列为：");
biTree.preRootTraverse(root);
System.out.println();
biTree.countNode(root);
System.out.println("结点的个数为："+biTree.countNode(root));
biTree.getChildSize(root);
System.out.println("叶子结点的个数为："+biTree.getChildSize(root));
	
		
	}

	}
	

