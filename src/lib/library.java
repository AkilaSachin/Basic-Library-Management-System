/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Akila Jayasinghe
 */
public class library implements Serializable{
    private setofbooksclass holdings;
    private setofmembersclass theMembers;
    private static library lib;
    
    
    private library(){
        holdings =new setofbooksclass();
        theMembers = new setofmembersclass();
    }
    
    public setofbooksclass getHoldings(){
        return holdings;
    }
    
    public setofmembersclass getMembers(){
        
        return theMembers;
    }
    
    public static library getlibrary(){
        
        return lib;
        
    }
    
    public static void write(String filename){
        try {
            FileOutputStream fil=new FileOutputStream(filename);
            ObjectOutputStream oo=new ObjectOutputStream(fil);
            oo.writeObject(lib);
            fil.flush();
            fil.close();
        } catch (Exception e) {
            System.out.println("write "+ e);
        }

    }
    
    public static boolean read(String filename){
        try {
            FileInputStream fil=new FileInputStream(filename);
            ObjectInputStream oo=new ObjectInputStream(fil);
            Object obj= oo.readObject();
            
            fil.close();
            if(library.class.equals(obj.getClass())){
                lib = (library) obj;
                return true;
            }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

        lib =new library();
        return false;
    }
    
}
