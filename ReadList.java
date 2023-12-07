/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aurin.library;

/**
 *
 * @author SK
 */
public class ReadList {
   private int userno;
    
     public ReadList()
    {
        
    }
    public ReadList(int userno)
    {
        this.userno=userno;
    }
    public int getUserno()
    {
        return userno;
    }
    public void setUsernO(int userno)
    {
        this.userno=userno;
    }
    
    public void BookList(Book[]books){
        String bookIDString = "";
        
        
        for(int i=0; i<books.length;i++)
        {
            
            bookIDString +=books[i].getBookID() +"";
        }
        if(bookIDString.length()>30)
        {
            System.out.println("Cannot add so many books");
        }else{
            System.out.println(bookIDString);
        }
        
    }
    
    
}