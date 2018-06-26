/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Akila Jayasinghe
 */
public class setofbooksclass implements Serializable {
    
    private ArrayList<Bookclass> books;
    
    setofbooksclass bookset=null;
    Bookclass book=null;
    
    public setofbooksclass(){

        books=new ArrayList<>();
    }
    
    public int getSize(){
        return books.size();
    }

    public void addBook(Bookclass Book){
        books.add(Book);
        
    }
    
    public void removeBook(Bookclass Book){
        books.remove(Book);
       
    }
    
    Bookclass findbookbyauthor(String auth){
        for(Bookclass boook:books){
                if(auth.equals(boook.getauth())){
                    return boook;
                }
            }
                        return null;
    }
    
    Bookclass findbookbytitle(String title){
        for(Bookclass boook:books){
                if(title.equals(boook.gettitle())){
                    return boook;
                }
            }
                        return null;
      
           
    }
    
    Bookclass findbookfromaccnum(int acc){
        for(Bookclass boook:books){
                if(acc == boook.getacc()){
                    return boook;
                }
            }
                        return null;
      
           }
    
    Bookclass findbookfromISBN(int isbn){
        for(Bookclass boook:books){
            Integer i=new Integer(boook.getISBN());
                if(isbn == i){
                    return boook;
                }
            }
                        return null;
    }
    
 
    
    public Bookclass[] getallbooks(){
        return books.toArray(new Bookclass[0]);
    }
}
