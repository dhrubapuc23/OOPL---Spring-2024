package practiceB2;
import java.util.Scanner;
class Book{
	int isbn,page,year;
	String name;
}

public class BookInformation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		System.out.println("How many books?");
		N = input.nextInt();
		Book[] books = new Book[N+1];
		for(int i=0;i<N;i++)
		{
			System.out.println("Information for Book "+(i+1));
			Book obj = new Book();
			obj.isbn = input.nextInt();
			input.nextLine();
			obj.name = input.nextLine();
			obj.page = input.nextInt();
			obj.year = input.nextInt();
			books[i] = obj;
		}
		System.out.println("Output-Book information:  ");
		for(int i=0;i<N;i++)
		{
			System.out.println("Information for Book "+(i+1));
			System.out.println("ISBN Number: "+books[i].isbn);
			System.out.println("Name: "+books[i].name);
			System.out.println("Page "+books[i].page);
			System.out.println("Year: "+books[i].year);
		}
		
		

	}

}
