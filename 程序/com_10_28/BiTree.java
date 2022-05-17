package com_10_28;
	public class BiTree {
		BiTreeNode root;
		public BiTree(){
			this.root=null;
		}
		public BiTree(BiTreeNode root){
			this.root=root;
		}	
		 
		public void preRootTraverse(BiTreeNode T){
			if(T!=null){
				System.out.print(T.date);
				preRootTraverse(T.lchild);
				preRootTraverse(T.rchild);
			}
			}
		public int countNode(BiTreeNode T){
			 int count=0;
			 if(T !=null){
				 ++count;
			  count +=countNode(T.lchild);
			  count +=countNode(T.rchild);
			 }
			 return count;
			}
		  public int getChildSize(BiTreeNode root){//把左子树和右子树上的叶子结点加起来的和就是叶子结点的总数
		        if(root==null){
		            return 0;
		        }
		        if(root.lchild==null&&root.rchild==null){
		            return 1;
		        }else{
		            return getChildSize(root.lchild)+getChildSize(root.rchild);//如果它有左右子树，那它一定不是叶子结点
		        }
		    }
			public void preRootTraverse(){
				BiTreeNode T=root;
				if(T!=null){
					LinkStack S=new LinkStack();
					S.push(T);
					while(T!=null){
						if(T.lchild!=null)
							System.out.println(T.lchild.date);
						if(T.rchild!=null)
							S.push(T.rchild);
						T=T.lchild;
					}

						}
				
			}
		}