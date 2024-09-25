package com.company;
class library{
    String books[];
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addbooks(String book)
    {
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" "+"has been added");
    }
    void showavailablebooks()
    {
        System.out.println("available books are:");
        for(String elements:this.books)
        {
            if(elements==null)
            {
                continue;
            }
            System.out.println("* "+elements);
        }

    }
    void issuebooks(String book) {
        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i].equals(book))
            {
                System.out.println("the book has been issued");
                this.books[i] = null;
                return;
            }

        }

        System.out.println("this book does not exist");



        }
        void returnbook(String book)
        {
            addbooks(book);
        }
    }

public class excercise_4cwh {
    public static void main(String[] args) {
        library clibrary = new library();
        clibrary.addbooks("HARRY POTTER THE CHAMBER OF SECRETS");
        clibrary.addbooks("JAVA APC");
        clibrary.addbooks("C PROGRAMMING");
        clibrary.showavailablebooks();


        clibrary.issuebooks("C PROGRAMMING");
        clibrary.showavailablebooks();
        clibrary.returnbook("C PROGRAMMING");
        clibrary.showavailablebooks();
    }
}
