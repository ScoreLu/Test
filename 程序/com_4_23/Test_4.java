package com_4_23;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

		@SuppressWarnings("unused")
		public class Test_4 {

		@SuppressWarnings({ "rawtypes", "unchecked" })


		public static void main(String[] args) {
				// TODO Auto-generated method stub
				List<Book> list = new ArrayList();
				Book b1 = new Book(" 《水浒传》 ",1, "", "施耐庵");
				Book b2 = new Book(" 《三国演义》",2, "", "罗贯中");
				Book b3 = new Book(" 《西游记》 ",3, "", "吴承恩");
				Book b4 = new Book(" 《红楼梦》 ",4, "", "曹雪芹");
				Book b5 = new Book("  《Java》 ",  5, "", "钟南山");
				list.add(b1);
				list.add(b2);
				list.add(b3);
				list.add(b4);
				list.add(b5);
				// 对链表进行排序
				Collections.sort(list, new SortByPrice());
				System.out.println(list);
				System.out.println("遍历ArrayList隔行输出每个Book对象:");
				for (Book book : list) {
				System.out.print(book.getName()+"\t"+book.getPrice()+"\t"+book.getPress()+"\t"+book.getAuthor()+"\n"); }
				 
			}

		}

		class Book {
			private String name;
			private int price;
			private String press;// 出版社
			private String author;

			@Override
			public String toString() {
				return "[书名：" + name + " 价格：" + price + "出版社：" + press + " 作者：" + author + "]";
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getPrice() {
				return price;
			}

			public void setPrice(int price) {
				this.price = price;
			}

			public String getPress() {
				return press;
			}

			public void setPress(String press) {
				this.press = press;
			}

			public String getAuthor() {
				return author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public Book(String name, int price, String press, String author) {
				super();
				this.name = name;
				this.price = price;
				this.press = press;
				this.author = author;
			}
		}

		@SuppressWarnings("rawtypes")
		// 想排序先实现Comparator接口
		class SortByPrice implements Comparator {
			public int compare(Object o1, Object o2) {
				if (((Book) o1).getPrice() > ((Book) o2).getPrice()) {
					return 1;
				}
				return 0;
			}

		}
