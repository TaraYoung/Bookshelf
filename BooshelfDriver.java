import java.util.Scanner;
public class BooshelfDriver
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        Bookshelf books= new Bookshelf();
        System.out.println(books);

        System.out.print("Let's create a book. What do you want it to be called? ");
        String title=input.nextLine();
        System.out.print("How many chapters does it have? ");
        int chapters=input.nextInt();       
        System.out.print("How many pages long is it? ");
        int length=input.nextInt();   
        System.out.print("What page is it currently on? (Only answer with page numberes that are in the book):  ");
        int page=input.nextInt();   
        System.out.print("How much does it cost in dollars? ");
        double cost=input.nextDouble();   
        System.out.print("Is the book currently open? true or false (copy exactly): ");
        boolean isOpen=input.nextBoolean();   
        System.out.print("Is the book currently in your hands? true or false (copy exactly): ");
        boolean bookInHand=input.nextBoolean();   
        System.out.print("Is the book funny? true or false (copy exactly): ");
        boolean isBookFunny=input.nextBoolean();   
        System.out.print("How many pages long is the excerpt? ");
        int excerpt=input.nextInt();   
        System.out.print("Do you own the book? true or false (copy exactly): ");
        boolean own=input.nextBoolean();   
        System.out.print("Is the book part of a series? true or false (copy exactly): ");
        boolean partSeries=input.nextBoolean();
        System.out.println("How many books are in the series? If part of a series is false: Enter 1: ");
        int seriesLength=input.nextInt();
        String [] series = new String[seriesLength];
        if(partSeries==true)
        {
            int index=0;
            int bookNum=1;

            do{
                input.nextLine();
                System.out.println("Book " + bookNum + " in the series is called (Hit enter twice after inputting the book's name): ");
                series[index]=input.nextLine();
                index++;
                bookNum++;

            }
            while(index< series.length);
            System.out.println(series);
        }
        else
        {
            series[0]=title;
        }//fill array of the books in the series

        Novel newBook = new Novel(title, chapters, length, page, cost, isOpen, bookInHand, isBookFunny, excerpt, own, partSeries, series);
        System.out.println(newBook);
        books.addNewBook(newBook);

        System.out.println("What page would you like to turn to? (Only answer with page numberes that are in the book) ");
        int pageTurn=input.nextInt();
        newBook.turnTo(pageTurn);
        System.out.println("The book is on page: " +newBook.getPage());
        System.out.println();

        System.out.println("Is it true or false that you want to organize the bookshelf by book length? (type true or false exactly): ");
        boolean alpha=input.nextBoolean();
        if(alpha==true)
        {
            books.organizeLength();
            System.out.println("The organized on the bookshelf in order are : \n" + books);
        }
        else
        {
            System.out.println("Okay, we won't reorganize the bookshelf.");
        }

    }//end main method
}//end class Driver
