package com.company;
class librarybooks{
    String books[];
    int noofbooks;
    librarybooks()
    {
        this.books=new String[100];
        noofbooks=0;
    }
    public void addbook(String b)
    {
        this.books[noofbooks]=b;
        noofbooks++;
        System.out.println(b+" "+"has been added");
    }
    public void showavailablebooks()
    {
        for(String elements:books)
        {
            if(elements==null)
            {
                continue;
            }
            System.out.println("* "+elements);
        }
    }
    public void issuebook(String book)
    {
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println("this book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
    void returnbook(String book)
    {
        addbook(book);
    }
}

public class lib {
    public static void main(String[] args) {
        librarybooks ob=new librarybooks();
        ob.addbook("HARRY POTTER");
        ob.addbook("C++");
        ob.addbook("LORD OF THE RINGS");
        ob.showavailablebooks();


        ob.issuebook("C++");
        ob.showavailablebooks();
        ob.returnbook("C++");
        ob.showavailablebooks();
    }
}
