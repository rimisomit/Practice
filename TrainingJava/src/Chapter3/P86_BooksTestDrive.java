package Chapter3;

public class P86_BooksTestDrive {
	public static void main(String[] args) {
		P86_Books[] myBooks = new P86_Books[3];
		myBooks[0] = new P86_Books();
		myBooks[1] = new P86_Books();
		myBooks[2] = new P86_Books();
		int x = 0;
		myBooks[0].title = "title1";
		myBooks[1].title = "title2";
		myBooks[2].title = "title3";
		myBooks[0].author = "author1";
		myBooks[1].author = "author2";
		myBooks[2].author = "author3";
		
		while(x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x++;
		}

	}

}
