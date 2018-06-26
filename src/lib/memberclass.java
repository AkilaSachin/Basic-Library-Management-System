/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.io.Serializable;

/**
 *
 * @author Akila Jayasinghe
 */
public class memberclass implements Serializable{
    private String name="";
    private int memberNumber;
    private setofbooksclass currentLoans ;
//    private static int memberCount = 0;
    
    public memberclass(String aName,int memnum){
     name = aName;
     memberNumber = memnum;
     currentLoans = new setofbooksclass();
    }

    public String toString(){
        return Integer.toString(memberNumber) + " " + name;
        
    }

    public void borrowBook(Bookclass aBook){
        
         aBook.setCurrentBorrower(this );
        currentLoans.addBook(aBook);
        
       
    }
    
    public void returnBook(Bookclass bBook,memberclass m){
       m.currentLoans.removeBook(bBook);
        bBook.setCurrentBorrower(null);

               
       

    }

    public int getmemnum(){
        return memberNumber;
    }
    
   public String getmembername(){
       return name;
   }
    
    public setofbooksclass getBooksOnLoan(){
        return currentLoans;
    }
    
    
}
