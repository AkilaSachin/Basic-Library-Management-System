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
public class Bookclass implements Serializable{
    private String ISBN;
    private String title;
    private String Author;
    private memberclass borrower = null;
    private int accessionNumber;
    private boolean Availability;
    
    
    public Bookclass(String name,String Isbn,String author,int Accesionnum){
        title = name;
        ISBN =Isbn;
        Author=author;
        accessionNumber = Accesionnum;
        Availability=true;
    }

   public void setCurrentBorrower(memberclass Borrower) {
        borrower = Borrower;
    }
    void setavailability(String check ){
        if("add".equals(check)){
            Availability=false;
        }
        else{
            Availability=true;
        }
    }

    memberclass getBorrower() {
        return borrower;
    }
    
    public String toString(){
        return Integer.toString(accessionNumber) + " " + title;
        
    }
    
    public boolean isOnLoan(){
        if(Availability==false){
            return true;
        }            
        else{
            return false;
        }
    }
    
    public boolean getAvailability(){
        return Availability;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public String gettitle(){
        return title;
    }
    
    public String getauth(){
        return Author;
    }
    
    public int getacc(){
        return accessionNumber;
    }
}
