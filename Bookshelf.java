import java.util.ArrayList;

public class Bookshelf
{
    private ArrayList<Novel> books= new ArrayList<Novel>();

    public Bookshelf()
    {
        String [] eragon={"Eragon", "Eldest", "Brisinger", "Inheritance"};
        String [] mortal={"City of Bones", "City of Ashes", "City of Glass", "City of Fallen Angels", "City of Lost Souls", "City of Heavenly Fire"};
        String [] heir={"Warrior Heir", "Wizard Heir", "Dragon Heir", "Enchanter Heir", "Sorcerer Heir"};
        String [] hitman={"Hitman"};
        books.add(new Novel("Eragon", 20, 450, 3, 19.99, false, false, true, 20, true, true, eragon));
        books.add(new Novel("City of Fallen Angels", 34, 400, 2, 12.99, false, false, false, 10, false, true, mortal));
        books.add(new Novel("Hitman", 25, 250, 30, 11.99, true, false, false, 5, false, false, hitman));
        books.add(new Novel("Wizard Heir", 100, 320, 40, 9.99, true, true, true, 10, true, true, heir));

    }//zero arg constructor

    public void addNewBook(Novel newOne)
    {
        books.add(newOne);
    }//add a new book to bookshlef

    public void hateBook(Novel book)
    {
        books.remove(book);
    }//remove a book

    public ArrayList organizeLength()
    {
        ArrayList<Integer> output= new ArrayList<Integer>();
        int index=0;
        int first=0;
        int max=0;
        for(int index1 = 0; index1<books.size(); index1++)
        {
            while(index<books.size())
            {

                first=books.get(index1).getLength();

                if(first>max)
                {
                    max=first;
                }
                index1++;
            }

            output.add(max);
        }
        return output;
    }

    public void giveAway(Novel book)
    {
        if(book.getOwn()==true && book.getIsBookFunny()==false)
        {
            books.remove(book);
        }
    }//get rid of bad book

    public String toString()
    {
        String output = new String();

        output= "The books on the bookshelf are: \n";

        for(Novel book: books)
        {
            output+= book + "\n";
        }

        return output;
    }//end toString
}//end class Bookshelf

