package challenges.task1;

public class Book {
    //static variables
    static int totalNoOfBooks;
    //instance variable
    String title;
    String author;
    String isbn;
    boolean isBorrowed;



    static {
        totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++; //object Init
    }
      static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    //constructor
    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    //instance methods

     void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
           this.isBorrowed=true;
            System.out.println("Enjoy the book"+this.title);
    }}
     void returnBook(){
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed,please leave a review.");
        }else{
                System.out.println("this book is already in the library.");
            }

        }

    public static void main(String[] args) {
        Book designOfThings=new Book("1","Design","Author");
        Book myBook=new Book("1");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }

    }

