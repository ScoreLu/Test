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
		  public int getChildSize(BiTreeNode root){//�����������������ϵ�Ҷ�ӽ��������ĺ;���Ҷ�ӽ�������
		        if(root==null){
		            return 0;
		        }
		        if(root.lchild==null&&root.rchild==null){
		            return 1;
		        }else{
		            return getChildSize(root.lchild)+getChildSize(root.rchild);//���������������������һ������Ҷ�ӽ��
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