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
System.out.println("(�ݹ�)�ȸ���������Ϊ��");
biTree.preRootTraverse(root);
System.out.println();
biTree.countNode(root);
System.out.println("���ĸ���Ϊ��"+biTree.countNode(root));
biTree.getChildSize(root);
System.out.println("Ҷ�ӽ��ĸ���Ϊ��"+biTree.getChildSize(root));
	
		
	}

	}
	

