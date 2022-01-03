// ONLINE LIBRARY
package com.company;
import java.util.Scanner;
class OnlineLibraryyy
{
    public String [] AvailableBooks; // array to store available books
    public String [] ISSUEDBOOKS; // array to store issued books
    public int current,count;
    OnlineLibraryyy()
    {
        AvailableBooks= new String[10];
        ISSUEDBOOKS= new String[10];
        AvailableBooks[0]=" SOFTWARE ENGINEERING";
        AvailableBooks[1]=" DATA MINING";
        AvailableBooks[2]=" MACHINE LEARNING";
        AvailableBooks[3]=" DATA STRUCTURES";
        AvailableBooks[4]=" ARTIFICIAL INTELLIGENCE";
        current=5;
        count=-1;
    }
    int present(String b)   // present method to check is book present in the librarry
    {
        int index=-1;
        String a=b.replaceAll("\\s", "");  // vanishing spaces for comparing strings smoothly
        for(int i=0; i<current;i++)     // looping in Available array to find the book
        {
            String b2=AvailableBooks[i].replaceAll("\\s", ""); // avoiding spaces in availablle array books
            if(a.equals(b2)) {       // if both are equal that is match is found then
                 index=i;       // store the index of the book
                break;
            }

        }
        return index;     // return index
    }
    boolean ISSUREBOOK(String book)     // method for issuence of a book
    {
        int x=present(book);     // first to check weather the book is available or not so calling present method
        if(x!=-1)     // if book is  not their then is will be true
        {
            ISSUEDBOOKS[++count]=book; // first copying the book into issued array to keep the record

            AvailableBooks[x]="Issued";     // after issuence changing books location with issued sign to indicate the book is issued
            current--;        // decrement the current that indicates number of books available
            return  true;

        }
        else
            return false;      // returning false if book is not present
    }
    boolean ReturnBook(String book)      // method for returning the book
    {
        for (int i=0 ; i<=count; i++)    // first looping in issued array to check weather the book has been issued or not
        {
            if(book.equals(ISSUEDBOOKS[i]))    // if book is issued then match will be found
            {
                for (int j=0;j<current;j++) {     // looping in available array of books to insert the return book back
                    if (AvailableBooks[j] == "Issued")      // if issused found then assign the book over there
                        AvailableBooks[j] = book;    //assignment of issued book
                }
                current++;   // incrementing the count
                return true;

            }

        }
        return false;    // if book is not issued then it will return false
    }
    boolean AddBook(String book, String name , String password)    // Adding book only authorised users can add
    {
        if(name.equals("waseem") && password.equals("1234")) { // matching entered password and name
            AvailableBooks[current++] = book; // adding book to available array
            return true;
        }
        else
            return false; // if match not found
    }
    boolean SearchBook(String book)    //  searching book in the library
    {
        int x=present(book); // calling parenst method for checking
        if(x==-1) // if book is not present
            return false;
        else
            return true;
    }
    void ShowAvailableBooks()   // showing available books
    {
        if(current!=0) {   // if there are no books present in the array that means current will be containg 0 value
            System.out.println("Avaliable books");
            for (int i = 0; i < current; i++) {     // looping in available array of books
                if (!(AvailableBooks[i] == "Issued"))    // showing only available books and skipping issued once
                    System.out.println(AvailableBooks[i]);
            }
        }
        else
            System.out.println("SORRY NO BOOKS AVAILABLE RIFHT NOW");  // if current is 0 that is no books available
    }


}
public class OnlineLibraryy{

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        OnlineLibraryyy obj=new OnlineLibraryyy();    // creating object
        System.out.println("WELCOME TO THE LIBRARY");
        int x=-1,y,t=1;
        while (true){     // infinite loop to show all optiojs to customer
            System.out.println("Enter 1 for ADDBOOK" +"\n"+
                    "Enter 2 for ISSUEBOOK"
                    +"\n"+ "Enter 3 for RETURNBOOK" +"\n"+
                    "Enter 4 for SEE AVALIABLE BOOKS" + "\n"+
                    "Enter 5 to SEARCH ANY BOOK " + "\n"+
                    "Enter anyother number to EXIT");
            y=scan.nextInt();  // value of y will decide which method will be called depending upon the user
            if(y==1) {
                System.out.println(" Please Enter the Book name you want to Add");
                scan.nextLine();
                String book1=scan.nextLine();
                String bookk= book1.toUpperCase();
                System.out.println("PLEASE ENTER YOUR NAME");
//                scan.nextLine();
                String NAME= scan.nextLine();
                System.out.println("PLEASE ENTER YOUR PASSWORD");
//                scan.nextLine();
                String password= scan.nextLine();
                if(!obj.AddBook(bookk,NAME,password))
                    System.out.println("SORRY YOUR PASSWORD OR NAME IS WRONG TRY AGAIN");
                else
                System.out.println("BOOK ADDEDD SUCESSFULLY");
            }
            else if(y==2)
            {

                System.out.println(" Please Enter the Name of the Book ");
                scan.nextLine();
                 String book12=scan.nextLine();
//                String book12= " data mining";

                boolean bool=obj.ISSUREBOOK(book12.toUpperCase());
                if(bool==false)
                    System.out.println("THIS BOOOK IS NOT AVAILABLE  RIGHT NOW");
                else
                    System.out.println("BOOK ISSUED SUCCESSFULLY");
            }
            else if(y==3)
            {
                System.out.println(" Please Enter the Name of the Book ");
                scan.nextLine();
                String book12=scan.nextLine();
                String bookk= book12.toUpperCase();
                if(!obj.ReturnBook(bookk))
                    System.out.println(" SORRY THIS BOOK WAS NOT ISSUED");
                else
                    System.out.println("RETURN SUCCUSSFULL");
            }
            else if(y==4)
            {
                obj.ShowAvailableBooks();
            }
            else if (y==5)
            {
                System.out.println(" Please Enter the Name of the Book ");
                scan.nextLine();
                String book12=scan.nextLine();
//                String book12= " data mining";

                boolean bool=obj.SearchBook(book12.toUpperCase());
                if(bool==false)
                    System.out.println("SORRY THIS BOOOK IS NOT AVAILABLE  RIGHT NOW");
                else
                    System.out.println("BOOK IS AVAILABLE");
            }
            else {
                System.out.println("EXIT SUCCESSFULL");
                System.exit(0);
            }

        }


    }
}

