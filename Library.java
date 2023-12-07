/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aurin.library;

/**
 *
 * @author SK
 */
public class Library {

    public static void main(String[] args) {
        Book[] booksArray = new Book[3];
        booksArray[0]=new Book(10156756);
        booksArray[1]=new Book(3033424);
        booksArray[2]=new Book(40421456);
        
        ReadList readList = new ReadList(123);
        readList.BookList(booksArray);
    }
}
