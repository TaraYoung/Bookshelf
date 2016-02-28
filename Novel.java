public class Novel
{
    private String title;
    private int chapters;
    private int length;
    private int page;
    private double price;
    private boolean isOpen;
    private boolean bookInHand;
    private boolean isBookFunny;
    private int excerpt;
    private boolean own;
    private boolean partSeries;
    private String [] series =new String[4]; 

    public Novel()
    {
        title="Breaking Dawn";
        chapters=50;
        length=350;
        page=0;
        price=14.99;
        isOpen=true;
        bookInHand=true;
        isBookFunny=false;
        excerpt=50;
        own=false;
        partSeries=true;
        series[0]="Twilight";
        series[1]="New Moon";
        series[2]="Eclipse";
        series[3]="Breaking Dawn";
    }//zero arg constructor-best book EVA!

    public Novel(String title, int chapters, int length, int page, double price, boolean isOpen, boolean bookInHand, boolean isBookFunny, int excerpt, boolean own, boolean partSeries, String [] series)
    {
        this.title=title;
        this.chapters=chapters;
        this.length=length;
        this.page=page;
        this.price=price;
        this.isOpen=isOpen;
        this.bookInHand=bookInHand;
        this.isBookFunny=isBookFunny;
        this.excerpt=excerpt;
        this.own=own;
        this.partSeries=partSeries;
        this.series=series;
    }//multi arg constructor-make your own book

    public void Open()
    {
        isOpen=true;
    }//YAY! story time-open the book of wonders

    public void Close()
    {
        isOpen=false;
    }//I'm done for now-close

    public void setNewTitle(String title)
    {
        this.title=title;
    }//lets change the title

    public String getTitle()
    {
        return title;
    }//find out what it is called-Don't Judge a Book by Its Cover!

    public int getLength()
    {
        return length;
    }

    public void purchase()
    {
        own=true;
    }//buy book

    public void setChapters(int chapters)
    {
        this.chapters=chapters;
    }//determine how many chapters you want in the book

    public int getChapters()
    {
        return chapters;
    }//how long is it?

    public void setPrice(double price)
    {
        this.price=price; 
    }//bargain for the book

    public double getPrice()
    {
        return price;
    }//find out how much you must sacrafice in order to enjoy a nice story

    public void turnPage()
    {
        page++;
    }//turn the page one by one as you read

    public void turnTo(int page)
    {
        this.page=page;
    }//turn the book to a certain page-"Turn to page, 394"-Snape

    public int getPage()
    {
        return page;
    }//find the page the book is on

    public void throwBook()
    {
        bookInHand=false;
    }//the book frustrates the reader

    public void laugh()
    {
        isBookFunny=true;
    }//the book makes the reader laugh

    public boolean getOwn()
    {
        return own;
    }

    public boolean getIsBookFunny()
    {
        return isBookFunny;   
    }

    public void read()
    {
        if(own!=true)
        {
            length=excerpt;
        }
    }//only allow to read part of book

    public void useCupon(double cupon)
    {
        price=price-cupon;
    }

    public void bedTime(double time)
    {
        if(time>= 11.00 || time<=6.00)
        {
            isOpen=false;
        }
    }//close the book if it is bedtime

    public boolean partSeries()
    {
        int counterSeriesBooks=0;
        for(String series: series)
        {
            if(series==null)
            {
                counterSeriesBooks++;
            }
        }

        if(counterSeriesBooks==3)
        {
            partSeries=false;
        }

        return partSeries;
    }//find if book is part of a series

    public String toString()
    {
        String output= new String();

        output="The title is " + getTitle() +". \n" +
        "The book has " + getChapters() + " chapters and is " + length + " pages long. \n" +
        "It costs " + getPrice() + " dollars. \n" +
        "It is " + partSeries() + " that the book is part of a series. \n" +
        "Currently, it is " + bookInHand + " that the book is in the reader's hand and it is on page " + getPage() + ".\n" +
        "The books in the series are: \n";

        for(int index=0; index<series.length; index++)
        {
            output+= series[index] + "\n";
        }

        return output;

    }//end toString

}//end class Novel


